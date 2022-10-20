package MohammadZakariaYusri.UjianTiga;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import MohammadZakariaYusri.UjianTiga.pageobject.pages.Search;
import MohammadZakariaYusri.UjianTiga.pageobject.pages.WebTables;
import MohammadZakariaYusri.UjianTiga.pageobject.util.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(Constants.URL);

        /*WebTables webTables = new WebTables();
        webTables.registerForm();*/

        Search search = new Search();
        search.searchform();

    }
    static void delay ( int detik){

        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}