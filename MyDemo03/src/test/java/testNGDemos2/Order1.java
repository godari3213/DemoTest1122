package testNGDemos2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Order1 {
 @Test(groups={"Sanity", "Assembly"})
  public void login() {
	 System.out.println("Code for login");
  }
 @Test(groups={"Regression", "Assembly"})
 public void logout() {
	 System.out.println("Code for logout");
 }
 @Test(groups={"Sanity", "Regression"})
 public void addtocart() {
	 System.out.println("Code for addtocart");
 }
 @Test(groups={"Assembly"})
 public void payment() {
	 System.out.println("Code for addtocart");
 }
 
 @Parameters({"Location", "Office","DCNO"})
 @Test(groups={"Smoke"})
 
 public void remove(String Location,String Office,String DCNO) {
	 System.out.println("Code for addtocart");
	 System.out.println(Location);
	 System.out.println(DCNO);
	 System.out.println(Office);
	 
 }
}


// Tags :
//	 Grouping
//	 Parameters
//	 Properties file ( read & writing)
//	 Data provider
//	 XML 
//	 tags ordering
//	 HTML report
//	 screenshot
// invocationCount=10
	 
	 
	  