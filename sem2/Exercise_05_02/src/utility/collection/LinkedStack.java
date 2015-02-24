package utility.collection;

import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T>
{
	private int count;
	private LinearNode<T> top;

	public LinkedStack()
	{
		top = new LinearNode<T>(); // Dummy node
		count = 0;
	}

	@Override
	public void push(T element)
	{
		LinearNode<T> newNode = new LinearNode<T>(element);
		newNode.setNext(top); // Set the new node to point to the current top node
		top = newNode;  // Set the new node as the top
		count++;
	}

	@Override
	public T pop()
	{
		if(isEmpty()) // Don't allow popping an empty stack
		{
			throw new EmptyStackException();
		}
		T currentTopElement = top.getElement(); // Get the element currently at the top
		top = top.getNext(); // Move the top to the next node
		count--; // Decrement the count
		return currentTopElement;
	}

	@Override
	public T peek()
	{
		return top.getElement();
	}

	@Override
	public int indexOf(T element) // Shouldn't be in a stack...
	{
		int index = 0; // Start index at 0
		LinearNode<T> current = top; // Start with the first node
		while (current.getNext() != null)
		{
			current = current.getNext(); // Move to the next node
			if (element == null)
			{ // If looking for a null element
				if (current.getElement() == null)
				{ // If the current node has a null element
					return index; // Then return the current index
				}
			} else if (current.getElement() != null
					&& current.getElement().equals(element))
			{ // If the node has a matching element
				return index; // Return the current index
			}
			index++;
		}
		return -1; // If no match, return junk value
	}

	public boolean contains(T element)
	{
		return indexOf(element) != -1;
	}

	@Override
	public boolean isEmpty()
	{
		return count == 0;
	}

	@Override
	public int size()
	{
		return count;
	}

	@Override
	public String toString()
	{
		String str = "";
		LinearNode<T> current = top; // Start with the first node
		while (current.getNext() != null)
		{
			current = current.getNext(); // Move off of the dummy node
			if (current.getElement() == null)
			{ // If current node has no element
				str += "Empty"; // Report as empty
			} else
			{
				str += current.getElement().toString(); // Otherwise, add element's toString to the string
			}
			str += "\n";
		}
		return str;
	}

}
