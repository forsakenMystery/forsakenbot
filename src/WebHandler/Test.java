/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author forsakenmystery
 */
public class Test {

    public static void main(String[] args) {
        OSCheck.OSType ostype = OSCheck.getOperatingSystemType();
        switch (ostype) {
            case Windows:
                System.setProperty("webdriver.chrome.driver", "driver/v91/chromedriver_windows");
                break;
            case MacOS:
                System.setProperty("webdriver.chrome.driver", "driver/v91/chromedriver_mac");
                break;
            case Linux:
                System.setProperty("webdriver.chrome.driver", "driver/v91/chromedriver_linux");
                break;
            case Other:
                System.err.println("Unfamiliar OS");
                break;
        }
        System.setProperty("webdriver.chrome.driver", "driver/v91/chromedriver_linux");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com/");
        driver.manage().window().maximize();
        
    }

}
