package com.cybertek.reviews.day02_BEN;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc04 {

    public static void main(String[] args) {
        /*
go to http://practice.cybertekschool.com/multiple_buttons
click on button1 with xpath locator
Verify Expected: “Clicked on button one!”

 */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement text = driver.findElement(By.xpath("//p[@id='result'] "));
       // String texttext=text.getText();
        String texttext= text.getText();

        System.out.println("texttext = " + texttext);


        if (texttext.equalsIgnoreCase("Clicked on button one!")){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }


        driver.quit();



    }














}
