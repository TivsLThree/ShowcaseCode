package org.usfirst.frc.team1557.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	/*
	 * Here we are creating a Joystick object from the WPILib. This object
	 * represents a physical joystick. We must create an object here for every
	 * physical joystick we use. The parameter it takes is an integer that
	 * represents a port that the physical joystick is plugged into. This
	 * integer is defined in the RobotMap class, so that all of our port IDs are
	 * in one place, making it much easier to change them in the future.
	 */
	public static Joystick driveJoyLeft = new Joystick(RobotMap.driveJoyLeftID);
	public static Joystick driveJoyRight = new Joystick(RobotMap.driveJoyLeftID);

	/*
	 * Here we are creating another joystick object to use functions of the
	 * robot besides driving. Usually our co-driver does everything besides
	 * driving, so we have most of the buttons on another joystick. 
	 * For this example let's pretend our imaginary robot has a launcher feature, and
	 * whenever the launch button is pressed the robot should launch a ball.
	 * Here we are creating a JoystickButton object that we want to be on altJoyOne.
	 */
	public static Joystick altJoyOne = new Joystick(RobotMap.altJoyOneID);
	public static JoystickButton launchButton = new JoystickButton(altJoyOne,RobotMap.launchButtonID);

}
