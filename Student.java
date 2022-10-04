package org.student;

import org.department.Departmeent;

public class Student extends Departmeent{
	public void studentName() {
		System.out.println("Name");

	}
	public void studentDept() {
		System.out.println("Dept");

	}
	public void studentId() {
		System.out.println("Id");

	}
	public static void main(String[] args) {
		Student s = new Student();
		s.deptName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.studentDept();
		s.studentId();
		s.studentName();
	}

}
