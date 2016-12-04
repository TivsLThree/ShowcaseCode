package org.usfirst.frc.team1557.robot.commands;

import org.usfirst.frc.team1557.robot.OI;
import org.usfirst.frc.team1557.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LaunchCommand extends Command {

	public LaunchCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.launch);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		/*
		 * Here, we are saying that if the launchButton is being pressed,
		 * launch. Else (any condition other than the launch button being
		 * pressed, and the only other condition possible is it not being
		 * pressed), do not launch.
		 */
		if (OI.launchButton.get()) {
			Robot.launch.start();
		} else {
			Robot.launch.stop();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		/* We are also saying to stop the function here, just in case. */
		Robot.launch.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}

}
