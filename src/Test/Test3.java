package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 extends Base {
	//Data Driven testing
	@Test(dataProvider="ReadExcel")
	public  void tc04(String val,String val1)
	{
	    System.out.println("Username:" +val);
	    System.out.println("PWD:" +val1);
	}
	}
