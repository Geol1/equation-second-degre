package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;
/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args) {
        // Spécifiez le chemin vers le chromedriver.exe
        // System.setProperty("webdriver.chrome.driver", "chemin/vers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Marlin/Desktop/master 2/inf 563/cucum/chromedriver-win64/chromedriver.exe");


        // Instancier le pilote Chrome
        WebDriver driver = new ChromeDriver();

        // Ouvrir le navigateur et naviguer vers Google
        driver.get("https://www.google.com");

        // Trouver l'élément de recherche
        WebElement searchBox = driver.findElement(By.name("q"));

        // Effectuer une recherche Google
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);

        // Attendre quelques secondes pour voir les résultats (remplacez cela par des attentes explicites dans un scénario réel)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Fermer le navigateur
        driver.quit();
    }
}


