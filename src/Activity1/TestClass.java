package Activity1;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate startDate = new MyDate(11,11,12);
		MyDate endDate = new MyDate(12,12,12);
		Attendance attend = new Attendance("Sharan", 101, startDate, true);
		Training obj = new Training("Sharan",startDate,endDate , "Teja", 10, "AEM", attend);
		System.out.println(obj.toString());
		
	}

}
