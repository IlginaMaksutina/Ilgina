import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebUITest {
 public static final String STUDENT_LOGIN = "Applanatest";

 public static final String STUDENT_PASSWORD = "Student2020!";
 public static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";

    public static void main(String[] args) throws InterruptedException
    {

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

        driver.findElement(By.xpath(
                ".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']")).click();

                driver.findElement(By.xpath(".//span[@class='title' and text()='Мои проекты']")).click();

                Thread.sleep(5000 );

                driver.findElement(By.cssSelector("div[class='pull-left btn-group icons-holder']")).click();
                Thread.sleep(7000);

                driver.findElement(By.xpath(".//input[contains(@id,'crm_project')]")).sendKeys("111");

                   Thread.sleep(5000);


               Select crm_project = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
               crm_project.selectByVisibleText("Research & Development");

       Thread.sleep(5000);


                Select curator = new Select((driver.findElement(By.name("crm_project[curator]"))));
                curator.selectByVisibleText("Student Student Stu");
        Thread.sleep(5000);

                Select rp = new Select(driver.findElement(By.name("crm_project[rp]")));
                rp.selectByVisibleText("Student Student Stu");
         Thread.sleep(5000);

            Select manager = new Select(driver.findElement(By.name("crm_project[manager]")));
            manager.selectByVisibleText("Student Student Stu");
            Thread.sleep(5000);

            driver.findElement(By.cssSelector("button[class='btn btn-success action-button']")).click();



    }
}


