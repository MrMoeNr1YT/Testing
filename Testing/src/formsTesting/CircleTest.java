package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {
	
	@Test
	public void test1CalculateArea() {
		Circle circle = new Circle(1,1,1);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 3.141592653589793);
	}
	
	@Test
	public void test2CalculateArea() {
		Circle circle = new Circle(1,1,0);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateArea() {
		Circle circle = new Circle(-1,-1,-1);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test1CalculateCircumference() {
		Circle circle = new Circle(1,1,1);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 6.283185307179586);
	}
	
	@Test
	public void test2CalculateCircumference() {
		Circle circle = new Circle(1,1,0);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateCircumference() {
		Circle circle = new Circle(1,1,-1);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}

}
