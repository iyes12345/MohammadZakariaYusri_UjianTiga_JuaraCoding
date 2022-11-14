package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search {

    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='noo-search']//i[@class='icon_search']")
    WebElement clickSearch;

    @FindBy(name = "s")
    WebElement inputSearch;


    public void searchItem() {
        clickSearch.click();
        System.out.println("Click search");
        inputSearch.sendKeys("DRESS", Keys.ENTER);
        System.out.println("Input dress for values search");
    }
}

