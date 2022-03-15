public class CircleWithException {
	private double radius;
	public static final double PI = 3.14;
	
	
	public CircleWithException() {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if (radius < 1) {
			throw new IllegalArgumentException("The radius must be a positive number");
		}else {
			this.radius = radius;
		}
	}
	
	public double getArea() throws Exception {
		double area = PI * this.radius * this.radius;
		if (area >1000) {
			throw new Exception("The area must not be bigger than 1000");
		}else {
			return PI * this.radius * this.radius;
		}
	}
	
	public double getDiameter() {
		return this.radius + this.radius;
	}
}
