package day3;
 
public class TryException {
 
	void division(int num1 ,int num2) {
		System.out.println("Inside division()");
		int result;
		try 
		{
			System.out.println("Inside TRY");
			if(num2 == 0) 
			{
				throw new ArithmeticException();
			}
			result = num1 / num2;
			System.out.println("Division = "+result);
			int arr[]=new int[2];
			System.out.println(arr[5]);
 
//			try {
//
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
 
		}catch (Exception e) {
			System.out.println("Call to a service provider");
			e.printStackTrace();
		}
//		catch (ArithmeticException e) 
//		{
//			System.out.println("Inside Catch");
//			System.out.println("Please enter the value greater than zero");
////			try {
////
////			} catch (Exception e) {
////				// TODO: handle exception
////			}
//
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Sorry , Element not in exist");
//		}
		finally {
 
			System.out.println("Thank You");
//			try {
//
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
		}		
 
		System.out.println("Outside division()");
	}
 
	public static void main(String[] args) {
		System.out.println("Inside main()");
		TryException cal = new TryException();
		cal.division(20, 0);
 
	}
 
}