package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	
	@Test
	public void test1CalculateArea() {
		Square square = new Square(5,5,5.0);
		double result = square.calculateArea();
		Assert.assertEquals(result, 25);
	}
	
	@Test
	public void test2CalculateArea() {
		Square square = new Square(5,5,0.0);
		double result = square.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateArea() {
		Square square = new Square(5,5,-5.0);
		double result = square.calculateArea();
		Assert.assertEquals(result, 0);
	}
	
	
	
	
	@Test
	public void test1CalculateCircumference() {
		Square square = new Square(5,5,5.0);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 20);
	}
	
	@Test
	public void test2CalculateCircumference() {
		Square square = new Square(5,5,0.0);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test3CalculateCircumference() {
		Square square = new Square(5,5,-5.0);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 0);
	}

}
