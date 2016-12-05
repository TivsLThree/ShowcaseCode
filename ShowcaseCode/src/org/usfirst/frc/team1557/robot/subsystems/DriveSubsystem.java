package org.usfirst.frc.team1557.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	/*
	 * This starts the same way as a normal tankdrive scheme. We still create 4
	 * motor controllers. One for each motor/wheel.
	 * 
	 */
	CANTalon frontRight = new CANTalon(0);
	CANTalon rearRight = new CANTalon(0);
	CANTalon rearLeft = new CANTalon(0);
	CANTalon frontLeft = new CANTalon(0);

	public DriveSubsystem() {
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
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
	void mecanumDrive(double x, double y, double r) {

	}
}
