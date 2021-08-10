import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.net.URL;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests extends Before {


    @Test
    @Order(1)
    public void loginTest()throws IOException{
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();

        }
    @Test
    @Order(2)
    public void buyTest()throws IOException{

        ProductsPage products = new ProductsPage();
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        products.openProductsPage();
        products.addBackpack.click();
        products.openCartPage();
        products.check.click();
        products.openCheckPage();
        products.firstName.sendKeys("Darya");
        products.lastName.sendKeys("Kalvina");
        products.zipCode.sendKeys("230019");
        products.cont.click();
        products.openCheckTwoPage();
        products.finish.click();


           }

    @Test
    @Order(3)
    public void cancelBuyTest()throws IOException{
        BasketPage basket = new BasketPage();
        ProductsPage products = new ProductsPage();
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        products.openProductsPage();
        products.addBackpack.click();
        products.openCartPage();
        basket.removeBackpack.click();
    }
    @Test
    @Order(4)
    public void clearCartTest()throws IOException{
        BasketPage basket = new BasketPage();
        ProductsPage products = new ProductsPage();
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        products.openProductsPage();
        products.addBackpack.click();
        products.addJacket.click();
        products.openCartPage();
        basket.removeBackpack.click();
        basket.removeJacket.click();

    }

    @Test
    @Order(5)
    public void sumProductTest()throws IOException{
        BasketPage basket = new BasketPage();
        ProductsPage products = new ProductsPage();
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        products.openProductsPage();
        products.addBackpack.click();
        //products.addJacket.click();
        products.openCartPage();
        products.check.click();
        products.openCheckPage();
        products.firstName.sendKeys("Darya");
        products.lastName.sendKeys("Kalvina");
        products.zipCode.sendKeys("230019");
        products.cont.click();
        products.openCheckTwoPage();

        Assertions.assertEquals(BasketPage.getPrice(), BasketPage.getSumProducts());



    }



}
