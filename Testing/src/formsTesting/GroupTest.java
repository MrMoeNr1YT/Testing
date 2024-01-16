package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test
	public void test1CalculateArea() {
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
	
	@Test
	public void testFindBiggestForm() {
		Circle circle = new Circle(1,1,1);
		Rectangle rectangle = new Rectangle(5,6, 5, 6);
		Square square = new Square(5,5,5.0);
		Group group = new Group();
		group.addForm(circle);
		group.addForm(rectangle);
		group.addForm(square);
		Form result = group.findBiggestForm();
		Assert.assertEquals(result, rectangle);
	}

}
