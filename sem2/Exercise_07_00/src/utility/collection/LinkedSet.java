package utility.collection;

public class LinkedSet<T> implements SetADT<T>
{
	private int size;
	private LinearNode<T> front;

	public LinkedSet()
	{
		this.front = null;
		this.size = 0;
	}

	@Override
	public void add(T element)
	{
		if (!contains(element)) // Make sure element isn't already in set
		{
			if (front == null) // If set is empty
			{
				front = new LinearNode<T>(element, null); // Start with the new node
			} else // If set is not empty
			{
				front = new LinearNode<T>(element, front); // Prepend the new node
			}
			size++;
		}
	}

	@Override
	public T remove(T element)
	{
		if (isEmpty()) // Don't allow removing from empty set
		{
			throw new IllegalStateException();
		}

		LinearNode<T> currentNode = front; // Start with front
		while (currentNode != null) // Until end is reached
		{
			if (currentNode.getElement().equals(element)) // If the current element is a match
			{
				T elementToReturn = currentNode.getElement(); // Get the element to return (not really necessary, could just return the argument)
				currentNode.setElement(front.getElement()); // Reset the current node's element with the element from the front node
				front = front.getNext(); // Move the front node up to the next node (deleting it)
				size--;
				return elementToReturn;
			}
			currentNode = currentNode.getNext(); // If no match, move to the next node
		}

		return null;
	}

	@Override
	public boolean contains(T element)
	{
		if (front == null) // Return false if empty set
		{
			return false;
		}
		if (element == null) // Don't allow null arguments
		{
			throw new IllegalArgumentException();
		}

		LinearNode<T> currentNode = front; // Start with front node
		while (currentNode != null) // Until end is reached
		{
			if (currentNode.getElement().equals(element)) // If matching element is found
			{
				return true;
			}
			currentNode = currentNode.getNext(); // If no match, move on to the next node
		}
		return false;
	}

	@Override
	public boolean isEmpty()
	{
		return size() == 0;
	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean isSubset(SetADT<T> set)
	{
		if(isEmpty())
		{
			return set.isEmpty(); 
		}

		LinearNode<T> currentNode = front;
		
		while(currentNode != null)
		{
			
		}
		

		return false;
	}

	@Override
	public SetADT<T> intersection(SetADT<T> set)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString()
	{
		return null;
	}

}
