package org.example.base;

import io.appium.java_client.AppiumDriver;
import org.example.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseView {
    protected AppiumDriver driver = DriverManager.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public void presionar(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void escribirTexto(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public String obtenerTexto(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    public boolean estaVisibleElemento(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public String obtenerMensajeDeAlerta(){
        return driver.switchTo().alert().getText();
    }




}
