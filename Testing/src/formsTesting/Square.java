package formsTesting;

public class Square extends Form {
	
	double width = 0;
	
	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}

//TODO änderung: alles mit rectangle entfernt und width hinzugefügt
	//TODO neue getter setter und calcarea und calc circum geändert

	public double calculateArea() {
		return Math.pow(width, 2);
	}

	public double calculateCircumference() {
		return 4*width;
	}
	
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.getWidth();
	}
	

}
