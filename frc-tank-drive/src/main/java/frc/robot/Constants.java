// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final int joystickLeftAxis = 1;
    public static final int joystickRightAxis = 1;
    public static final int intakeButton_ID = 0;
    public static final double intake_speed = 1;
  }
  public static class DriveConstants {
    public static final int left_front_ID = 0;
    public static final int right_front_ID = 0;
    public static final int left_back_ID = 0;
    public static final int right_back_ID = 0;
    public static final double left_speed = 1;
    public static final double right_speed = 1;
  }
  public static class AutoConstants {
    public static final double auto_time = 2;
  }
  public static class IntakeConstants {
    public static final int intake_motor_ID = 2;
  }
}
