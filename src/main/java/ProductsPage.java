import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.w3c.dom.html.HTMLInputElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProductsPage extends HeadPage{

    public void openProductsPage(){
        open("https://www.saucedemo.com/inventory.html");
    }
    public void openCartPage(){
        open("https://www.saucedemo.com/cart.html");
    }
    public void openCheckPage(){
        open("https://www.saucedemo.com/checkout-step-one.html");
    }
    public void openCheckTwoPage(){
        open("https://www.saucedemo.com/checkout-step-two.html");
    }

     SelenideElement addBackpack = $(By.id("add-to-cart-sauce-labs-backpack"));
     SelenideElement addJacket = $(By.id("add-to-cart-sauce-labs-fleece-jacket"));
     SelenideElement basket = $("a[@class = 'shopping_cart_link']");
     // Cart page
     SelenideElement check = $(By.id("checkout"));
     // Checkout one page
     SelenideElement firstName = $(By.id("first-name"));
     SelenideElement lastName = $(By.id("last-name"));
     SelenideElement zipCode = $(By.id("postal-code"));
     SelenideElement cont = $(By.id("continue"));
     // Checkout two page
     SelenideElement finish = $(By.id("finish"));


}
