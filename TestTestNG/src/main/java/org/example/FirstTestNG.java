package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestNG {

  //  @Test
    public void checkingAssertion(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("youtube.com");

    }
}
