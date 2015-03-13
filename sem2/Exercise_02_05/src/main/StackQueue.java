package main;

import utility.collection.ArrayStack;
import utility.collection.QueueADT;
import utility.collection.StackADT;

public class StackQueue<T> implements QueueADT<T> {
  private StackADT<T> inStack;
  private StackADT<T> outStack;

  public StackQueue() {
    inStack = new ArrayStack<T>();
    outStack = new ArrayStack<T>();
  }

  @Override
  public void enqueue(T element) {
    inStack.push(element);
  }

  @Override
  public T dequeue() {
    while (!inStack.isEmpty()) {
      outStack.push(inStack.pop());
    }

    T element = outStack.pop();

    while (!outStack.isEmpty()) {
      inStack.push(outStack.pop());
    }

    return element;
  }

  @Override
  public T first() {

    while (!inStack.isEmpty()) {
      outStack.push(inStack.pop());
    }

    T element = outStack.peek();

    while (!outStack.isEmpty()) {
      inStack.push(outStack.pop());
    }

    return element;
  }

  @Override
  public boolean isEmpty() {
    return inStack.isEmpty();
  }

  @Override
  public int size() {
    return inStack.size();
  }

}
