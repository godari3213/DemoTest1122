package BOA21.BOA21;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest401 {
  @Test(dataProvider = "sirnininsad")
  public void login(String name, String location) {
//	  System.out.println("name is:"+name+"\tlocation is :"+location);
	  System.out.println("name is:"+name);
	  System.out.println("name is:"+location);
  }

  @DataProvider
  public Object[][] sirnininsad() {
    return new Object[][] {
      new Object[] { "srinivas", "Hyd" },
      new Object[] { "Accenture", "India" },
    };
  }
}
