package lab;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random rd = new Random();
		int length = rd.nextInt(10);
		int width = rd.nextInt(10);
		int edge = rd.nextInt(10);
		int radius = rd.nextInt(10);

		Rectangle rectangle = new Rectangle(length, width);
		Square square = new Square(edge);
		Circle circle = new Circle(radius);

		System.out.println("Diện tích hình chữ nhật có chiều dài " + length + " và chiều rộng " + width + " là: "
				+ rectangle.area());
		System.out.println("Chu vi hình chữ nhật có chiều dài " + length + " và chiều rộng " + width + " là: "
				+ rectangle.perimeter());
		System.out.println("\nDiện tích hình vuông có cạnh " + edge + " là: " + square.area());
		System.out.println("Chu vi hình vuông có cạnh " + edge + " là : " + square.perimeter());
		System.out.println("\nDiện tích hình tròn có bán kính " + radius + " là: " + circle.area());
		System.out.println("Chu vi hình tròn có bán kính " + radius + " là: " + circle.perimeter());

	}

}
