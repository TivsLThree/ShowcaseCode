
package org.usfirst.frc.team1557.robot;

import org.usfirst.frc.team1557.robot.commands.MoveMotor;
import org.usfirst.frc.team1557.robot.subsystems.MoveMotorSystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	// Creating an instance of the MoveMotorSubsystem to reference within the
	// MoveMotor command.
	public static MoveMotorSystem mmSystem = new MoveMotorSystem();

	// A simple way to control a command is to create an instance of it and call
	// the start and stop methods that all commands automatically have.
	MoveMotor mmCommand = new MoveMotor();

	public void robotInit() {
	}

	// This method is called at the beginning(as it INITializes) of the
	// teleoperated period.

	// Teleop for short. (Teleop is the period in which that drivers have
	// control of the robot.)

	public void teleopInit() {
		// Starts the command. Will call the initialize method of that command,
		// then start to call the execute method repeatedly.
		mmCommand.start();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

}
