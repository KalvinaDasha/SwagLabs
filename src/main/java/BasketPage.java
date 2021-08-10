import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static org.apache.commons.lang3.StringUtils.split;

public class BasketPage {


    SelenideElement removeBackpack = $(By.id("remove-sauce-labs-backpack"));
    SelenideElement removeJacket = $(By.id("remove-sauce-labs-fleece-jacket"));
    SelenideElement sumProducts = $x("//div[@class = 'summary_subtotal_label']");
    SelenideElement price = $("//div[@class = 'inventory_item_price']");


    public List<Double> getPrice() {
        return price.stream()
        .map(a -> a.getText().replace("$", ""))
        .map(Double::valueOf)
        .collect(Collectors.toList());
    }
    public double getSumProducts(){
        return Double.parseDouble(sumProducts.getText().split("\\$")[1]);

    }
}
