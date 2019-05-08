/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class InOutTake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static WPI_TalonSRX rightIntakeTalon; 
  public static WPI_TalonSRX leftIntakeTalon; 

  public InOutTake() {
    rightIntakeTalon = new WPI_TalonSRX(RobotMap.rightIntake);
    leftIntakeTalon = new WPI_TalonSRX(RobotMap.leftIntake); 
  }

  public void intake(double speed) {
    rightIntakeTalon.set(speed); 
    leftIntakeTalon.set(-speed); 
  }

  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
