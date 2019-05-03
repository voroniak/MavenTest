import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver" ,  "D:\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
    }
}
