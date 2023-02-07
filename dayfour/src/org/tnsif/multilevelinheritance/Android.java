package org.tnsif.multilevelinheritance;

public class Android extends Nokia{
	private String version;
	private void accept() {
		System.out.println("The Android version name is "+version);
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Android(String version,int modelno) {
		super(modelno);
		this.version = version;
	}
	

}
