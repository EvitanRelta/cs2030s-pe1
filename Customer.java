/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class Customer extends Person {
  public Customer(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Customer: %s", super.toString());
  }
}
