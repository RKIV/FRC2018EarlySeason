package org.usfirst.frc.team5530.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class G_CenterRightSwitch extends CommandGroup{
	
	public G_CenterRightSwitch() {
		addSequential(new DriveOneForward(60, "l"));
		addParallel(new ElevatorMid());
		addSequential(new DriveForward(90));
		addSequential(new Pause(.5));
		addSequential(new Deliver());
		addParallel(new ElevatorBot());
		addSequential(new DriveForward(-110));
//		addSequential(new DriveOneForward(40,"r"));
//		addSequential(new DriveForward(50));
	}
	
}