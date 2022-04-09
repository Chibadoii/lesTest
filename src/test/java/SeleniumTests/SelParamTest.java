package SeleniumTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObject;
import pageObject.google.SearchResultPageObject;
import testData.WordsTestData;

public class SelParamTest extends BaseTest{
        @DataProvider(name = "setWords", parallel = true)
    public Object[][] getData (){
        Object[][] words = new Object[][]{
                {new WordsTestData("word").getWord1(),"word1"},
                {new WordsTestData("word").getWord1(),"word2"},
                {new WordsTestData("word").getWord1(),"word3"}

        };
        return words;
    }

    @Test(dataProvider = "setWords")
    public void startTest(String word, String testName){
        getDriver().get(stendUrl);
        getDriver().manage().window().maximize();
        InitPageObject in = new InitPageObject(getDriver());
        in.setSetSearchText("Привет");
        in.clickSubmitText();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isImagesTabButtonIsExist());
    }
}
