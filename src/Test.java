import java.util.*;
interface app{
	void show();
}

class A {
    void show() { System.out.println("A"); }
}

class B extends A {
    void show() { System.out.println("B"); }
}

class C extends A {
    void show() { System.out.println("C"); }
}

public class Test implements app {
	
	public void show() {
		System.out.println("Show method is being executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method s
		A obj = new C();
		obj.show();
		app oj = new Test();
		oj.show();
		
	}

}
