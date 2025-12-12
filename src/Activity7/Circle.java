package Activity7;

public class Circle extends Shape implements MyColor{
	double radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		double area = 3.14*radius*radius;
		System.out.println("The Radius of the Circle is " + area );	
	}

	@Override
	public void printColor(String color) {
		// TODO Auto-generated method stub
		System.out.println(color);
		
	}
	
 
}
