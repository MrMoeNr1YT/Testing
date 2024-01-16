package formsTesting;

public class Square extends Form {
	
	double width = 0;
	
	public Square(double x, double y, double width) {
		super(x, y);
		if(width<=0) {
			System.err.println("Keine Zahlen unter 0 erlaubt! ");
			return;
		}else if(width > 0){
			this.width = width;
		}
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



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
