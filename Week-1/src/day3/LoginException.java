package day3;

public class LoginException extends Exception                 // Exception
{
	public LoginException() {
		super("Please Enter Valid Credentials");
	}
	public LoginException(String message) {
		super(message);
	}
}