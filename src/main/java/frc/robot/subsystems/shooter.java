// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase {
  /** Creates a new shooter. */
  private CANSparkMax shooterMotor;
  public shooter() {
    shooterMotor = new CANSparkMax(11, MotorType.kBrushless);
  }

  public void setMotorSpeed(double speed) {
    shooterMotor.set(speed);
  }
  
  public void stopMotor() {
    shooterMotor.stopMotor();
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
