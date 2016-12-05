package org.usfirst.frc.team1557.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import static org.usfirst.frc.team1557.robot.RobotMap.*;

import org.usfirst.frc.team1557.robot.commands.MecanumDriveCommand;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	/*
	 * This starts the same way as a normal tankdrive scheme. We still create 4
	 * motor controllers. One for each motor/wheel.
	 * 
	 */
	CANTalon frontRight = new CANTalon(frontRightTalon);
	CANTalon rearRight = new CANTalon(rearRightTalon);
	CANTalon rearLeft = new CANTalon(rearLeftTalon);
	CANTalon frontLeft = new CANTalon(frontLeftTalon);

	public DriveSubsystem() {
	}

	public void initDefaultCommand() {
		setDefaultCommand(new MecanumDriveCommand());
	}

	/**
	 * However, now we need three inputs to control the robot.
	 * 
	 * @param x
	 *            This is the lateral movement value. Left and right, for
	 *            example. -1 as the maximum left and 1 as the maximum right.
	 * @param y
	 *            This is the longitudal movement value. Forwards and reverse.
	 *            Again, -1 as maximum reverse and 1 as maximum forwards.
	 * @param r
	 *            This is the rotation value. If we want the robot to turn to
	 *            the right, the value might be anywhere from 0 to 1. Left would
	 *            be -1 to 0.
	 */
	public void mecanumDrive(double x, double y, double r) {
		// *Footnote1*
		/*
		 * There are two main parts of setting the speeds of mecanum wheels.
		 * First, you need to find the speeds for each individual wheel, Then,
		 * you need to normalize the speeds if they exceeded the maximum of 1.
		 */

		// First, add the Y value to all the speeds.
		double fr = y;
		double rr = y;
		double rl = y;
		double fl = y;
		// Then, subtract the X values from one side and add them to other.
		// Subtract from right and to left.
		fr -= x;
		rr -= x;
		rl += x;
		fl += x;
		// Finally, add the rotation value to the front left motor and the rear
		// right motor. Subtract the rotation form the remaining two.
		// *Footnote2*
		fr -= r;
		rr += r;
		rl -= r;
		fl += r;
		// At this point, the speeds of all the motors should work. However,
		// because motor controllers have a maximum of 1, we must make sure no
		// speeds exceed it.
		// First, we must create a variable to keep track of the highest speed.
		// If we find a speed that is higher than 1, than we replace the highest
		// speed.
		double highestValue = 1;
		// This is the same structure for each motor speed. We just need to
		// check them all.
		if (fr > highestValue) {
			highestValue = fr;
		}
		if (rr > highestValue) {
			highestValue = rr;
		}
		if (rl > highestValue) {
			highestValue = rl;
		}
		if (fl > highestValue) {
			highestValue = fl;
		}
		// We now know what the highest value is, we can check to see if it's
		// greater than 1.
		// If it is greater than 1, than we need to reduce the speeds.
		if (highestValue > 1) {
			fr /= highestValue;
			rr /= highestValue;
			rl /= highestValue;
			fl /= highestValue;
		}
		// By dividing all speeds by the highest motor speed, we maintain the
		// ratio of speeds while reducing the maximum. We are scaling all the
		// speeds down.
		// Now, we set the speeds of the motors.
		frontRight.set(fr);
		rearRight.set(rr);
		rearLeft.set(rl);
		frontLeft.set(fl);
	}
}
// 1: There are many ways to reduce this section of code down.
// However, I wrote it this way for the sake of simplicity and readability. You
// can challange yourself by trying to reduce this section to as few lines as
// possible.

// 2: This will only work if the mecanum wheels are set up correct. Unlike,
// normal drive, each wheel must go into its designated spot.
// There is a simple way to tell if the wheels are set up correctly. If you look
// at the robot from the top. Then, the mecanum wheels should look as if they
// form an X crossing the center of the robot.
