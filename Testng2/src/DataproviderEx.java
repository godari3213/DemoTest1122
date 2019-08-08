import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEx {
 // @Test
  //public void logintestcase() {
	  @Test(dataProvider="logindata")
	  public void logintestcase (String uid, String pswrd)
	  {
		  System.out.println("user id:"+ uid);
		  System.out.println("user id:"+ pswrd);
	  }
	  @DataProvider
	  public Object[][] logindata()
	  {
		  Object[][] data = {
		  {"srini", "abs"},
		  {"srini2", "abs2"},
		  {"srini3", "abs3"}
	  };
	  
	  return data;
	  }	
}
