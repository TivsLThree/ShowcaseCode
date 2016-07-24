package org.usfirst.frc.team1557.robot.commands;

import org.usfirst.frc.team1557.robot.Robot;
import org.usfirst.frc.team1557.robot.subsystems.MoveMotorSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Any class that is intended to be a command must extend the WPILIB Command
 * class. As a result, you must override the initialize, execute, isFinished,
 * end, and interrupted methods.
 * 
 * @author Levi
 *
 */
public class MoveMotor extends Command {
	public MoveMotor() {
		// The requires() method denotes what command owns subsystem. Once a
		// command owns a subsystem, no other command is allowed to use the same
		// subsystem.
		// Generally, the requires command should always be called and called in
		// the first line of the constructor. The subsystem given should refer
		// to an instance of the subsystem created somewhere else. Traditionally
		// done in the Robot class. However, there are other just as viable
		// methods.
		// In order to see the object, it must be both static and public.
		requires(Robot.mmSystem);
	}

	@Override
	protected void initialize() {

	}

	// the execute is automatically scheduled to run repeatedly while the robot
	// is running. This is where most of your subsystem calls will be.

	// TODO: It runs at a speed of either 20 or 50 times a second. I can never
	// remember
	@Override
	protected void execute() {
		// References the subsystem created within the Robot class and calls the
		// setMotorSpeed method within the MoveMotorSystem class.
		Robot.mmSystem.setMotorSpeed(1);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	// The execute method is called when this command stops running. Tieing up
	// loose ends and dealing with potential safety issue should be done here.
	@Override
	protected void end() {
		// A standard safety measure is to set the speeds of all relevant motors
		// back to zero in this method.
		Robot.mmSystem.setMotorSpeed(0);
	}

	@Override
	protected void interrupted() {
		// If you have no special handling for interruptions then it is good
		// practice to call the end method within this method. That is, if you
		// have some form of handling for when the command stops in the end
		// method.
		end();
	}

}
