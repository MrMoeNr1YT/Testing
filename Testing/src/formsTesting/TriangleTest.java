package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
	
	@Test
	public void test1CalculateArea() {
		Triangle triangle = new Triangle(5,6, 5, 5, 5, 5);
		double result = triangle.calculateArea();
		Assert.assertEquals(result, 12.5);
	}
	
	@Test
	public void test2CalculateArea() {
		Triangle triangle = new Triangle(5,6, -5, -6,-5,-5);
		double result = triangle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateArea() {
		Triangle triangle = new Triangle(5,6, 0, 6,5,5);
		double result = triangle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	
	@Test
	public void test1CalculateCircumference() {
		Triangle triangle = new Triangle(5,6, 5, 6,5,5);
		double result = triangle.calculateCircumference();
		Assert.assertEquals(result, 16);
	}
	
	@Test
	public void test2CalculateCircumference() {
		Triangle triangle = new Triangle(5,6, -5, -5,-5,-5);
		double result = triangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateCircumference() {
		Triangle triangle = new Triangle(5,6, 0, 6,0,0);
		double result = triangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}

}
