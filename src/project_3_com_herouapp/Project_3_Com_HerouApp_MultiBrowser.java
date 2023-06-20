package project_3_com_herouapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_3_Com_HerouApp_MultiBrowser
{
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static String browser="Edge";
    //Launch Browser
    static WebDriver driver;

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Name");
        }
        //Open UrL
        driver.get(baseUrl);

        //Maximise the Window
        driver.manage().window().maximize();


        //Get The Title of Page
        System.out.println("1. Title of Page : "+driver.getTitle());

        //Get Current URL of Page
        System.out.println("2. Current URL of page : "+driver.getCurrentUrl());

        //Get Page Source
        System.out.println("3. Page Source : "+driver.getPageSource());

        //Find Element Email Field
        WebElement emailField = driver.findElement(By.id("username"));

        //Type User Name into Username Field
        emailField.sendKeys("abc.Shah@gmail.com");

        //Find Element password Field
        WebElement passwordField = driver.findElement(By.id("password"));

        //Type Passowrd into Password field
        passwordField.sendKeys("shah123344");

        //Give Implicit timeout to the Browser
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


        //Close the Browser
        driver.close();
    }
}
