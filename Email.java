package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	public String email;
	private String companySuffix = "xyz.com";
	private String alternateEmail;
	private int mailboxCapacity=500;
	private int defaultlength = 8;

	// Constructor to get the first and the last name
	public Email(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname = lastname;
		//System.out.println("Email Created for " + this.firstname + ' ' + this.lastname);

		// calling method asking for Department & returning String Department
		this.department = setDepartment();
		//System.out.println("Department is: " + this.department);

		// calling function which randomly generates password
		this.password = randomPassword(defaultlength);
		System.out.println("Password is: " + this.password);

		// Generating Complete Email address
		this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Email:" + this.email);

	}

	// Function to input Department
	private String setDepartment() {
		System.out.print("Enter Department Code for "+firstname+" "+lastname+" : \n1 for Accounts\n2 for Sales\n3 for Dev\n0 for None\n: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "accounts";
		} else if (depChoice == 2) {
			return "sales";
		} else if (depChoice == 3) {
			return "dev";
		} else {
			return "";
		}
	}

	// Function to generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#@$%!";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	 
	//************************** DATA Binding and DATA hiding*****************************
	// Change the password
	public void changePassword(String pwd) {
		this.password=pwd;
	}

	//Function to Set mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;	
	}
	

	// Set an alternate Email
	public void setAlternateEmail(String altemail) {
		this.alternateEmail=altemail;
	}
	
	//Get Methods to display mailbox capacity, changed password, alternate email
	public int getMailboxCapacity() {return this.mailboxCapacity;}
	public String getAlternateEmail() {return this.alternateEmail;}
	public String getPassword() {return this.password;}
	
	// Display function to display Employee Email details
	public String display() {
		return "Name: "+firstname+" "+ lastname +"\nCompany Email: "+ email +  "\nMailbox Capacity: "+this.mailboxCapacity;
		
	}
	
}
