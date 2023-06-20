package project_5_com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_5_Com_ultimateqa
{
    public static void main(String[] args)
    {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";

        //Launch Browser
        WebDriver driver = new ChromeDriver();

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
        WebElement emailField = driver.findElement(By.name("user[email]"));

        //Type User Name into Username Field
        emailField.sendKeys("abc.Shah@gmail.com");

        //Find Element password Field
        WebElement passwordField = driver.findElement(By.name("user[password]"));

        //Type Passowrd into Password field
        passwordField.sendKeys("shah123344");

        //Give Implicit timeout to the Browser
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


        //Close the Browser
        driver.close();
    }

}
