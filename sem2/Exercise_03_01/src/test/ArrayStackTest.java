package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.collection.ArrayStack;

/**
 * Tests methods in the ArrayStack class.
 * Only tests methods in the StackADT interface.
 * 
 */
public class ArrayStackTest
{

	ArrayStack<String> stack;

	@Before
	public void setUp() throws Exception
	{
		stack = new ArrayStack<String>();
	}

	@Test
	public void pushShouldAddElementToStack()
	{
		assertTrue(stack.isEmpty());
		stack.push("First");
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void pushShouldAddElementToEndOfStack()
	{
		stack.push("First");
		stack.push("Second");
		assertEquals("Second", stack.peek());
	}
	
	@Test
	public void popShouldRemoveElementFromStack()
	{
		stack.push("First");
		assertFalse(stack.isEmpty());
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void popShouldRemoveLastElementFromStack()
	{
		stack.push("First");
		stack.push("Second");
		assertEquals("Second", stack.pop());
	}
	
	@Test
	public void peekShouldGiveLastElementOnStack()
	{
		stack.push("First");
		stack.push("Second");
		assertEquals("Second", stack.peek());
	}
	
	@Test
	public void isEmptyShouldReportEmptyStack()
	{
		assertTrue(stack.isEmpty());
		stack.push("First");
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void sizeShouldReportSizeOfStack()
	{
		assertEquals(0, stack.size());
		stack.push("First");
		assertEquals(1, stack.size());
		stack.push("Second");
		assertEquals(2, stack.size());
		stack.pop();
		assertEquals(1, stack.size());
	}

}
