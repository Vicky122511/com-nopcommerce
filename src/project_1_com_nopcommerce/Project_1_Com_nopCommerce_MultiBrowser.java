package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_1_Com_nopCommerce_MultiBrowser
{

    static String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String browser = "Edge";

    //Launch Chrome Driver
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

        //Open URL into Browser
        driver.get(baseUrl);

        //Maximise the Window
        driver.manage().window().maximize();

        //Implicit wait for driver
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("1. Title of the Page : "+ driver.getTitle());

        System.out.println("2. Page Source : "+ driver.getPageSource());

        System.out.println("3. Current URL : "+driver.getCurrentUrl());
        //Find the email Web Element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type Email Id in Email Id Field
        emailField.sendKeys("abc.shah@gmail.com");

        //Find out the Password Field
        WebElement passwordField = driver.findElement(By.id("Password"));

        //Type password in Password Field
        passwordField.sendKeys("Shah@123");

        //Close Browser
        driver.close();
    }

}
