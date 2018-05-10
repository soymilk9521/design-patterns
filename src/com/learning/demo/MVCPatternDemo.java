package com.learning.demo;

import com.learning.design.pattern.mvc.Student;
import com.learning.design.pattern.mvc.StudentController;
import com.learning.design.pattern.mvc.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) {
		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();
		
		System.out.println();
		
		// update model data
		controller.setStudentName("John");
		controller.setStudentRollNo("15");
		
		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

}
