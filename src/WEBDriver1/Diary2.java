package ru.geekbrains.qa.java2.lesson7_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Diary2 {
    public static final String LOGIN = "tester777";

    public static final String PASSWORD = "tester777";
    public static final String LOGIN_PAGE_URL = "https://www.diary.ru/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get(LOGIN_PAGE_URL);


        driver.findElement(By.xpath("//*[@id='drop-login']")).click();

        Thread.sleep(5000 );

        driver.findElement(By.xpath(".//input[contains(@id,'usrlog2')]")).sendKeys("tester777");

        driver.findElement(By.xpath(".//input[contains(@id,'usrpass2')]")).sendKeys("tester777");

        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.xpath(".//button[@id='signin_btn']"));
        loginButton.click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a > .i-menu-newpost")).click();

        driver.findElement(By.xpath(".//input[contains(@id,'postTitle')]")).sendKeys("приветствие");

        driver.findElement(By.xpath("//*[@id='message']")).sendKeys("добрый день!");

        driver.findElement(By.xpath("//*[@id='rewrite']")).click();
        Thread.sleep(5000);




    }
}
