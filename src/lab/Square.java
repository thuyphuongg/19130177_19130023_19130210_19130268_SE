package lab;

public class Square implements Shape {
	private double edge;

	public Square(double edge) {
		this.edge = edge;
	}

	// Phuong thuc tinh dien tich hinh vuong
	@Override
	public double area() {
		return edge * edge;

	}

	// Phuong thuc tinh chu vi hinh vuong
	@Override
	public double perimeter() {
		return edge * 4;
	}
}