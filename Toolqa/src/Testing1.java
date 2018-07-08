import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing1 
{
  @Test
  public void meth1()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.spicejet.com/");
	  
  }
}
