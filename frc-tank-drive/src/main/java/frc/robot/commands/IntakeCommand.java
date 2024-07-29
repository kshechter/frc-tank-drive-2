package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends Command {
    private final Intake intake;
    private final double intake_speed;
    public IntakeCommand(Intake intake, double intake_speed) {
        this.intake = intake;
        this.intake_speed = intake_speed;
        addRequirements(intake);
    }
    // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.spin_intake(intake_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.stop_intake();
  }
}
