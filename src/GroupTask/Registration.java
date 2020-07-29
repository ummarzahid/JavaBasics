package GroupTask;

//Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. 
//After creating an object of the class user should be able to call methods and 
//in each method separately pass values to set users email, username and password. 
//Requirements: 
//Valid email consider to be only yahoo
//Valid userName and password cannot be empty and should be of length larger than 6 characters. 
//Also valid password cannot contain userName.

public class Registration {

	private String email;
	private String userName;
	private String password;

	Registration(String email, String userName, String password) {
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public void email() {
		if (email.equalsIgnoreCase("yahoo")) {
			System.out.println(email);
		} else {
			System.out.println("please enter valid yahoo email");
		}
	}

	public void userName() {
		if (userName == "" || userName.length() <= 6) {
			System.out.println("user name cannot be less than 8 characters");
		}else {
			System.out.println("userName");
		}
	}

	public void password() {
		if (password == "" || password == userName || password.length() <= 6) {
			System.out.println("Please enter the valid password");
		}else {
			System.out.println(password);
		}
	}

	public static void main(String[] args) {

		Registration r = new Registration("yahoo", "ummar123", "abs6448");
		r.email();
		r.password();
		r.userName();

	}

}
