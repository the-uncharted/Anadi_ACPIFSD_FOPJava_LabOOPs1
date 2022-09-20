package application;

import java.util.Scanner;

import Model.EmployeeInfo;
import CredService.CredService;

public class DriverClass {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Name");
	String fn = scanner.next();
	System.out.println("Enter Last Name");
	String ln = scanner.next();
	EmployeeInfo e1 = new EmployeeInfo(fn,ln);
	
	CredService cs = new CredService();
	String generateEmail = "";
	char[] genPwd = null;
	
	do {
	
		System.out.println("Please choose your department");
		System.out.println("1. Tech");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		System.out.println("5. Exit");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			generateEmail = cs.generateEmailID(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(),"tech");
			genPwd = cs.generatePassword();
			break;
		case 2:
			generateEmail = cs.generateEmailID(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(),"admin");
			genPwd = cs.generatePassword();
			break;
		case 3:
			generateEmail = cs.generateEmailID(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(),"hr");
			genPwd = cs.generatePassword();
			break;
		case 4:
			generateEmail = cs.generateEmailID(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase(),"legal");
			genPwd = cs.generatePassword();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Please Enter Valid Choice");
		}
		
		cs.displayEmpDetails(e1.getFirstName(), e1.getLastName(), generateEmail, genPwd);

}while(true);
}
}
