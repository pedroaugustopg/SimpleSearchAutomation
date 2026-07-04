package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Objects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest {

    private WebDriver driver;

    private static final String URL =
            "https://marcelodebittencourt.com/demopages/demosimplesearch/";

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\BrowserDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void shouldOpenSearchPage() {
        driver.get(URL);

        WebElement textbox = driver.findElement(By.id("textbox"));

        assertTrue(textbox.isDisplayed());
    }

    @Test
    void shouldDisplayCorrectTitle() {
        driver.get(URL);

        assertTrue(Objects.requireNonNull(driver.getTitle())
                        .contentEquals("Demo Simple Search using JavaScript"),
                "Título da página difere do esperado");
    }

    @Test
    void shouldAllowTypingInTextbox() {
        driver.get(URL);

        WebElement textbox = driver.findElement(By.id("textbox"));
        textbox.sendKeys("Selenium");

        assertEquals("Selenium", textbox.getAttribute("value"));
    }

    @Test
    void shouldDisplayResultAfterClick() {
        driver.get(URL);

        WebElement textbox = driver.findElement(By.id("textbox"));
        textbox.sendKeys("Selenium");

        assertEquals("Selenium", textbox.getAttribute("value"));

        WebElement button = driver.findElement(By.id("button1"));
        button.click();

        assertEquals("Click me!", button.getAttribute("value"));

        WebElement result = driver.findElement(By.id("result"));
        assertTrue(result.isDisplayed());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );

        assertTrue(result.isDisplayed());
    }

    @Test
    void shouldNotDisplayResultBeforeClick() {
        driver.get(URL);

        WebElement result = driver.findElement(By.id("result"));

        assertFalse(result.isDisplayed());
    }
}
