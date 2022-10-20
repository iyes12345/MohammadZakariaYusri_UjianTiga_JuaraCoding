package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {
    private WebDriver driver;
    private String JavascriptExecutor;
    int detik = 1;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public JavascriptExecutor getJs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        return js;
    }


    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement buttonsearch;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inputsearch;

    @FindBy(xpath = "//*[@id=\"product-1184\"]/div[1]/div[2]/div[2]/div/a")
    WebElement buttonwhistlistone;

    @FindBy(xpath = "//div[contains(@class,'related products')]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement buttonwhistlisttwo;


    public void searchform() {

        buttonsearch.click();

        inputsearch.sendKeys("red satin round neck backless maxi dress");
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys(Keys.ENTER);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)");
        delay(detik);
        buttonwhistlistone.click();
        delay(detik);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,1500)");

        delay(detik);
        buttonwhistlisttwo.click();
        delay(detik);

        driver.get("https://shop.demoqa.com/wishlist/");

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,500)");

    }

    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}