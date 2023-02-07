package org.tnsif.singlelevelinheritance;
// TO demonstrate example on single level inheritance  
public class Citizen {
	// Private data members
	private String name;
	private long adharno;
	private String city;
	private long mbno;
	
	// getters and Setters method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	// Default Constructor
	public Citizen() {
		System.out.println("parent Class");
	}
	// Parameterized Constructor
	public Citizen(String name, long adharno, String city, long mbno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mbno = mbno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mbno=" + mbno + "]";
	}
	
	
	

}

