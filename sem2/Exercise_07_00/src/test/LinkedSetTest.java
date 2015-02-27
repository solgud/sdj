package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.collection.LinkedSet;
import utility.collection.SetADT;

public class LinkedSetTest
{
	LinkedSet<String> set;

	@Before
	public void setUp() throws Exception
	{
		set = new LinkedSet<String>();
	}

	@Test
	public void sizeShouldGiveTheCorrectNumberOfElements()
	{
		assertEquals(0, set.size());
		set.add("One");
		assertEquals(1, set.size());
		
	}
	
	@Test
	public void isEmptyShouldCorrectlyReportAnEmptySet()
	{
		assertTrue(set.isEmpty());
		set.add("One");
		assertFalse(set.isEmpty());
	}
	
	@Test
	public void addShouldPrependElementToSet()
	{
		assertTrue(set.isEmpty());
		assertFalse(set.contains("One"));
		set.add("One");
		set.add("Two");
		assertFalse(set.isEmpty());
		assertTrue(set.contains("One"));
	}
	
	@Test
	public void containsShouldConfirmExistenceOfElementInSet()
	{
		assertFalse(set.contains("One"));
		set.add("One");
		assertTrue(set.contains("One"));
	}
	
	@Test
	public void removeShouldDeleteElementFromSet()
	{
		set.add("One");
		assertTrue(set.contains("One"));
		set.add("Two");
		assertTrue(set.contains("Two"));
		set.remove("Two");
		assertFalse(set.contains("Two"));
		set.remove("One");
		assertFalse(set.contains("One"));
	}
	
	@Test
	public void isSubsetShouldConfirmThatSetExistsInOtherSet()
	{
		set.add("One");
		set.add("Two");
		
		LinkedSet<String> superset = new LinkedSet<String>();
		superset.add("One");
		superset.add("Two");
		superset.add("Three");

		assertTrue(set.isSubset(superset));
	}

}
