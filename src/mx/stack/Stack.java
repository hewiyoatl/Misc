package mx.stack;

import java.util.Arrays;

public class Stack<E> {

  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];

  public Stack() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public void push(E element) {
    if(size == elements.length) {
      addRoom();
    }
    else {
      elements[size++] = element;
    }
  }

  public E pop() {
    E element = (E) elements[--size];
    elements[size] = null;

    return element;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean contains(E element) {
    for(Object el : elements) {
      if(element.equals(el)) {
        return true;
      }
    }

    return false;
  }

  private void addRoom() {
    int newSize = elements.length * 2;

    elements = Arrays.copyOf(elements, newSize);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    System.out.printf("is stack empty: %s\n", stack.isEmpty());
    stack.push(2);
    stack.push(4);
    stack.push(7);

    stack.pop();

    for(int i = stack.size - 1; i >= 0; i--) {
      System.out.printf("These are the elements of the array %s\n", stack.elements[i]);
    }

    System.out.printf("is stack empty: %s\n", stack.isEmpty());

    System.out.printf("stack contains 4: %s\n", stack.contains(4));

    System.out.printf("stack contains 10: %s\n", stack.contains(10));

  }
}
