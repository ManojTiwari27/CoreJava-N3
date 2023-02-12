package org.tnsif.abstractiondemo;

public class PaneerMasala extends Menu {
	/* Implement all the Abstract methods otherwise you will get error*/
	@Override
	void recipe() {
		System.out.println("PaneerMasala ");
		
	}

	@Override
	void foodtype() {
		System.out.println("Food Type is Veg");
		
	}
	

}
