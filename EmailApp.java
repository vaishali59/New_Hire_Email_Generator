package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Harry","Potter");
		
		//Displaying Name. Company Email, Mailbox limit details for the employee
		System.out.println(em1.display());
		
	}

}
