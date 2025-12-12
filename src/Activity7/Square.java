package Activity7;

public class Square extends Shape implements MyColor{
 int side;
public Square(int side) {
	this.side = side;
}
@Override
void calculateArea() {
	// TODO Auto-generated method stub
	int area = side*side;
	System.out.println("The area of the square is " + area);
}
@Override
public void printColor(String color) {
	// TODO Auto-generated method stub
	System.out.println(color);
	
}
}
