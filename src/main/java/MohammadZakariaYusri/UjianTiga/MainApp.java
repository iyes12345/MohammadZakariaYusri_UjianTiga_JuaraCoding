package MohammadZakariaYusri.UjianTiga;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import MohammadZakariaYusri.UjianTiga.pageobject.pages.*;
import MohammadZakariaYusri.UjianTiga.pageobject.util.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Register register = new Register();
        Login login = new Login();
        AddtoCart addtoCart = new AddtoCart();
        Search search = new Search();
        Wishlist wishlist = new Wishlist();

        //User Register Account
        driver.get(Constants.URL_LOGIN);
        register.registerForm("dummyaccount", "dummy2225079@gmail.com", "Dummy12345$");

        driver.navigate().back();
        driver.navigate().refresh();

        //User login input email & pass
        login.loginForm("dummy2225079@gmail.com", "Dummy12345$");

        //click product
        driver.get(Constants.URL_SHOP);
        js.executeScript("window.scrollBy(0,550)");
        addtoCart.shopItemDetail();

        // Add product to cart
        driver.get(Constants.URL_DETAIL_SHOP);
        js.executeScript("window.scrollBy(0,500)");
        addtoCart.addToCart();

        driver.get("https://shop.demoqa.com/cart/");
        search.searchItem();

        // Add product to wishlists
        driver.get("https://shop.demoqa.com/?s=dress&post_type=product");
        js.executeScript("window.scrollBy(0,550)");
        wishlist.btnWishlishProduct();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}