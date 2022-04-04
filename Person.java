/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public abstract class Person {
  private final String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
