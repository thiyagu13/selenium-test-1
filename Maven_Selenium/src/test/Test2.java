package test;

import org.testng.annotations.Test;

public class Test2 {
  @Test(priority=2)
  public void f() {
	  System.out.println("Test 2 log");
  }
}
