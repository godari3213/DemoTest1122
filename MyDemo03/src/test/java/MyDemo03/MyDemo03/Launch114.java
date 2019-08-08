package MyDemo03.MyDemo03;

import org.testng.annotations.Test;

public class Launch114 {
  @Test(priority=1)
  public void Launch()
  {
	  System.out.println("launch here");
  }
  @Test(priority=3)
  public void Login() 
  {
	  System.out.println("Login here");
  }
  @Test(priority=2)
  public void register() 
  {
	  System.out.println("register here");
  }
  @Test(priority=4)
  public void Search() 
  {
	  System.out.println("Search here");
  }
  @Test(priority=5)
  public void AddCart() 
  {
	  System.out.println("AddCart here");
  }
  @Test(priority=6)
  public void RemoveCart() 
  {
	  System.out.println("RemoveCart here");
  }
  @Test(enabled=false)
  public void abcd()
  {
	  System.out.println("abcd here");
  }
  @Test(enabled=false)
  public void gfd()
  {
	  System.out.println("gfd here");
  }
  @Test(priority=0,enabled=false)
  public void mno()
  {
	  System.out.println("mno here");
  }
}