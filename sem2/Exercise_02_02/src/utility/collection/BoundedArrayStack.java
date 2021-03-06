package utility.collection;

import java.util.EmptyStackException;

public class BoundedArrayStack<T> implements StackADT<T> {

	private int top;
	private T[] stack;
	
	public BoundedArrayStack(int initialCapacity) {
		this.top = 0;
		this.stack = (T[]) new Object[initialCapacity];
	}

	@Override
	public void push(T element) {
		if(size() == stack.length) {
			throw new IllegalStateException("Stack is full");
		}
		stack[top++] = element;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T result = stack[--top]; // Record the last element
		stack[top] = null; // Remove the last element
		return result; // Return the recorded element
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1]; // Return the last element
	}

	@Override
	public int indexOf(T element) {
		for(int i = size() - 1; i >= 0; i--) { // Starting from top
			if(element.equals(stack[i])) { // If match is found
				return i; // Return current index
			}
		}
		return -1; // Return a junk value if no match is found
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return this.top;
	}
	
	public String toString() {
		String resultString = "";
		for(int i = size() - 1; i >= 0; i--) {
			resultString += stack[i].toString() + "\n";
		}
		return resultString;
	}


}
