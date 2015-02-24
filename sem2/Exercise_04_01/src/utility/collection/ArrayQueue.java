package utility.collection;

public class ArrayQueue<T> implements QueueADT<T> {

	private static final int DEFAULT_CAPACITY = 100;
	private int front;
	private int count;
	private int rear;
	private T[] queue;

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayQueue(int initialCapacity) {
		this.front = 0;
		this.count = 0;
		this.rear = 0;
		this.queue = (T[]) new Object[DEFAULT_CAPACITY];
	}

	@Override
	public void enqueue(T element) {
		if(size() == queue.length) {
			expandCapacity();
		}
		queue[rear] = element;
		rear = (rear + 1) % queue.length;
		count++;
	}

	private void expandCapacity() {
		T[] expandedArray = (T[]) new Object[queue.length * 2];

		for (int i = 0; i < count; i++) {
			expandedArray[i] = queue[front];
			front = (front + 1) % queue.length;
		}
		front = 0;
		rear = count;
		queue = expandedArray;

	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		count--;
		return null;
	}

	@Override
	public T first() {
		return queue[front];
	}

	@Override
	public int indexOf(T element) {
		for (int i = 0; i < size(); i++) {
			if(queue[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

}
