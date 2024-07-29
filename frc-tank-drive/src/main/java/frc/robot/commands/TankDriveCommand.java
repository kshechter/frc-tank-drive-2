// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveBase;

public class TankDriveCommand extends Command {
  /** Creates a new TankDriveCommand. */
  private final DriveBase driveBase;
  private final DoubleSupplier left_speed;
  private final DoubleSupplier right_speed;
  public TankDriveCommand(DriveBase driveBase, DoubleSupplier left_speed, DoubleSupplier right_speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveBase = driveBase;
    this.left_speed = left_speed;
    this.right_speed = right_speed;
    addRequirements(driveBase);
  }

  public TankDriveCommand(DriveBase driveBase, double left_speed, double right_speed) {
    this.driveBase = driveBase;
    this.left_speed = ()->left_speed;
    this.right_speed = ()->right_speed;
    addRequirements(driveBase);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBase.tankDrive(left_speed.getAsDouble(), right_speed.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBase.stopDrive();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
