package utility.collection;

public class LinkedSet<T> implements SetADT<T> {
  private int size;
  private LinearNode<T> front;

  public LinkedSet() {
    this.front = null;
    this.size = 0;
  }

  @Override
  public void add(T element) {
    if (!contains(element)) {
      if (front == null) {
        front = new LinearNode<T>(element, null);
      } else {
        front = new LinearNode<T>(element, front);
      }
      size++;
    }
  }

  @Override
  public T remove(T element) {
    if (isEmpty()) {
      throw new IllegalStateException();
    }

    LinearNode<T> currentNode = front;
    while (currentNode != null) {
      if (currentNode.getElement().equals(element)) {
        T elementToReturn = currentNode.getElement();
        currentNode.setElement(front.getElement());
        front = front.getNext();
        size--;
        return elementToReturn;
      }
      currentNode = currentNode.getNext();
    }

    return null;
  }

  @Override
  public boolean contains(T element) {
    if (front == null) {
      return false;
    }
    if (element == null) {
      throw new IllegalArgumentException("Null elements not accepted");
    }

    LinearNode<T> currentNode = front;
    while (currentNode != null) {
      if (currentNode.getElement().equals(element)) {
        return true;
      }
      currentNode = currentNode.getNext();
    }
    return false;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isSubset(SetADT<T> set) {
    if (isEmpty()) {
      return set.isEmpty();
    }

    LinearNode<T> currentNode = front;

    while (currentNode != null) {
      if (!set.contains(currentNode.getElement())) {
        return false;
      }
      currentNode = currentNode.getNext();
    }
    return true;
  }

  @Override
  public SetADT<T> intersection(SetADT<T> set) {
    SetADT<T> newSet = new LinkedSet<T>();

    LinearNode<T> currentNode = front;

    while (currentNode != null) {
      if (set.contains(currentNode.getElement())) {
        newSet.add(currentNode.getElement());
      }
      currentNode = currentNode.getNext();
    }

    return newSet;
  }

  @Override
  public String toString() {
    String result = "";
    LinearNode<T> currentNode = front;
    while (currentNode != null) {
      result += currentNode.getElement().toString();
      currentNode = currentNode.getNext();
      if (currentNode != null) {
        result += ", "; // Probably a jugheaded way of doing this.
      }
    }
    return result;
  }

}
