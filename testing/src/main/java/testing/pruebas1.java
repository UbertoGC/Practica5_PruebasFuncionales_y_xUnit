package testing;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class pruebas1 {

	@Test
    public void eightComponents() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);

        driver.quit();
    }
	@Test
	public void tituloprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a la ubicación donde este el HTML en su sistema*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        String title = driver.getTitle();
        assertEquals("Archivo de Prueba", title);
        driver.quit();
	}
}
