package test;

import org.testng.annotations.Test;

public class Test1 {
  @Test(priority=1)
  public void f() {
	  System.out.println("Test 1 log");
  }
}
