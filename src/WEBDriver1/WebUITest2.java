package ru.geekbrains.qa.java2.lesson7_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebUITest2 {
    public static final String STUDENT_LOGIN = "Applanatest";

    public static final String STUDENT_PASSWORD = "Student2020!";
    public static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get(LOGIN_PAGE_URL);

        WebElement loginTextInput = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        loginTextInput.sendKeys(STUDENT_LOGIN);
        Thread.sleep(2000);

        WebElement passwordTextInput = driver.findElement(By.cssSelector(".span2[name='_password']"));
        passwordTextInput.sendKeys(STUDENT_PASSWORD);
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath(".//button[@name='_submit']"));
        loginButton.click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[@class='dropdown first'][1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath(".//span[@class='title' and text()='Контактные лица']")).click();

        Thread.sleep(5000 );

        driver.findElement(By.cssSelector(".back")).click();
        Thread.sleep(5000 );

       driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Иванов");



        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Иван");



        driver.findElement(By.xpath(".//span[@class='select2-chosen']")).click();
        Thread.sleep(3000);


      // не получается использовать select. Что не так?
     //  Select organisation = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
     //  organisation.selectByVisibleText("Test Organisation_1");

        Thread.sleep(5000);


        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("QA tester");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("button[class='btn btn-success action-button']")).click();
        Thread.sleep(5000);
    }
}
