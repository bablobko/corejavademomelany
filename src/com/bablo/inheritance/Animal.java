/**
 * 
 */
package com.bablo.inheritance;

/**
 * @author anushil.s
 *
 */
public class Animal {
	
	private int numOfLegs; //private is access specifier.
	
	public Animal() { // this is default no-argument constructor
		
	}
	
	public Animal(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}
