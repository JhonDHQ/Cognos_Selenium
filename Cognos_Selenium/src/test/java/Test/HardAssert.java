package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void assertEquals() {
	  int a =10;
	  int b = 30;
	  
	  Assert.assertEquals(a,b); 
  }
  
 @Test
 public void assertNotEquals() 
 {
	 int a = 11;
	 int b = 12;
	 
	 Assert.assertNotEquals(a,b);
 }
 
 @Test
 public void assertTrue() 
 {
	 int a = 6;
	 int c = 5;
	 
	 Assert.assertTrue(a==c);
 }
 @Test
 public void assertFalse() 
 {
	 int d=4;
	 int a=2;
	 Assert.assertFalse(d==a);
 }
 
}

