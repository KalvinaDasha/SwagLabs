import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class HeadPage {
    SelenideElement button = $(By.id("react-burger-menu-btn"));
    SelenideElement basket = $("a[@class = 'shopping_cart_link']");

}
