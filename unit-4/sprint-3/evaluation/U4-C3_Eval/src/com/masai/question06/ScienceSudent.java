package com.masai.question06;

public class ScienceSudent implements Student {


	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub

		double result = ((getPhysicsMarks()+getChemistryMarks()+getMathsMarks()+getBiologyMarks())/400)*100;

		return result;
	}
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}
	
}
