package Activity1;

public class Attendance {
	String pName; 
	int pId;
	MyDate date; 
	boolean flag;
	public Attendance(String pName, int pId, MyDate date, boolean flag) {
		super();
		this.pName = pName;
		this.pId = pId;
		this.date = date;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Attendance [pName=" + pName + ", pId=" + pId + ", date=" + date + ", flag=" + flag + "]";
	}
	
}
