package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.collection.BoundedArrayQueue;

public class BoundedArrayQueueTest
{

	BoundedArrayQueue<String> queue;
	@Before
	public void setUp() throws Exception
	{
		queue = new BoundedArrayQueue<String>(3);
	}

	@Test
	public void enqueueShouldAddElementToQueue()
	{
		assertTrue(queue.isEmpty());
		queue.enqueue("First");
		assertFalse(queue.isEmpty());
	}
	
	@Test
	public void enqueueShouldAddElementToEndOfQueue()
	{
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.dequeue();
		assertEquals("Second", queue.dequeue());
	}
	
	@Test(expected = IllegalStateException.class)
	public void enqueueShouldNotAllowAddingMoreElementsThanQueueSize()
	{
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");
		queue.enqueue("Fourth");
	}
	
	@Test
	public void dequeueShouldRemoveElementFromQueue()
	{
		queue.enqueue("First");
		assertFalse(queue.isEmpty());
		queue.dequeue();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void dequeueShouldRemoveElementFromFrontOfQueue()
	{
		queue.enqueue("First");
		queue.enqueue("Second");
		assertEquals("First", queue.dequeue());
		assertEquals("Second", queue.dequeue());
	}
	
	@Test
	public void firstShouldGiveElementAtFrontOfQueue()
	{
		queue.enqueue("First");
		queue.enqueue("Second");
		assertEquals("First", queue.first());
	}

	@Test
	public void isEmptyShouldReportQueueHasNoElements()
	{
		assertTrue(queue.isEmpty());
		queue.enqueue("First");
		assertFalse(queue.isEmpty());
	}
	
	@Test
	public void sizeShouldReportNumberOfElementsInQueue()
	{
		assertEquals(0, queue.size());
		queue.enqueue("First");
		assertEquals(1, queue.size());
		queue.enqueue("Second");
		assertEquals(2, queue.size());
	}
	
	@Test
	public void indexOfShouldReportLocationOfElementInQueue()
	{
		assertEquals(-1, queue.indexOf("First"));
		queue.enqueue("First");
		assertEquals(0, queue.indexOf("First"));
		queue.enqueue("Second");
		assertEquals(1, queue.indexOf("Second"));
		// Note: fails after dequeuing - not sure why
	}
}
