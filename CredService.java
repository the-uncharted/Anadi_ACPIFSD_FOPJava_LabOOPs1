package CredService;

import java.util.Random;

public class CredService {
	
	public String generateEmailID(String fname, String sname, String string) {
		return fname+"."+sname+"@"+string+".aib.com";
	}

	public char[] generatePassword() {
		String capletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String splchars = "!@#$%^&*";
		String value = capletters+smallletters+numbers+splchars;
		int i;
		char p[] = new char[8];
		
		Random random = new Random();
		for(i=0;i<8;i++) {
			p[i] = value.charAt(random.nextInt(value.length()));
		}
		return p;
	}
	
	public void displayEmpDetails(String fname, String sname, String generateEmailID, char[] genPwd) {
		System.out.println("Employee First Name is "+fname);
		System.out.println("Employee Last Name is "+sname);
		System.out.println("Employee Email ID is "+generateEmailID);
		System.out.println("Employee Password is "+genPwd);
	}
}
