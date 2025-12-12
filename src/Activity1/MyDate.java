package Activity1;

public class MyDate {
int dd,mm,yyyy;

public MyDate(int dd, int mm, int yyyy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yyyy = yyyy;
}

@Override
public String toString() {
	return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
}


}
