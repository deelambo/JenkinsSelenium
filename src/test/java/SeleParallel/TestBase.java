package SeleParallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    RemoteWebDriver driver;

    @Before
    public  void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

        driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),desiredCapabilities);



    }





    @After
    public  void tearDown() {

      driver.close();




    }
}
