/**
 * 
 */
package com.bablo.datatypes;

/**
 * @author anushil.s
 *
 */
public class DataTypeDemo {
	
	int a = 10243;
	short s = 128;
	byte b = 12;
	char c = 'a';
	float f = 3.14f;
	double d = 123.234d;
	boolean bool = false;
	long l = 1233454567;
	
	public static void main(String[] args) {

		DataTypeDemo dataTypeDemo = new DataTypeDemo();// a new object is being created on the heap memory area.
		
		System.out.println(dataTypeDemo.a);
		System.out.println(dataTypeDemo.l);
	}
	
}
