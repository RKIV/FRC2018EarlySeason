package org.usfirst.frc.team5530.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.GenericHID.Hand;

import org.usfirst.frc.team5530.robot.subsystems.Drivetrain;
import org.usfirst.frc.team5530.robot.*;

import com.ctre.phoenix.motorcontrol.*;

public class DriveForwardTalonBased extends Command{
	
	public DriveForwardTalonBased() {
		super("DriveForwardTalonBased");
		requires(Robot.drivetrain);
	}
	
		
	
	protected void initialize() {
		Drivetrain.setFollowing();
	}
	//Whenever this command is called, setspeeds is called
	protected void execute() {
		Drivetrain.frontRight.set(ControlMode.Position, 10);
		SmartDashboard.putNumber("Right Sensor Position", Drivetrain.frontRight.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Right Sensor Velocity", Drivetrain.frontRight.getSelectedSensorVelocity(0));
	}
	protected boolean isFinished() {
		
		return true; // maybe true?
	}
	protected void end() {
		
	}
	protected void interrupted() {
		
	}
	
}