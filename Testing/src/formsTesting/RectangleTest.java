package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
	
	@Test
	public void test1CalculateArea() {
		Rectangle rectangle = new Rectangle(5,6, 5, 6);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 30);
	}
	
	@Test
	public void test2CalculateArea() {
		Rectangle rectangle = new Rectangle(5,6, -5, -6);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateArea() {
		Rectangle rectangle = new Rectangle(5,6, 0, 6);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	
	@Test
	public void test1CalculateCircumference() {
		Rectangle rectangle = new Rectangle(5,6, 5, 6);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 22);
	}
	
	@Test
	public void test2CalculateCircumference() {
		Rectangle rectangle = new Rectangle(5,6, -5, -6);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateCircumference() {
		Rectangle rectangle = new Rectangle(5,6, 0, 6);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}

}
