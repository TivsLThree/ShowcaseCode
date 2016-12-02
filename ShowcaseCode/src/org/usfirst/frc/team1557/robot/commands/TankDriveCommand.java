package org.usfirst.frc.team1557.robot.commands;

import org.usfirst.frc.team1557.robot.OI;
import org.usfirst.frc.team1557.robot.Robot;
import org.usfirst.frc.team1557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class TankDriveCommand extends Command {

	public TankDriveCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);

		/*
		 * Here we are requiring the DriveSubsystem by referencing the instance
		 * of it we made in the Robot class.
		 */
		requires(Robot.drive);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		/*
		 * While the TankDriveCommand is being run, we want the
		 * setDriveMotorSpeeds method to constantly be executed, so that we are
		 * constantly relaying what the motor speeds should be. We are setting x
		 * to the axis of the left drive joystick, an y to the axis of the right
		 * drive joystick. This means the values are being controlled by the
		 * joysticks' movements on their (y) axis. Therefore, the further a
		 * joystick is pushed forward, the more that value will increase, and
		 * the faster those motors will go.
		 * The parameters taken in by the getRawAxis method are port numbers defined in RobotMap.
		 */
		Robot.drive.setDriveMotorSpeeds(OI.driveJoyLeft.getRawAxis(RobotMap.leftDriveJoyAxisID),OI.driveJoyRight.getRawAxis(RobotMap.rightDriveJoyAxisID));
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
