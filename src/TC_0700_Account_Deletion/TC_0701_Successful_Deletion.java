package TC_0700_Account_Deletion;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlity.BaseDriver.driver;

public class TC_0701_Successful_Deletion extends BaseDriver {

    @Test
    public void Test1() {
        //Adim 1: Kullanici Akakce.com sitesine giris yapar.
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(3);

        //Adim 2: Kullanici Ana sayfada Giris Yap butonuna tiklar
        WebElement giris = driver.findElement(By.cssSelector("div[id='H_rl_v8']>:nth-child(2)"));
        giris.click();
        MyFunc.Bekle(2);

        //Adim 3: Kullanici Giris icin hesap bilgilerini girer:
        WebElement eposta = driver.findElement(By.cssSelector("input[class='t'][name='life']"));
        eposta.sendKeys("yusuffucucu@gmail.com");

        //Adim 4: Kullanici 'Giris Yap' Butonuna tiklar
        WebElement password = driver.findElement(By.xpath("//*[@id='lifp']"));
        password.sendKeys("Yusuf.0021");
        MyFunc.Bekle(2);

        //Adim 5: Kullanici Hesabina basarili giris yapar.
        WebElement giris2 = driver.findElement(By.cssSelector("#lfb"));
        giris2.click();
        MyFunc.Bekle(2);

        //Adim 6: Kullanici, hesap ayarlari/profil bolumunden "Hesabimi sil" secenegine tiklar.
        WebElement hesabimm = driver.findElement(By.cssSelector("#H_a_v8"));
        hesabimm.click();
        MyFunc.Bekle(2);

        WebElement hesabim2 = driver.findElement(By.linkText("Hesabım"));
        hesabim2.click();
        MyFunc.Bekle(2);

        //Hesap silme kismi aciliyor
        WebElement hesapsil = driver.findElement(By.cssSelector("#AL > li:nth-child(4) > a:nth-child(5)"));
        hesapsil.click();
        MyFunc.Bekle(2);

        //Hesap silmek icin sifre girme kismi
        WebElement passwordsil = driver.findElement(By.xpath("//input[@id=\"p\"]"));
        passwordsil.sendKeys("yanlissifre");

        //Hesap sil onay buton click
        WebElement passwordSilOnay = driver.findElement(By.xpath("//input[contains(@class,\"s save\")]"));
        passwordSilOnay.click();
        MyFunc.Bekle(2);

        //Adim 7: Hesap silme islemi basarili sekilde tamamlandiginda, uygun bir mesajin goruntulendigini kontrol eder.
        //Error Message
        WebElement errorMessage = driver.findElement(By.cssSelector("#m-w > div > div.m-c > div > p"));
        Assert.assertTrue("Hesap Silme islemi gerceklesemedi", errorMessage.isDisplayed());

        MyFunc.Bekle(3);
        //driver.quit();
    }
}