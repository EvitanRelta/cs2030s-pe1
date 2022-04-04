/**
 * CS2030S PE1 Question 2
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public interface Stack<T> {
  T pop();

  void push(T input);

  int getStackSize();
}
