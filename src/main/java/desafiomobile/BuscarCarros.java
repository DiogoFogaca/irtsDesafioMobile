package desafiomobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BuscarCarros {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "qlqum");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\dafogaca\\iterasysmobile\\desafiomobile\\src\\main\\resources\\iCarros – Comprar Carros_v4.19.3_apkpure.com.apk");
	     
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	    
	    driver.findElement(By.className("android.widget.Button")).click();
	    driver.findElement(By.className("android.widget.EditText")).sendKeys("Audi");
	    	
	    WebElement lista = driver.findElement(By.className("android.widget.TextView"));
	    lista.click();
	    driver.findElement(By.id("br.com.icarros.androidapp:id/priceText")).click();
	    
	    
	    driver.quit();
	}
}
