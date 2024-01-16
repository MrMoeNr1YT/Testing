package formsTesting;

public class Rectangle extends Form {

	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		if(length<=0||width<=0) {
			System.err.println("Keine Zahlen unter 0 erlaubt! ");
			return;
		}else if(length > 0&&width > 0){
			this.length = length;
			this.width = width;
		}
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double calculateArea() {
		return this.width*length;
	}
//TODO: ausgebessert fehler mit CalculateArea, sowie fehler mit calculateCirmference
	
	
	public double calculateCircumference() {
		return ((this.width+this.length)*2);
	}
	
	public String toString() {
		return "Rectangle (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.getWidth() + " and length = " + this.getLength(); 
	}
	
}
