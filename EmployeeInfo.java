package Model;
import java.io.InputStream;
import java.util.Scanner;

public class EmployeeInfo {

	private String firstName;
	private String lastName;
	
	public EmployeeInfo() {
		this.firstName = "Baburao";
		this.lastName = "Apte";
	}
	
	public EmployeeInfo(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String setLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
