import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.google.j2objc.annotations.Property;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage {

   SelenideElement loginField =$(By.id("user-name"));
   SelenideElement passField = $(By.id("password"));
   SelenideElement signInButton = $x("//input[@data-test = 'login-button']");


    void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/user.properties"));
        loginField.sendKeys(props.getProperty("user.username"));
        passField.sendKeys(props.getProperty("user.password"));
        signInButton.click();

    }
    public void openLoginPage() {
        open("https://www.saucedemo.com/");}
}