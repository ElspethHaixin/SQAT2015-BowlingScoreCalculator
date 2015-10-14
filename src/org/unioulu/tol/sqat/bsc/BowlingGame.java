package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		bonus = new Frame(firstThrow, secondThrow);
	}
	
	public int score(){
		//to be implemented
		int cnt = 0;
		int i = 0;
		for (; i < frames.size(); i++)
		{
			cnt += frames.get(i).score();
			if (i != frames.size() - 1) {
				if (frames.get(i).isStrike() == true) {
					cnt += frames.get(i + 1).getFirstThrow() + frames.get(i + 1).getSecondThrow();
				}
				if (frames.get(i).isSpare() == true) {
					cnt += frames.get(i + 1).getFirstThrow();
				}
			}
		}
		return cnt;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		if (frames.get(frames.size() - 1).isSpare() || frames.get(frames.size() - 1).isStrike())
		{
			return true;
		}
		return false;
	}
}
