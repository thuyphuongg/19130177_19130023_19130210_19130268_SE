package lab;

public class Rectangle implements Shape {
	private double width;
	private double height;
	

	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}

	// Phuong thuc tinh dien tich hinh chu nhat
	@Override
	public double area() {
		return width*height;

	}

	// Phuong thuc tinh chu vi hinh chu nhat
	@Override
	public double perimeter() {
		return (width+height)/2;
	}
}