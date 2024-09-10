package Task6_Sefacan;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class Task6_01_Sefacan extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.akakce.com/ikinci-el-firsatlar/");

        WebElement login = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
        login.click();
        MyFunc.Bekle(2);

        WebElement Email = driver.findElement(By.xpath(("(//input[@class='t'])[2]")));
        Email.sendKeys("sefacanbasoglu11@gmail.com");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.xpath("(//input[@class='t'])[3]"));
        sifre.sendKeys("Sefa1234.");
        MyFunc.Bekle(2);

        WebElement Giris = driver.findElement(By.xpath(("//input[@id='lfb']")));
        Giris.click();
        MyFunc.Bekle(2);



        WebElement hesap=driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        hesap.click();
        MyFunc.Bekle(2);

        WebElement hesabim=driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]"));
        hesabim.click();
        MyFunc.Bekle(2);

        WebElement mesaj=driver.findElement(By.xpath("//a[@href='/akakcem/mesajlarim/']"));
        mesaj.click();
        MyFunc.Bekle(5);
        driver.quit();




    }
}
