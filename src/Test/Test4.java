package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test4 extends Base{
	
	@Test
	public void switchAlert()
	{
	    WebDriverWait wait=new WebDriverWait(driver,30);	
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/input"))).click();
	    String txt=driver.switchTo().alert().getText();
	    System.out.println(txt);
	    //Handle alert
	    driver.switchTo().alert().accept();
	}

}
