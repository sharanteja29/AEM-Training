package Activity7;

public class Rectangle extends Shape implements MyColor{
int length;
int breath;
public Rectangle(int length,int breath) {
	this.length = length;
	this.breath = breath;
}
@Override
void calculateArea() {
	// TODO Auto-generated method stub
	int area = length*breath;
	System.out.println("The Area of the Rectangle is "+area);
}
@Override
public void printColor(String color) {
	// TODO Auto-generated method stub
	System.out.println(color);
	
}

}
