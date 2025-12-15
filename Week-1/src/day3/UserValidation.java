package day3;

public class UserValidation {
	static void login(String name,String pass)
	{
	if(name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("pass"))
	{
		System.out.println("Welcome to the website");
	}
	else {
		try {
			throw new LoginException("Try Again");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("admin","pass2");

	}

}
