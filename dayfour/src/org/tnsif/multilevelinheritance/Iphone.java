package org.tnsif.multilevelinheritance;

public class Iphone extends Android {
	private String slottype;
	private void slot() {
		System.out.println("Slot type is "+slottype);
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone() {
		super();
		
	}
	public Iphone(int modelno,String version,String slottype) {
		super(version,modelno);
		this.slottype = slottype;
		
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getModelno()=" + getModelno() + "]";
	}
	
	
	
	
}
