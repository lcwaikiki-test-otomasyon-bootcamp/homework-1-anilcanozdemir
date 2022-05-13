import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homework1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Manage/Timeouts
        driver. manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver. manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.lcwaikiki.com/tr-TR/TR/uye-ol");
        WebElement webElementEposta=driver.findElement(By.xpath("//*[@id=\"RegisterFormView_RegisterEmail\"]"));
        webElementEposta.sendKeys("asdasfasdafasd");

        WebElement webElementPassword=driver.findElement(By.xpath("//*[@id=\"RegisterFormView_Password\"]"));
        webElementPassword.sendKeys("123124123123");

        WebElement webElementEpostaError=driver.findElement(By.xpath("//*[@id=\"RegisterFormView_RegisterEmail-error\"]"));
        System.out.println("GELEN HATA :"+webElementEpostaError.getText());

        WebElement webElementPasswordError=driver.findElement(By.xpath("//*[@id=\"RegisterFormView_Password-error\"]"));
        System.out.println("GELEN HATA :"+webElementPasswordError.getText());
    }
}
