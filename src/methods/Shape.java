package methods;

public class Shape {

	public static void area() {

		System.out.println("The area of the diffrent shapes");
	}

	public static void area(int side) {
		int area = side * side;
		System.out.println("The area of the sqaure is=:" + area);
	}

	public static void area(int l, int b) {
		int area = l * b;
		System.out.println("The area of the rectangle is=:" + area);
	}

	public static void area(float r) {

		double area = 3.14 * r * r;
		System.out.println("The area of the circle is=:" + area);
	}

	public static void main(String[] args) {
		Shape.area();

		Shape.area(10);

		Shape.area(7.2f);

		Shape.area(10, 20);
	}

}
