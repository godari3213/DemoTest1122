package FebDemo1.FebDemo1;

import org.testng.annotations.Test;

public class NewTest999 {
  @Test(priority=1)
  public void a() {
	  System.out.println("aaa");
  }
  @Test
  public void b() {
	  System.out.println("bbb");
  }
  @Test
  public void c() {
	  System.out.println("ccc");
  }
  @Test(priority=0)
  public void d() {
	  System.out.println("ddd");
  }
}
