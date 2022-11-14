package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    int detik = 1;

    public Wishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[2]")
    WebElement btnWishlistProductoneclick;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[7]/div/div[1]/div[1]/div[2]")
    WebElement btnWishlistProducttwoclick;


    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement btndismiss;


    @FindBy(xpath = "//a[normalize-space()='My Wishlist']")
    WebElement btnWishlist;


    public void btnWishlishProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,100)");
        btnWishlistProductoneclick.click();
        delay(detik);
        System.out.println("Click button wishlist product one");
        js.executeScript("window.scrollBy(0,500)");
        btnWishlistProducttwoclick.click();
        System.out.println("Click button wishlist product two");
        delay(detik);
        js.executeScript("window.scrollBy(500,0)");
        btndismiss.click();
        System.out.println("Click button dismis ");
        delay(detik);
        btnWishlist.click();
        System.out.println("Click button wishlist ");
        js.executeScript("window.scrollBy(0,500)");
        delay(detik);

    }

    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}