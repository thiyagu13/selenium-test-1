package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
  @Test(priority=2)
  public void Testcase1() {
	  System.out.println("Test case 2 log");
	  String actual = "My Test";
	  String expected = "My Test";
	  //Assert.fail("Test was failed");
	  Assert.assertEquals(actual, expected);
	  
  }
}
