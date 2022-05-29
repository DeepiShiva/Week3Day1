package Org.student;

import Org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("StudentName is Deepika Paranthaman");
	}

	public void studentDept() {
		System.out.println("Student Department is Biology");
	}

	public void studentId() {
		System.out.println("Student ID is S102481");
	}

	public static void main(String[] args) {

		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.departmentName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();

	}
}
