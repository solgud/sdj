package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import utility.collection.LinkedQueue;

public class LinkedQueueTest
{

	private LinkedQueue<String> queue;

	@Before
	public void setUp() throws Exception
	{
		queue = new LinkedQueue<String>();
	}

	@Test
	public void shouldBeInTheCorrectPackage()
	{
		assertEquals("utility.collection.LinkedQueue", queue.getClass().getCanonicalName());
	}
	
	@Test
	public void dequeueShouldRemoveElementAtFrontOfQueue()
	{
		
	}
	
	@Test(expected = IllegalStateException.class)
	public void dequeueShouldThrowExceptionOnEmptyQueue()
	{
		assertTrue(queue.isEmpty());
		queue.first();
	}
	
	@Test
	public void enqueueShouldAddElementToBackOfQueue()
	{
		
	}
	
	@Test
	public void enqueueShouldAllowAddingNullElement()
	{
		
	}

	@Test
	public void firstShouldShowTheCurrentFirstElement()
	{
		queue.enqueue("First");
		assertEquals("First", queue.first());
	}

	@Test(expected = IllegalStateException.class)
	public void firstShouldThrowExceptionOnEmptyQueue()
	{
		assertTrue(queue.isEmpty());
		queue.first();
	}

	@Test
	public void indexOfShouldFindCorrectIndex()
	{
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");

		assertEquals(2, queue.indexOf("Third"));
		assertEquals(1, queue.indexOf("Second"));
		assertEquals(0, queue.indexOf("First"));
	}

	@Test
	public void isEmptyShouldReportEmptyQueue()
	{
		assertTrue(queue.isEmpty());
	}


	@Test
	public void sizeShouldReportCorrectStackSize()
	{
		assertEquals(0, queue.size());

		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");

		assertEquals(3, queue.size());
	}

	@Test
	public void shouldImplementTheCorrectVersion()
	{
		// Not sure how to show this here!
	}

}
