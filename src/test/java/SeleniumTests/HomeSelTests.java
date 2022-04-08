package SeleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.HomeWPageYoula.InitPageYoula;
import pageObject.HomeWPageYoula.SearchPageYoula;

public class HomeSelTests extends BaseTest{
    @Test
    public void startTest(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        InitPageYoula inPY = new InitPageYoula(getDriver());
        inPY.setSetSearchText("youla");
        inPY.clickSubmitText();
        inPY.clickSubmitTextYula();
        SearchPageYoula sr = new SearchPageYoula(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isYoulaTabButtonIsExist());

    }
}
