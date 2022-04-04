/**
 * CS2030S PE1 Question 2
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class ArrayStack<T> implements Stack<T> {
  private final T[] data;
  private int lastUsedIndex = -1;

  public ArrayStack(int dept) {
    // Only way to add elements to `this.data` is via
    // `push` which only accept type T.
    // Hence, its safe to cast T[].
    @SuppressWarnings("unchecked")
    T[] data = (T[]) new Object[dept];
    this.data = data;
  }

  @Override
  public T pop() {
    if (this.isEmpty()) {
      return null;
    }

    T output = this.data[lastUsedIndex];
    this.lastUsedIndex--;
    return output;
  }

  @Override
  public void push(T input) {
    if (this.isFull()) {
      return;
    }

    this.data[lastUsedIndex + 1] = input;
    this.lastUsedIndex++;
  }

  @Override
  public int getStackSize() {
    return this.lastUsedIndex + 1;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("Stack: ");
    for (int i = 0; i < this.getStackSize(); i++) {
      T element = this.data[i];
      output.append(element.toString());
      output.append(" ");
    }
    return output.toString();
  }

  private boolean isFull() {
    return this.lastUsedIndex >= this.data.length - 1;
  }

  private boolean isEmpty() {
    return lastUsedIndex < 0;
  }

  public static <T> ArrayStack<T> of(T[] array, int dept) {
    ArrayStack<T> output = new ArrayStack<>(dept);
    for (T element : array) {
      output.push(element);
    }
    return output;
  }

  public void pushAll(ArrayStack<? extends T> input) {
    int inputSize = input.getStackSize();
    for (int i = 0; i < inputSize; i++) {
      this.push(input.pop());
    }
  }

  public void popAll(ArrayStack<? super T> output) {
    output.pushAll(this);
  }
}
