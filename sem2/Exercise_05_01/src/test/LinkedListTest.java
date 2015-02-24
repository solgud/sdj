package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.collection.LinkedList;

public class LinkedListTest {

	LinkedList<String> stringList;
	String testString = "Test String";

	@Before
	public void initialize() {
		stringList = new LinkedList<String>();
		stringList.add("First");
		stringList.add("Second");
		stringList.add("Third");
	}
	
	@Test
	public void IndexOfFindsTheCorrectIndex() {
		assertSame(2, stringList.indexOf("Third"));
	}

	@Test
	public void NodeIsCorrectlyAddedToBeginningOfList() {
		stringList.add(0, testString);
		assertSame(stringList.get(0), testString);
	}

	@Test
	public void NodeIsCorrectlyAddedToEndOfList() {
		stringList.add(testString);
		assertSame(stringList.get(stringList.size()-1), testString);
	}
	@Test
	public void NodeIsCorrectlyAddedToMiddleOfList() {
		stringList.add(stringList.size() / 2, testString);
		assertSame(stringList.get((stringList.size() / 2)-1), testString);
	}

	@Test
	public void LinksStayCorrectAfterRemovingAndAdding() {
		String initialToString = stringList.toString();
		stringList.add(2, testString);
		stringList.add(testString);
		stringList.remove(2);
		stringList.remove(testString);
		assertSame(initialToString, stringList.toString());
	}
}
