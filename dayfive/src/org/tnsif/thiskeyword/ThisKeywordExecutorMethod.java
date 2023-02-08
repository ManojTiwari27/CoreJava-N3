package org.tnsif.thiskeyword;
class HR {
	//void display(){
	void display(HR h1) {
		System.out.println("Human Resource");
	}
	void accept() {
		//display();
		display(this);
	}
}
public class ThisKeywordExecutorMethod {

	public static void main(String[] args) {
		HR h1 = new HR();
		h1.accept();

	}

}
