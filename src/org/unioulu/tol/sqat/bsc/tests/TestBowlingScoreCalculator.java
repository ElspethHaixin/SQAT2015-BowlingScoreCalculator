package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
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
	public void testIsNextFrameBonus() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 9));
		assertEquals(true, b.isNextFrameBonus());
	}
	
	@Test
	public void testScore1() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		assertEquals(5, b.score());
	}
	
	@Test
	public void testScore2() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		assertEquals(14, b.score());
	}
	
	@Test
	public void testScore3() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		b.addFrame(new Frame(6, 4));
		assertEquals(24, b.score());
	}
	
	@Test
	public void testScore4() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		b.addFrame(new Frame(6, 4));
		b.addFrame(new Frame(5, 5));
		assertEquals(39, b.score());
	}
	
	@Test
	public void testScore5() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		b.addFrame(new Frame(6, 4));
		b.addFrame(new Frame(5, 5));
		b.addFrame(new Frame(10, 0));
		assertEquals(59, b.score());
	}
	
	@Test
	public void testScore6() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		b.addFrame(new Frame(6, 4));
		b.addFrame(new Frame(5, 5));
		b.addFrame(new Frame(10, 0));
		b.addFrame(new Frame(0, 1));
		assertEquals(61, b.score());
	}
	
	@Test
	public void testScore7() {
		BowlingGame b = new BowlingGame();
		b.addFrame(new Frame(1, 4));
		b.addFrame(new Frame(4, 5));
		b.addFrame(new Frame(6, 4));
		b.addFrame(new Frame(5, 5));
		b.addFrame(new Frame(10, 0));
		b.addFrame(new Frame(0, 1));
		b.addFrame(new Frame(7, 3));
		assertEquals(71, b.score());
	}
}
