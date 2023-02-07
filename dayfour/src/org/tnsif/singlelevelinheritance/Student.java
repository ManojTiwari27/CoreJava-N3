package org.tnsif.singlelevelinheritance;

public class Student extends Citizen {
	// Private data members
	private int rollno;
	private String studentname;
	
	 // getters and Setters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	// Default Constructor
	public Student() {
		//super();
		
	}
	// Parameterized Constructor
	public Student(String name, long adharno, String city, long mbno,int rollno, String studentname) {
		super(name, adharno, city, mbno);
		this.rollno = rollno;
		this.studentname = studentname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentname=" + studentname + ", getRollno()=" + getRollno()
				+ ", getStudentname()=" + getStudentname() + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
	
	

}
