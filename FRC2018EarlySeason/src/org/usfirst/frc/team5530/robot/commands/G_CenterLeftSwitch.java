package org.usfirst.frc.team5530.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class G_CenterLeftSwitch extends CommandGroup{
	
	public G_CenterLeftSwitch() {
		addParallel(new ElevatorMid());
		addSequential(new DriveForward(115));
		addSequential(new Pause(.5));
		addSequential(new Deliver());
		addParallel(new ElevatorBot());
		addSequential(new DriveForward(-110));
//		addSequential(new DriveOneForward(40,"l"));
//		addSequential(new DriveForward(50));
	}
	
}