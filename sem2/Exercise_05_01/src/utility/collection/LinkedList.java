package utility.collection;

public class LinkedList<T> implements ListADT<T> {
	private int count;
	private LinearNode<T> front;

	public LinkedList(){
		front = new LinearNode<T>(); // Dummy node
		count = 0;
	}

	public LinearNode<T> getNode(int index) {

		LinearNode<T> current = front; // Start at front node
		for (int i = -1; i < index; i++) { 
			current = current.getNext(); // cycle through nodes
		}
		return current;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}

		LinearNode<T> previous = getNode(index - 1);
		LinearNode<T> newNode = new LinearNode<T>(element, previous.getNext());
		previous.setNext(newNode);
		count++;
	}

	@Override
	public void add(T element) {
		add(0, element); // Add to the front of the list
	}

	@Override
	public void set(int index, T element) {
		getNode(index).setElement(element);
	}

	@Override
	public T get(int index) {
		return getNode(index).getElement();
	}

	@Override
	public T remove(int index) {
		
		LinearNode<T> previous = getNode(index -1); // Get the node right before the one we want to delete
		LinearNode<T> nodeToDelete = previous.getNext(); // Get the node we want ot delete
		previous.setNext(nodeToDelete.getNext()); // Set the previous node to point to the node after the one we want to delete
		nodeToDelete.setNext(null); // Remove the deleted node's pointer

		return nodeToDelete.getElement(); // Return the element at the deleted node
	}

	@Override
	public T remove(T element) {
		T elementToReturn = null;
		LinearNode<T> current = front; // Start with the first node
		for(int i = -1; i < count; i++) { // Go through the nodes
			if(current.getElement() != null && current.getElement().equals(element)) { // If the node has a matching element
				elementToReturn = current.getElement();
				current.setElement(null); // Remove it (set to null)
			}
			current = current.getNext(); // Move to the next node
		}
		return elementToReturn; // Return the element (not sure why...)
	}

	@Override
	public int indexOf(T element) {
		int index = 0; // Start index at 0
		LinearNode<T> current = front; // Start with the first node
		for(int i = -1; i < count; i++) { // Go through the nodes
			if(element == null) { // If looking for a null element
				if(current.getElement() == null) { // If the current node has a null element
					return index; // Then return the current index
				}
			} else if(current.getElement() != null && current.getElement().equals(element)) { // If the node has a matching element
				return index; // Return the current index
			}
			index++; // Increment the index
		}
		return -1; // If no match, return junk value
	}

	@Override
	public boolean contains(T element) {
		return indexOf(element) != -1;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public String toString() {
		String str = "";
		LinearNode<T> current = front; // Start with the first node
		for(int i = -1; i < count; i++) { // Go through the nodes
			if(current.getElement() == null) { // If current node has no element
				str += "Empty"; // Report as empty
			} else {
				str += current.getElement().toString(); // Otherwise, add element's toString to the string
			}
		}
		return str;
	}


}
