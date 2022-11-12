package testing;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

public class newmain {

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
        /*Esta es la dirección en mi computadora, se puede cambiar a otra*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        String title = driver.getTitle();
        assertEquals("Archivo de Prueba", title);
        driver.quit();
	}
	@Test
	public void textoprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a otra*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement textBox = driver.findElement(By.name("textoentrada"));
        textBox.sendKeys("Probandote");
        
        String valor = textBox.getAttribute("value");
        System.out.println(valor);
        assertEquals("Probandote", valor);
        driver.quit();
	}
	@Test
	public void radioprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a otra*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement radio1 = driver.findElement(By.id("alfa"));
        WebElement radio2 = driver.findElement(By.id("beta"));
        WebElement radio3 = driver.findElement(By.id("theta"));
         
        assertTrue(radio1.isSelected());
        assertFalse(radio2.isSelected());
        assertFalse(radio3.isSelected());
        
        radio3.click();
        
        assertFalse(radio1.isSelected());
        assertFalse(radio2.isSelected());
        assertTrue(radio3.isSelected());
        
        
        driver.quit();
	}
	@Test
	public void fechaprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a otra*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement fecha1 = driver.findElement(By.name("fecha"));
        
        fecha1.sendKeys("16");
        fecha1.sendKeys("2");
        fecha1.sendKeys("2019");
        String verificar = fecha1.getAttribute("value");
        System.out.println(verificar);
        assertEquals(verificar, "2019-02-16");
        driver.quit();
	}
	
}
