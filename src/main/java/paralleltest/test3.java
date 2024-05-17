package paralleltest;

import org.testng.annotations.Test;

public class test3 {
	  @Test
	  public void f() {
		  
		  System.out.println("test3 method 1:"+Thread.currentThread().getId());
	  }
	  @Test
	  public void g() {
		  
		  System.out.println("test3 method 2:"+Thread.currentThread().getId());
	  }
	  @Test
	 public void h() {
		  
		  System.out.println("test3 method 3:"+Thread.currentThread().getId());
	  }
	  
}
