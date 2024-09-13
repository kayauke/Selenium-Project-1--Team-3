package TC_0400_Login_Scenario;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class _0403_Invalid_Login_Incorrect_Email extends BaseDriver {

    @Test
    public void Test0403(){



        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Giriş Yap')]"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[1]/span[@class='frm_v8']/input[@class='t' and @type='email']"));
        email.sendKeys("psycheeros@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("DenemeDeneme1234");
        MyFunc.Bekle(2);

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[@action='/akakcem/nojs/']/input[@type='submit' and @value='Giriş yap']"));
        ////input[@type='submit' and @value='Giriş yap']
        submitButton.click();
        MyFunc.Bekle(2);


        // Yanlış email girdiğimizde oluşan hata mesajını bulma
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alertX t2']/p[contains(text(),'Bu e-postaya kayıtlı bir hesap bulunamadı.')]"));
        MyFunc.Bekle(2);

        // Hata mesajı görünür mü kontrol et
        if (errorMessage.isDisplayed()) {
            System.out.println("Hata mesajı göründü: eMail doğru değil.");
        } else {
            System.out.println("Hata mesajı görünmedi, test başarısız.");
        }

        assert errorMessage.isDisplayed() : "Giriş başarısız, login Basarili Mesaji görünmedi!";

        driver.quit();


    }
}
