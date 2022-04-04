/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class Gym {
  private int numOfPeople = 0;
  private final int capacity;

  public Gym(int capacity) {
    this.capacity = capacity;
  }

  public void enter(Person p) {
    if (this.numOfPeople < this.capacity && (
          p instanceof Trainer || p instanceof Customer)) {
      System.out.println(p.toString() + " can enter");
      this.numOfPeople++;
    } else {
      System.out.println(p.toString() + " cannot enter");
    }
  }

  @Override
  public String toString() {
    return String.format("Gym Capacity: %s/%s", this.numOfPeople,
        this.capacity);
  }
}
