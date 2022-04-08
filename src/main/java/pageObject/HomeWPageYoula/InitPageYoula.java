package pageObject.HomeWPageYoula;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageYoula extends Base {
    public InitPageYoula(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//form//input[@title=\"Поиск\" and @aria-label]")
    private WebElement searchText;
    @FindBy(xpath = "(.//input[@value = \"Поиск в Google\"])[1]")
    private WebElement submitSearch;
    @FindBy(xpath = "(.//cite[@class = 'iUh30 tjvcx'])[1]")
    private WebElement Yula;



    /**
     * Вводим текст в строку поиска
     * @param text
     */
    public void setSetSearchText(String text){
        setText(searchText, text);
    }

    public void clickSubmitText(){
        click(submitSearch);
    }
    public void clickSubmitTextYula(){
        click(Yula);
    }
}

