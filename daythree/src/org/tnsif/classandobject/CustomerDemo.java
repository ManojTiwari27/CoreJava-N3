package org.tnsif.classandobject;
import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		while(n<=2)
		{
			System.out.println("Enter id, name and city");
			int id = sc.nextInt();
			String customer = sc.next();
			String city = sc.next();
			
			Customer c = new Customer();
			c.setId(id);
			c.setCustomer(customer);
			c.setCity(city);
			c.getId();
			c.getCustomer();
			c.getCity();
			//c.display();
			n++;
		}
		
	}

}
