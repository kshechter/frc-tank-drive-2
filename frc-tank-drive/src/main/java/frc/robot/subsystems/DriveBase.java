// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBase extends SubsystemBase {
  /** Creates a new DriveBase. */
  private final TalonFX left_front_motor;
  private final TalonFX right_front_motor;
  private final TalonFX left_back_motor;
  private final TalonFX right_back_motor;
  private final DifferentialDrive steering;
  public DriveBase(int left_front_ID, int right_front_ID, int left_back_ID, int right_back_ID) {
    this.left_front_motor = new TalonFX(left_front_ID);
    this.right_front_motor = new TalonFX(right_front_ID);
    this.left_back_motor = new TalonFX(left_back_ID);
    this.right_back_motor = new TalonFX(right_back_ID);
    Follower follower = new Follower(left_front_ID,false);
    Follower follower2 = new Follower(right_front_ID, false);
    left_back_motor.setControl(follower);
    right_back_motor.setControl(follower2);
    this.steering = new DifferentialDrive(left_front_motor, right_front_motor);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void tankDrive(double left_speed, double right_speed) {
    steering.tankDrive(left_speed, right_speed);
  }

  public void stopDrive() {
    steering.stopMotor();
  }
}

