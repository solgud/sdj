package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import main.BalanceChecker;

import org.junit.Before;
import org.junit.Test;

public class BalanceCheckerTest {

	@Test
	public void shouldIdentifyUnevenBraces() {
		assertFalse(BalanceChecker.check("{{}"));
		assertFalse(BalanceChecker.check("[[]"));
		assertFalse(BalanceChecker.check("(()"));
		assertFalse(BalanceChecker.check("foo = new Bar(){name = 'sup'}}"));
		assertFalse(BalanceChecker.check("[42]]"));
		assertFalse(BalanceChecker.check("if(false))"));
	}
	
	@Test
	public void shouldIdentifyEvenBraces() {
		assertTrue(BalanceChecker.check("{{}}"));
		assertTrue(BalanceChecker.check("int[][] ints = new int[a.length()][42]"));
		assertTrue(BalanceChecker.check("if(true){return false;}"));
	}

}
