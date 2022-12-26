package org.system;

public class Student extends department {
	public void studentName() {
		System.out.println("studentName = dharani");
	}
	public void studentDept() {
		System.out.println("studentDept=IT");
	}
    public void studentId() {
    	System.out.println("studentId=08");
    }
	public static void main(String[] args) {
	
		Student details = new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentDept();
		details.studentId();

	}

}
