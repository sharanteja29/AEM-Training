package Activity7;

import java.util.ArrayList;

public class TestActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(12);
		Square obj2 = new Square(5);
		Rectangle obj3 = new Rectangle(3,6);
		ArrayList<Shape> list = new ArrayList();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		String[] colors = {"Red", "Blue", "Green"};
		System.out.println("Using For-Each Loop");
	    int j = 0;
		for(Shape i:list) {
			i.calculateArea();
			 ((MyColor) i).printColor(colors[j++]);
			
		}
		
	}

}
