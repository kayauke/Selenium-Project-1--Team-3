package TC_0300_Logout;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TC_0301_Successful extends BaseDriver {

    @Test
    public void Test() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.akakce.com/");
        driver.manage().window().fullscreen();
        MyFunc.Bekle(10);


        WebElement login = driver.findElement(By.xpath("//a[@rel='nofollow' and @href='/akakcem/giris/'][1]"));
        login.click();
        MyFunc.Bekle(3);


        WebElement eposta = driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("yusuffucucu@gmail.com");
        MyFunc.Bekle(2);


        WebElement password = driver.findElement(By.xpath("//input[@type='password' and @id='lifp']"));
        password.sendKeys("Yusuf.0021");
        MyFunc.Bekle(3);

        WebElement giris = driver.findElement(By.xpath("//input[@value='Giriş yap' and @class='s' and @id='lfb']"));
        giris.click();
        MyFunc.Bekle(3);


        WebElement profilicon = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        profilicon.click();
        MyFunc.Bekle(2);

        WebElement cikis = driver.findElement(By.xpath("//a[@href='#Çık']"));
        cikis.click();
        MyFunc.Bekle(3);
        driver.quit();
    }
}
