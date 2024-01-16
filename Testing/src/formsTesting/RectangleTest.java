package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
	
	@Test
	public void testCalculateArea() {
		Rectangle rectangle = new Rectangle(5,6, 5, 6);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 30);
	}
	
	
	@Test
	public void testCalculateCircumference() {
		Rectangle rectangle = new Rectangle(5,6, 5, 6);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 22);
	}

}
