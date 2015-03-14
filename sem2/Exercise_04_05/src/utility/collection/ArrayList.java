package utility.collection;

import java.util.Arrays;

public class ArrayList<T> implements ListADT<T> {

  private static final int DEFAULT_CAPACITY = 50;
  private int tailIndex;
  private T[] elements;

  public ArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public ArrayList(int startingSize) {
    this.elements = (T[]) new Object[startingSize];
    this.tailIndex = 0;
  }

  @Override
  public void add(int index, T element) {
    if (index > tailIndex) {
      throw new IndexOutOfBoundsException();
    }
    if (tailIndex == elements.length) {
      expandCapacity();
    }
    if (elements[index] != null) {
      shiftRight(index);
    }
    elements[index] = element;
    tailIndex++;
  }

  @Override
  public void add(T element) {
    add(tailIndex, element);
  }

  @Override
  public T remove(int index) {
    if (index >= tailIndex) {
      throw new IndexOutOfBoundsException();
    }

    T element = elements[index];

    elements[index] = null;
    shiftLeft(index);

    tailIndex--;
    return element;
  }

  @Override
  public T remove(T element) {
    return remove(indexOf(element));
  }

  @Override
  public T get(int index) {
    if (index >= tailIndex) {
      throw new IndexOutOfBoundsException();
    }
    return elements[index];
  }

  @Override
  public void set(int index, T element) {
    if (index >= tailIndex) {
      throw new IndexOutOfBoundsException();
    }
    elements[index] = element;
  }

  @Override
  public boolean contains(T element) {
    return indexOf(element) != -1;
  }

  @Override
  public int indexOf(T element) {
    for (int i = 0; i < tailIndex; i++) {
      if (elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public boolean isEmpty() {
    return tailIndex == 0;
  }

  @Override
  public int size() {
    return tailIndex;
  }

  /**
   * Expands the capacity of the internal array structure.
   */
  private void expandCapacity() {
    T[] newList = (T[]) new Object[elements.length * 2];
    for (int i = 0; i < elements.length; i++) {
      newList[i] = elements[i];
    }
    elements = newList;
  }

  /**
   * Shifts elements to the right, from and including specified index.
   */
  private void shiftRight(int index) {
    for (int i = tailIndex; i >= index; i--) {
      elements[i] = elements[i - 1];
    }
  }

  /**
   * Shifts elements to the left, from and including specified index.
   */
  private void shiftLeft(int index) {
    for (int i = index; i < tailIndex; i++) {
      elements[i] = elements[i + 1];
    }
  }

  @Override
  public String toString() {
    T[] trimmedElements = (T[]) new Object[tailIndex];
    for (int i = 0; i < tailIndex; i++) {
      trimmedElements[i] = elements[i];
    }
    // return Arrays.toString(trimmedElements);
    return Arrays.toString(elements);
  }
}
