package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {

	  @Test
	  public void testFindMax1() {
		  Calculation c = new Calculation();
		  int [] arr= {4,5,6,7};
		  int result = c.findMax(arr);
		  Assert.assertEquals(result, 7);
	  }
	  
	  @Test
	  public void testFindMax2() {
		  Calculation c = new Calculation();
		  int [] arr= {7,5,6,4};
		  int result = c.findMax(arr);
		  Assert.assertEquals(result, 7);
	  }
	
	  @Test
	  public void testFindMax3() {
		  Calculation c = new Calculation();
		  int [] arr= {7,5,7,6};
		  int result = c.findMax(arr);
		  Assert.assertEquals(result, 7);
	  }
	  
	  @Test
	  public void testFindMax4() {
		  Calculation c = new Calculation();
		  int [] arr= {0};
		  int result = c.findMax(arr);
		  Assert.assertEquals(result, 0);
	  }
	  
	  @Test
	  public void testFindMax5() {
		  Calculation c = new Calculation();
		  int [] arr= {};
		  int result = c.findMax(arr);
		  Assert.assertEquals(result, 0);
	  }
	  
	  
	  
	  @Test
	  public void testCube1() {
		  Calculation c = new Calculation();
		  int result = c.cube(5);
		  Assert.assertEquals(result, 125);
	  }
	  
	  @Test
	  public void testCube2() {
		  Calculation c = new Calculation();
		  int result = c.cube(-5);
		  Assert.assertEquals(result, 0);
	  }
	  
	  @Test
	  public void testCube3() {
		  Calculation c = new Calculation();
		  int result = c.cube(0);
		  Assert.assertEquals(result, 0);
	  }
}

