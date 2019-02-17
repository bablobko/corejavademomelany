/**
 * 
 */
package com.bablo.student.demo;

/**
 * @author anushil.s
 *
 */
public class MainStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student lekha = new Student();
		lekha.setName("Lekha");
        Student shakti = new Student();
		shakti.setName("Shakti");
		Student sai = new Student();
		sai.setName("Sai");
		
		Student[] students = {lekha, shakti, sai};
		
		for(Student student : students) {
			System.out.println("I am part of the student array. And my name is  " + student.getName());
		}
	}

}
