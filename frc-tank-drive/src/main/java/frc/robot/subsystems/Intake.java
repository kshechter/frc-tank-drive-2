package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final CANSparkMax intake_motor;
    public Intake(int intake_motor) {
        this.intake_motor = new CANSparkMax(intake_motor, MotorType.kBrushless);
    }
    public void spin_intake(double intake_speed) {
        intake_motor.set(intake_speed);
    }
    public void stop_intake() {
        intake_motor.stopMotor();
    }
    @Override
    public void periodic() {

    }
}
