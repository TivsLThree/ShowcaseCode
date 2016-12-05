package org.usfirst.frc.team1557.robot.commands;

//You can import specific objects/variables so that you do not have to type out the entire name. 
//Just add the name to the end and the STATIC keyword after IMPORT.
//You can also import all static objects from a class by just adding the * to the end.
import static org.usfirst.frc.team1557.robot.OI.joy;
import static org.usfirst.frc.team1557.robot.Robot.driveSub;
import static org.usfirst.frc.team1557.robot.RobotMap.*;

import edu.wpi.first.wpilibj.command.Command;

public class MecanumDriveCommand extends Command {
	public MecanumDriveCommand() {
		requires(driveSub);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		// This section works the same as tank drive would. You just need to add
		// the rotation into the input.
		driveSub.mecanumDrive(joy.getRawAxis(joystickXAxis), joy.getRawAxis(joystickYAxis),
				joy.getRawAxis(joystickZAxis));
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		driveSub.mecanumDrive(0, 0, 0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
