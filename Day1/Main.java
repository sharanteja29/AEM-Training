class A {
    A(int x, int y) {
        System.out.println("A constructor: x=" + x + ", y=" + y);
    }
}

class B extends A {
    B(int x, int y, int z) {
        super(x, y);
        System.out.println("B constructor: z=" + z);
    }
}

class C extends B {
    C(int x, int y, int z, int k) {
        super(x, y, z);
        System.out.println("C constructor: k=" + k);
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C(10, 20, 30, 40);
    }
}
