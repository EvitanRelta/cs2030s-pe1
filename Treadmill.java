/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class Treadmill extends Equipment {
  private double speed;

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getSpeed() {
    return this.speed;
  }

  @Override
  public void repair() {
    this.speed = 0;
  }

  @Override
  public String toString() {
    return String.format("Treadmill: %s km/h", this.speed);
  }
}
