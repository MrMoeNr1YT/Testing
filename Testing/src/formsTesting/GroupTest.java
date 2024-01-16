package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test
	public void testCalculateArea() {
		Circle circle = new Circle(1,1,1);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 3.141592653589793);
	}
	
	
	@Test
	public void testCalculateCircumference() {
		Circle circle = new Circle(1,1,1);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 6.283185307179586);
	}

}
