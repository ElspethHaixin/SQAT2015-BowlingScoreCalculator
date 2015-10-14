package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testIsStrike1() {
		Frame f = new Frame(10, 0);
		assertEquals(true, f.isStrike());
	}

	@Test
	public void testIsStrike2() {
		Frame f = new Frame(1, 4);
		assertEquals(false, f.isStrike());
	}
	
}
