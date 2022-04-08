package pageObject.HomeWPageYoula;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchPageYoula extends Base {
    public SearchPageYoula(WebDriver driver) {
        super(driver);
    }
        @FindBy(xpath = ".//a[contains(.,'Найти')]")
        private WebElement imagesTabY;


        public boolean isYoulaTabButtonIsExist(){
            return waitVisibilityElement(imagesTabY);
        }
    }

