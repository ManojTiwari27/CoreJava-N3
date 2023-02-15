package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		System.out.println("Enter id and Password");
		Scanner sc =new Scanner(System.in);
		String id = sc.next();
		String password = sc.next();
		try {
			if(id.equals("tiwarimanoj") && password.equals("India@123")) {
				System.out.println("Credential matched");
			}
			else {
				throw new LoginCredentials("Invalid Details");
			}
			
		}
		catch(LoginCredentials e) {
			System.out.println("Exeption Handled"+e);
		}
		

	}

}
