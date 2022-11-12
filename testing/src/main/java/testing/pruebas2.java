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

public class pruebas2 {
	
	@Test
	public void textoprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a la ubicación donde este el HTML en su sistema*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement textBox = driver.findElement(By.name("textoentrada"));
        textBox.sendKeys("Probandote");
        
        String valor = textBox.getAttribute("value");

        assertEquals("Probandote", valor);
        driver.quit();
	}
	@Test
	public void radioprueba() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a la ubicación donde este el HTML en su sistema*/
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
        
        radio2.click();
        
        assertFalse(radio1.isSelected());
        assertTrue(radio2.isSelected());
        assertFalse(radio3.isSelected());
        
        driver.quit();
	}
}
