package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	
	@Test
	public void testCalculateArea() {
		Square square = new Square(5,5,5.0);
		double result = square.calculateArea();
		Assert.assertEquals(result, 25);
	}
	
	
	
	
	@Test
	public void testCalculateCircumference() {
		Square square = new Square(5,5,5.0);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 20);
	}

}
