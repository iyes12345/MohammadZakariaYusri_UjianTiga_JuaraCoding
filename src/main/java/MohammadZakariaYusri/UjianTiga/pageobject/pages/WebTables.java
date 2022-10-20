package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTables {
    private WebDriver driver;
    private String JavascriptExecutor;
    int detik = 1;

    public WebTables() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //click dismiss
    @FindBy(className = "woocommerce-store-notice__dismiss-link")
    WebElement buttonDismiss;

    //click My Account
    @FindBy(partialLinkText = "My Account")
    WebElement linkMyAccount;

    //scroll
    public JavascriptExecutor getJs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        return js;
    }

    //input reg username
    @FindBy(xpath = "//*[@id=\"reg_username\"]")
    WebElement reg_username;

    //input reg email
    @FindBy(id = "reg_email")
    WebElement reg_email;

    //input reg password
    @FindBy(id = "reg_password")
    WebElement reg_password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    WebElement register;

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement usernamelogin;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]")
    WebElement clickProduct;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement selectMenu;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement selectSize;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addToCart;

    //PageObject
    public void registerForm() {
        buttonDismiss.click();
        linkMyAccount.click();


        //user input register dan login
        reg_username.sendKeys("dummyaccount");
        delay(detik);

        reg_email.sendKeys("dummy2225079@gmail.com");
        delay(detik);
        reg_password.sendKeys("Dummy12345$");
        delay(detik);
        register.click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)");
        delay(detik);

        usernamelogin.sendKeys("");
        delay(detik);
        password.sendKeys("Dummy12345$");

        delay(detik);
        login.click();

        driver.get("https://shop.demoqa.com");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1100)");
        delay(1);

        //click product
        clickProduct.click();

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,600)");
        delay(1);

        //Select color
        Select pa_color = new Select(selectMenu);
        pa_color.selectByIndex(1);
        pa_color.selectByVisibleText("Pink");

        //Select size
        Select pa_size = new Select(selectSize);
        pa_size.selectByIndex(1);
        pa_size.selectByVisibleText("36");

        //add cart
        addToCart.click();
    }
    static void delay ( int detik){

        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}