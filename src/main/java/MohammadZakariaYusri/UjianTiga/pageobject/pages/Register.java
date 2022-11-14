package MohammadZakariaYusri.UjianTiga.pageobject.pages;

import MohammadZakariaYusri.UjianTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "reg_username")
    WebElement username;

    @FindBy(id = "reg_email")
    WebElement email;

    @FindBy(id = "reg_password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[3]/span/span")
    WebElement showPassword;

    @FindBy(xpath = "//button[@name='register']")
    WebElement btnRegister;

    public void registerForm(String username, String email, String password) {
        this.username.sendKeys(username);
        System.out.println("User input username");
        this.email.sendKeys(email);
        System.out.println("User input email");
        this.password.sendKeys(password);
        System.out.println("User input password");
        showPassword.click();
        System.out.println("User Click for show password");
        btnRegister.click();
        System.out.println("User Click button register");
    }
}
