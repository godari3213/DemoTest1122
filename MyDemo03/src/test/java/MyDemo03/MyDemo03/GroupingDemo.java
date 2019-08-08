package MyDemo03.MyDemo03;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(groups= {"Sanity"})
  public void a() {
	  System.out.println("a");
  }
  @Test(groups= {"Sanity","Regression"})
  public void b() {
	  System.out.println("b");
  }
  @Test(groups= {"Sanity", "Smoke"})
  public void c() {
	  System.out.println("c");
  }
}
