package formsTesting;

public class Triangle extends Form {

	private double a;
	private double b;
	private double c;
	private double h;

	public Triangle(double x, double y, double a, double b, double c, double h) {
		super(x, y);
		if (a <= 0 || b <= 0 || c <= 0 || h <= 0) {
			System.err.println("Keine Zahlen unter 0 erlaubt! ");
			return;
		} else if (a > 0 && b > 0 && c > 0 && h > 0) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.h = h;
		}

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double calculateArea() {
		return c * h * 1 / 2;
	}

	public double calculateCircumference() {
		return a + b + c;
	}

	public String toString() {
		return "Rectangle (" + this.getX() + "|" + this.getY() + ") Side A = " + this.getA() + ") Side B = "
				+ this.getB() + ") Side C = " + this.getC() + " and hight h = " + this.getH();
	}

}
