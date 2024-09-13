package TC_0400_Login_Scenario;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class _0402_Invalid_Login_Incorrect_Password extends BaseDriver {

    @Test
    public void Test0402(){

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Giriş Yap')]"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[1]/span[@class='frm_v8']/input[@class='t' and @type='email']"));
        email.sendKeys("psycheeros44@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(".");
        MyFunc.Bekle(2);

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[@action='/akakcem/nojs/']/input[@type='submit' and @value='Giriş yap']"));
        ////input[@type='submit' and @value='Giriş yap']
        submitButton.click();
        MyFunc.Bekle(2);


        // Yanlış şifre girdiğimizde oluşan hata mesajını bulma
        WebElement passwordWrongMessage = driver.findElement(By.xpath("//div[@class='alertX t2']/p[contains(text(),'Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.')]"));

        MyFunc.Bekle(2);

        // Hata mesajı görünür mü kontrol et
        if (passwordWrongMessage.isDisplayed()) {
            System.out.println("Hata mesajı göründü: Şifre doğru değil.");
        } else {
            System.out.println("Hata mesajı görünmedi, test başarısız.");
        }

        assert passwordWrongMessage.isDisplayed() : "Giriş başarısız, login Basarili Mesaji görünmedi!";

        driver.quit();




    }
}
