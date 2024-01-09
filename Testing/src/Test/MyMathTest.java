package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {

  @Test
  public void testAddition() {
	  MyMath math = new MyMath();
	  int result = math.add(3, 5);
	  Assert.assertEquals(result, 8);
  }
  
  @Test
  public void testSubtraction() {
	  MyMath math = new MyMath();
	  int result = math.subtract(10, 4);
	  Assert.assertEquals(result, 6);
  }
  
  @Test
  public void testMultiplication() {
	  MyMath math = new MyMath();
	  int result = math.multiply(10, 4);
	  Assert.assertEquals(result, 40);
  }
  
  @Test
  public void testDivision() {
	  MyMath math = new MyMath();
	  int result = math.divide(40, 5);
	  Assert.assertEquals(result, 8);
  }
  
  @Test
  public void testDoubleDivision() {
	  MyMath math = new MyMath();
	  double result = math.divide(1, 3);
	  Assert.assertEquals(result, 1/3);
  }
  
  @Test
  public void testComparisson() {
	  MyMath math = new MyMath();
	  boolean result = math.comparisson(1, 3);
	  Assert.assertEquals(result, false);
  }


}
