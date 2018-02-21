package org.usfirst.frc.team5530.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team5530.robot.subsystems.ArmSS;
import org.usfirst.frc.team5530.robot.subsystems.ElevatorSS;
import org.usfirst.frc.team5530.robot.*;

import com.ctre.phoenix.motorcontrol.*;
//This command turns the motors to move the arm to the top of the elevator

public class ElevatorBot extends Command{
	
	public ElevatorBot() {
		requires(Robot.elevatorSS);
		requires(Robot.armSS);
	}
	
	protected void initialize() {
		ElevatorSS.setFollowing();
		ElevatorSS.Elevator0.set(ControlMode.PercentOutput, 0);
		Timer.delay(0.1); //There is a small pause after button press
	}

	protected void execute() {
		ElevatorSS.Elevator0.set(ControlMode.PercentOutput, -.15); 
	}
	protected boolean isFinished() {
		if(!ElevatorSS.elevatorSwitchBot.get())return true;						//If the Elevator is at the bottom Stop the command
		return false; 
	}
	protected void end() {
		ElevatorSS.Elevator0.set(0);
		ElevatorSS.Elevator0.setSelectedSensorPosition(0, 0, 0);
	}
	protected void interrupted() {
		ElevatorSS.Elevator0.set(0);
	}
	
	
	
}
