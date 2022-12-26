package org.system;

public class Studentinfo {

	public void getStudentinfo(int id,String name) {
System.out.println(id+" "+name);
	}
	public void getStudentinfo(String Email,long phonenumber) {
System.out.println(Email+" "+phonenumber);
	}


	public static void main(String[] args) {
		Studentinfo employee=new Studentinfo();
		employee.getStudentinfo(1002,"Dharani");
		employee.getStudentinfo("dharanimurugaesh19@gmail.com",9500423417l);
		
	}
}