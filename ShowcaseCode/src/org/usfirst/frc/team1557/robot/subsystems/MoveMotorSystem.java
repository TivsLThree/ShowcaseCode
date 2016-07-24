package org.usfirst.frc.team1557.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Any class that is intended to be a subsystem class must extend the WPILIB
 * Subsystem class. As a result, the class must override the initDefaultCommand
 * method.
 * 
 * @author Levi
 *
 */
public class MoveMotorSystem extends Subsystem {
	// Generally, subsystems should have the bulk of your code.
	@Override
	protected void initDefaultCommand() {

	}
	// Most physical operations that occur on the robot are caused by motors.
	// (Trivia: We mostly use CIM and mini-CIM motors.) As programmers, we can
	// not directly interface with the motors. The motors are electrically
	// connected to motor controllers. We are able to directly communicate with
	// motor controllers. There a few types of Motor Controllers used in FIRST.
	// We use either Talons (or TalonSRXs)or Jaguars. Motor Controllers are
	// connected
	// electronically in one of two different ways. Either CAN or PWM. There is
	// basically no difference in the programming side. You just have to use a
	// different object depending on how they are connected. For example, you
	// would use a CANTalon object for a Talon motor controller connected using
	// CAN. If you were to use a Jaguar motor controller and connect it using
	// PWM you would need to just use a Jaguar object.

	CANTalon motorController = new CANTalon(0);
	// The CANTalon object requires an integer that corresponds with the ID of
	// the motor. As the programmer, it is your responsibility to give the motor
	// controllers their IDs. This is accomplished through other methods out
	// side of programming. Each physical motor controller should be given a
	// different ID.

	// Typically, you will need to create a custom method(function) to interact
	// with your motor controllers in your own special ways.
	// Typically, they will be accessed only within the corresponding command
	// class.
	// Furthermore, they will usually have some form of input variable that will
	// affect the motor.
	/**
	 * 
	 * @param inputValue
	 *            The input value.
	 */
	public void setMotorSpeed(double inputValue) {
		// The method you will be using most often for motor controllers is the
		// set() method. This directly sets the speed of the motor to the input.
		// The speed can range from -1 to 1. -1 being full speed reverse 0 being
		// no movement and 1 being full speed forward.
		motorController.set(inputValue);
	}

}
