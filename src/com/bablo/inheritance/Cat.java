/**
 * 
 */
package com.bablo.inheritance;

/**
 * @author anushil.s
 *
 */
public class Cat extends Animal { //Whenever there exists an "is a" relationship between classes. We say inheritance is there between classes.
	
   protected String name;
	
	public void doMeow() {
		System.out.println("Meow Meow");
	}

}
