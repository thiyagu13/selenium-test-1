package test;

import org.testng.annotations.Test;

public class Test3 {
  @Test(priority=3)
  public void f() {
	  System.out.println("Test 3 log");
  }
}
