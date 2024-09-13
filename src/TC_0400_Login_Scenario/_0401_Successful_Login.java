package TC_0400_Login_Scenario;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _0401_Successful_Login extends BaseDriver {

    @Test
    public void Test0401(){

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Giriş Yap')]"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[1]/span[@class='frm_v8']/input[@class='t' and @type='email']"));
        email.sendKeys("psycheeros44@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("DenemeDeneme1234");
        MyFunc.Bekle(2);

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='f_w_v8']/div[2]/form[@action='/akakcem/nojs/']/input[@type='submit' and @value='Giriş yap']"));
        ////input[@type='submit' and @value='Giriş yap']
        submitButton.click();
        MyFunc.Bekle(2);

        // Sağ üst köşede "Psyche" adını bulma
        WebElement kullaniciAdi = driver.findElement(By.xpath("//div[@class='g-3_v8 hm_hp_v8']/div[1]/i/a[@rel='nofollow' and @href='/akakcem/' and text()='Psyche']"));

        if (kullaniciAdi.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(kullaniciAdi).perform();
            System.out.println("Pscyhe is visible");
        } else {
            System.out.println("Psyche is not visible");
        }

        // hover
        Actions actions = new Actions(driver);

        actions.moveToElement(kullaniciAdi).pause(Duration.ofSeconds(3)).build().perform();
        //actions.moveToElement(kullaniciAdi).build().perform();
        //new Actions(driver).moveToElement(kullaniciAdi).build().perform();
        MyFunc.Bekle(5);

        // Menü açılması ÇALIŞMIYOR!!!!!!!
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement hesabim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@rel='nofollow'][contains(text(),'Hesabım')]")));

        //WebElement hesabim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Hesabım')]")));

        // Hesabım menüsünü kontrol etme

        WebElement hesabim = driver.findElement(By.xpath("//a[contains(text(),'Hesabım')]"));

        if (hesabim.isDisplayed()) {
            System.out.println("Hesabım menüsü mevcut.");
        } else {
            System.out.println("Hesabım menüsü mevcut değil.");
        }

        //WebElement loginBasariliMesaji = driver.findElement(By.xpath("//div[contains(text(),'Başarıyla giriş yaptınız')]"));

        //assert loginBasariliMesaji.isDisplayed() : "Giriş başarısız, login Basarili Mesaji görünmedi!";

        driver.quit();


    }


}
