package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) {

        // 1-Setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2-Create instance of the Selenium Webdriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // 3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");  //"https://tesla.com" also can use like that

        // get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // Stop code execution for 3 seconds
        // Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

       // use selenium to navigate forward
       driver.navigate().forward();

       //use selenium to navig refresh
        driver.navigate().refresh();

        //use navg.to
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();



        //  System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);


        //get the current URL using Selenium
      currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);








    }
}

