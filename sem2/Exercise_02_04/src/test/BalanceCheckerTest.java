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
		assertFalse(BalanceChecker.check("{}}"));
		assertFalse(BalanceChecker.check("[]]"));
		assertFalse(BalanceChecker.check("())"));
	}
	
	@Test
	public void shouldIdentifyEvenBraces() {
		assertTrue(BalanceChecker.check("{{}}"));
		assertTrue(BalanceChecker.check("[[]]"));
		assertTrue(BalanceChecker.check("(())"));
	}

}
