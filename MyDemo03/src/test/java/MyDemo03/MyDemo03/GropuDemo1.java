package MyDemo03.MyDemo03;

import org.testng.annotations.Test;

public class GropuDemo1 {
  @Test(groups= {"Assembly","Smoke","Sanity"})
  public void login() {
	  System.out.println("login");
  }
  @Test(groups= {"Assembly","Regression"})
  public void launchapp() {
	  System.out.println("launchapp");
  }
  @Test(groups= {"Sanity"})
  public void closeapp() {
	  System.out.println("closeapp");
  }
  @Test(groups= {"Assembly"})
  public void register() {
	  System.out.println("register");
  }
  @Test(groups= {"Sanity","Regression"})
  public void AddPayee() {
	  System.out.println("AddPayee");
  }
  @Test(groups= {"Assembly"})
  public void NEFT() {
	  System.out.println("NEFT");
  }
  @Test(groups= {"Assembly"})
  public void RTGS() {
	  System.out.println("RTGS");
  }
  
  @Test(groups= {"Assembly"})
  public void IMPS() {
	  System.out.println("IMPS");
  }
  @Test(groups= {"Sanity"})
  public void UpdateProfile() {
	  System.out.println("UpdateProfile");
  }
}
