package utility.collection;

public interface ListADT<T> {

  /**
   * Inserts the specified element at the specified index.
   */
  public void add(int index, T element);

  /**
   * Adds the specified element to the rear end of this list.
   */
  public void add(T element);

  /**
   * Removes and returns the element at the specified index.
   */
  public T remove(int index);

  /**
   * Removes and returns the specified element from the list.
   */
  public T remove(T element);

  /**
   * Returns a reference to the element at the specified index.
   */
  public T get(int index);

  /**
   * Sets the element at the specified index.
   */
  public void set(int index, T element);

  /**
   * Returns true if this list contains the specified target element.
   */
  public boolean contains(T element);

  /**
   * Returns the index of the specified element.
   */
  public int indexOf(T element);

  /**
   * Returns true if this list contains no elements.
   */
  public boolean isEmpty();

  /**
   * Returns the number of elements in this list.
   */
  public int size();
}
