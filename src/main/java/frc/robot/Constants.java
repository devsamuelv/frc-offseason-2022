// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  // CANCoder stuff
  public static int frontLeftCANCoderId = 60;
  public static int frontRightCANCoderId = 22;
  public static int backLeftCANCoderId = 21;
  public static int backRightCANCoderId = 20;

  public static int INTAKE_MOTOR_ID = 30;

  // PID stuff
  public static double kMaxAngularSpeed = Math.PI;
  public static double kMaxSpeedMetersPerSecond = 1.0;
  public static boolean kGyroReversed = false;

  // Shooter stuff
  public static final int SHOOTER_LEFT_MOTOR_ID = 44;
  public static final int SHOOTER_RIGHT_MOTOR_ID = 45;
  public static final int SHOOTER_INTAKE_MOTOR_ID = 0;
  public static final double SHOOTER_TARGET_VELOCITY = 500;

  // Drivetrain Stuff
  public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.0508;
  public static final double DRIVETRAIN_WHEELBASE_METERS = 0.813;

  // Front left pod
  public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 3;
  public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 4;
  public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 2;
  public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(35.0);

  // front right pod
  public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 8;
  public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 7;
  public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 4;
  public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(193.0); // Good, 187

  // back left pod
  public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 1;
  public static final int BACK_LEFT_MODULE_STEER_MOTOR = 2;
  public static final int BACK_LEFT_MODULE_STEER_ENCODER = 3;
  public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(157.0); // Good

  // back right pod
  public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 6;
  public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 5;
  public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 1;
  public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(120.0); // 126
}
