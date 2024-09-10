package Task1_Betul;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {
    @Test
    public void Test2(){
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement element1=driver.findElement(By.xpath("//a[text()='Hesap Aç']"));
        element1.click();
        MyFunc.Bekle(2);

        WebElement element2=driver.findElement(By.xpath("(//*[@class='frm_v8'])[4]/input"));
        element2.sendKeys("Betül!");
        MyFunc.Bekle(2);

        WebElement element3=driver.findElement(By.xpath("(//*[@class='frm_v8'])[5]/input"));
        element3.sendKeys("Gözlükoğlu!");
        MyFunc.Bekle(2);

        WebElement element4=driver.findElement(By.xpath("(//*[@class='frm_v8'])[6]/input"));
        element4.sendKeys("gozlukoglubetul@gmail.com");
        MyFunc.Bekle(2);

        WebElement element5=driver.findElement(By.xpath("(//*[@class='frm_v8'])[7]/input"));
        element5.sendKeys("gozlukoglubetul@gmail.com");
        MyFunc.Bekle(2);

        WebElement element6=driver.findElement(By.xpath("(//*[@class='frm_v8'])[8]/input"));
        element6.sendKeys("Betul1234");
        MyFunc.Bekle(2);

        WebElement element7=driver.findElement(By.xpath("(//*[@class='frm_v8'])[9]/input"));
        element7.sendKeys("Betul1234");
        MyFunc.Bekle(2);



        WebElement element10=driver.findElement(By.xpath("(//option[@value='34'])"));
        element10.click();
        MyFunc.Bekle(2);

        WebElement element11=driver.findElement(By.xpath("(//select[@id='locds'])"));
        element11.sendKeys("Bahçelievler");
        MyFunc.Bekle(2);


        WebElement element15=driver.findElement(By.xpath("//*[@class='chbx_v8']/label/input"));
        element15.click();
        MyFunc.Bekle(2);

        WebElement element16=driver.findElement(By.xpath("//*[@class='chbx_v8'][2]/following-sibling::input[2]"));
        element16.click();



    }
}

