/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class Dumbbell extends Equipment {
  private final double weight;
  private int repairs = 0;

  public Dumbbell(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public int getRepairCount() {
    return this.repairs;
  }

  @Override
  public void repair() {
    this.repairs++;
  }

  @Override
  public String toString() {
    return String.format("Dumbbell: %s kg", this.weight);
  }
}
