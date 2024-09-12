package TC_0500_Order_List_Check;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0501_Successful extends BaseDriver{

    @Test
    public void test() {

        driver.get("https://www.akakce.com/akakcem/");
        MyFunc.Bekle(2);

        WebElement eposta = driver.findElement(By.xpath("//span[@class='frm_v8']/input[@id='life']"));
        eposta.sendKeys("muhammetyazici61@gmail.com");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.cssSelector("[class='frm_v8']>input[type='password'][name='lifp']"));
        sifre.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement girisyap = driver.findElement(By.cssSelector("[id='lfb']"));
        girisyap.click();
        MyFunc.Bekle(2);

        WebElement siparislerim = driver.findElement(By.xpath("//ul[@id='AL']/li[1]/a[1]"));
        siparislerim.click();
        MyFunc.Bekle(2);

        WebElement mesaj = driver.findElement(By.xpath("//div[text()='Kayıtlı siparişiniz bulunmuyor.']"));

        if (mesaj.getText().equalsIgnoreCase("Kayıtlı siparişiniz bulunmuyor.") == mesaj.isDisplayed()) {
            System.out.println("Kayıtlı siparişiniz bulunmuyor.");
        } else
            System.out.println("siparişleriniz bulunmaktadır");


        MyFunc.Bekle(2);
        BekleKapat();


    }

}
