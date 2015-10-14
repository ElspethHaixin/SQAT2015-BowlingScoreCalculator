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
	
	@Test
	public void testIsSpare1() {
		Frame f = new Frame(6, 4);
		assertEquals(true, f.isSpare());
	}
	
	@Test
	public void testIsSpare2() {
		Frame f = new Frame(1, 4);
		assertEquals(false, f.isSpare());
	}
	
	@Test
	public void testScore() {
		Frame f = new Frame(1, 4);
		assertEquals(5, f.score());
	}
	
	@Test
	public void testScore() {
		Frame f = new Frame(1, 4);
		assertEquals(5, f.score());
	}
}
