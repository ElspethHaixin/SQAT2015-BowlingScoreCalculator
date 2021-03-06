package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	private int additionThrow;
	
	public int getAdditionThrow() {
		return additionThrow;
	}

	public void setAdditionThrow(int additionThrow) {
		this.additionThrow = additionThrow;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
	
	public Frame(int firstThrow, int secondThrow, int additionThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.additionThrow = additionThrow;
	}
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return firstThrow + secondThrow + additionThrow + bonus();
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if (firstThrow == 10)
		{
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if (isStrike() == false && firstThrow + secondThrow == 10)
		{
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
