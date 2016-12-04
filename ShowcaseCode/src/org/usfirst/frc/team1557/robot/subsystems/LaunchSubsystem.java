package org.usfirst.frc.team1557.robot.subsystems;

import org.usfirst.frc.team1557.robot.commands.LaunchCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LaunchSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new LaunchCommand());
	}

	/*
	 * We are creating the following two methods to start and stop the function
	 * of the button. Currently, we don't know how our imaginary launcher will
	 * physically work. Since we don't know what the methods need to do, we have
	 * yet to fill them with code.
	 */
	public void start() {

	}

	public void stop() {

	}
}
