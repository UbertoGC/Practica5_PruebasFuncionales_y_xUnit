package testing;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class pruebas3 {
	
	@Test
	public void fechaprueba_1() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a la ubicación donde este el HTML en su sistema*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement fecha1 = driver.findElement(By.name("fecha"));
        
        fecha1.sendKeys("1622019");
        String verificar = fecha1.getAttribute("value");
        System.out.println(verificar);
        assertEquals(verificar, "2019-02-16");
        driver.quit();
	}
	@Test
	public void fechaprueba_2() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*Esta es la dirección en mi computadora, se puede cambiar a la ubicación donde este el HTML en su sistema*/
        driver.get("file:///C:/Users/Chuber/eclipse-workspace/testing/src/main/resources/archivo_prueba.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement fecha1 = driver.findElement(By.name("fecha"));
        
        fecha1.sendKeys("15122014");
        String verificar = fecha1.getAttribute("value");

        assertEquals(verificar, "2014-12-07");
        driver.quit();
	}
}
