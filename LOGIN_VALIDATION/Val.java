package validation;

import java.util.Scanner;

public class Val {
	
	private String user,pass;
	private String userp,passp;
	
	public Scanner scan = new Scanner(System.in);
	
	public Val(String userp,String passp) {
		this.userp = userp;
		this.passp = passp;
	}
	
	public void getInfo() {
		System.out.print("enter username:");
		user = scan.nextLine();
		System.out.print("enter password:");
		pass = scan.nextLine();
		validation();
	}

	public void validation() {
		if(!user.equals(userp)) {
			System.out.println("wrong user!");
		}else {
			if(pass.equals(passp)) {
				System.out.print("login succesfuly");
			}else {
				System.out.println("wrong pass!");
				
			}
			
		}
		
	}
	

}
