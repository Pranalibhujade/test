package Test;


import org.testng.Assert;
import org.testng.annotations.Test;
 public class Test1 extends Base
{

	@Test(priority=1,description="Login test case positive scenario")
	public void tc01()
	{
		System.out.println("Inside tc01");
		String txt="Drop";
		Assert.assertEquals(txt, "Dropped!");
	}
	
	@Test(priority=5)
	public void tc02()
	{
		System.out.println("Inside tc02");
		Assert.assertEquals(true, true);
	}
	@Test(priority=-3)
	public void tc03()
	{
		System.out.println("Inside tc03");
		Assert.assertFalse(true);
	}
	
}
