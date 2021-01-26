package ru.geekbrains.qa.java2.lesson7_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Diary1 {

    public static final String LOGIN = "tester7777";

    public static final String PASSWORD = "tester7777";
    public static final String LOGIN_PAGE_URL = "https://www.diary.ru/";
    public static final String MAIL = "tester7777@mail.ru";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get(LOGIN_PAGE_URL);

        driver.findElement(By.xpath("//*[@id='body']/div[2]/div/ul[2]/li[2]/a")).click();
        Thread.sleep(5000);

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[contains(@id,'usrlog')]"))).click();

        WebElement loginTextInput = driver.findElement(By.xpath(".//input[contains(@id,'usrlog')]"));
        loginTextInput.sendKeys(LOGIN);
        Thread.sleep(2000);

        WebElement passwordTextInput = driver.findElement(By.name("user_pass"));
        passwordTextInput.sendKeys(PASSWORD);
        Thread.sleep(2000);

        WebElement mailTextInput = driver.findElement(By.name("user_email"));
        mailTextInput.sendKeys(MAIL);
        Thread.sleep(2000);


        WebElement loginButton = driver.findElement(By.xpath(".//button[@name='_submit']"));
        loginButton.click();

        Thread.sleep(5000);
    }
}
