package utility.collection;

public class BoundedArrayQueue<T> implements QueueADT<T>
{

	private int front;
	private int count;
	private int rear;
	private T[] queue;

	public BoundedArrayQueue(int initialCapacity)
	{
		this.front = 0;
		this.count = 0;
		this.rear = 0;
		this.queue = (T[]) new Object[initialCapacity];
	}

	@Override
	public void enqueue(T element)
	{
		if (size() == queue.length)
		{
			throw new IllegalStateException();
		}
		queue[rear] = element;
		rear = (rear + 1) % queue.length;
		count++;
	}

	@Override
	public T dequeue()
	{
		if(size() == 0)
		{
			throw new IllegalStateException();
		}
		T result = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		count--;
		return result;
	}

	@Override
	public T first()
	{
		if (size() == 0)
		{
			throw new IllegalStateException();
		}
		return queue[front];
	}

	@Override
	public int indexOf(T element)
	{
		for (int i = front; i < size(); i++)
		{
			if (queue[i].equals(element))
			{
				return i;
			}
		}
		return -1;
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

}
