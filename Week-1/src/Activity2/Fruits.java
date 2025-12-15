package Activity2;

public class Fruits {
	String fruitName;
	int fruitQuantity;
	String fruitColor;
	

	public Fruits(String fruitName, int fruitQuantity, String fruitColor) {
		super();
		this.fruitName = fruitName;
		this.fruitQuantity = fruitQuantity;
		this.fruitColor = fruitColor;
		
	}
	


	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitQuantity=" + fruitQuantity + ", fruitColor=" + fruitColor
				+ "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits arr[] = new Fruits[5];
		arr[0] = new Fruits("Mango",22,"Yellow");
		arr[1] = new Fruits("Apple",2,"Red");
		arr[2] = new Fruits("Pineapple",12,"Brown");
		arr[3] = new Fruits("Watermelon",32,"Green");
		arr[4] = new Fruits("Dragon Fruit",42,"Pink");
		
		for(Fruits i:arr) {
			System.out.println(i.toString());
		}

	}

}
