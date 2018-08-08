package SeleParallel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest extends  TestBase
{
    /**
     * Rigorous Test :-)
     */



    @Test
    public void launchBrowser() throws InterruptedException {


        driver.get("https://google.com");

        //driver.findElement(By.linkText("Video")).click();


        Thread.sleep(6000);


    }
}
