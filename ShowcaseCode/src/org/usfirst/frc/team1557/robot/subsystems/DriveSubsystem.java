package org.usfirst.frc.team1557.robot.subsystems;

import org.usfirst.frc.team1557.robot.RobotMap;
import org.usfirst.frc.team1557.robot.commands.TankDriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	/*
	 * Here we create the motor controller objects that will control the
	 * physical motor controllers, which control the motors on the robot. We
	 * must have one for every motor on the robot. We are putting the drive
	 * motor controllers here in the DriveSubsystem. The parameter it takes is
	 * an integer describing its port number, which will be defined in the robot
	 * map.
	 */
	CANTalon frontLeft = new CANTalon(RobotMap.driveMotorLeftFrontID);
	CANTalon frontRight = new CANTalon(RobotMap.driveMotorRightFrontID);
	CANTalon rearLeft = new CANTalon(RobotMap.driveMotorLeftRearID);
	CANTalon rearRight = new CANTalon(RobotMap.driveMotorRightRearID);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		/*
		 * Here, we set the default command. This is the DriveSubsystem, so we
		 * put the default drive command. There may be multiple drive commands,
		 * but for now we will set TankDriveCommand to the default.
		 */
		setDefaultCommand(new TankDriveCommand());
	}

	/* 
	 * Here we create a method that sets the motor speeds. Motors on the same
	 * side should be set to the same speed, because of tank drive. (I need to think of a better explanation later).
	 * Certain motor speeds may need to be inverted, depending on how they're wired on the robot.
	 */
	public void setDriveMotorSpeeds(double x, double y) {
		frontLeft.set(x);
		rearLeft.set(x);
		frontRight.set(y);
		rearLeft.set(y);
	}
}
