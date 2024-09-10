package Task2_Alper;

import Utlity.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class placeholder {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.akakce.com/");

        WebElement profil=driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        profil.click();

        WebElement Eposta=driver.findElement(By.xpath("//*[@id='life']"));
        Eposta.sendKeys("alpeay98@gmail.com");

        WebElement sifre=driver.findElement(By.xpath("//*[@id='lifp']"));
        sifre.sendKeys("Alper123\"");


        WebElement GirişYap=driver.findElement(By.xpath("//*[@id='lfb']"));
        GirişYap.click();

        MyFunc.Bekle(2);


        WebElement find=driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));


        Assert.assertTrue("Aranılan kelime bulunamadı", find.getText().equals("Alper"));



        MyFunc.Bekle(2);
        driver.quit();


        }

    }
