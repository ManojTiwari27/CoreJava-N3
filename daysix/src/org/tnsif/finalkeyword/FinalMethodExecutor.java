package org.tnsif.finalkeyword;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		RedVelvet r = new RedVelvet();
		r.flavour = "MixedFruit";
		r.display();
		r.setPrice(45);
		r.display(r.getPrice());

	}

}
