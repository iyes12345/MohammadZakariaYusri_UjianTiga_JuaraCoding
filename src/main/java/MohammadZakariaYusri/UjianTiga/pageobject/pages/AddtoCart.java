package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart {

    private WebDriver driver;

    public AddtoCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]")
    WebElement clickItem;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement selectMenu;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement size;

    @FindBy(xpath = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAddCart;

    @FindBy(id = "nav-menu-item-cart")
    WebElement btnViewCart;

    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement clickMenuOrders;

    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    WebElement btnBrowseProducts;


    public void clickMenuOrders() {
        clickMenuOrders.click();
        System.out.println("Click menu orders");
        btnBrowseProducts.click();
        System.out.println("Clikc button browse products");
    }

    public void shopItemDetail() {
        clickItem.click();
        System.out.println("Click Item");
    }

    public void addToCart() {

        Select pa_color = new Select(selectMenu);
        Select pa_size = new Select(size);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        pa_color.selectByVisibleText("Black");
        System.out.println("Select Menu Color");
        pa_size.selectByVisibleText("38");
        System.out.println("Select Menu Size");
        btnAddCart.click();
        System.out.println("Click button addcart");
        btnViewCart.click();
        System.out.println("Click icon cart");
        js.executeScript("window.scrollBy(200,0)");

    }

}
