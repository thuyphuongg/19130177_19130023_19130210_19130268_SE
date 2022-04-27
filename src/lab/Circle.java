package lab;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

//	Phuong thuc tinh dien tich hinh tron
	@Override
	public double area() {
		return (double) Math.round((Math.PI * radius * radius) * 100) / 100;

	}

//Phuong thuc tinh chu vi hinh tron
	@Override
	public double perimeter() {
		return (double) Math.round((2 * Math.PI * radius) * 100) / 100;

	}
}