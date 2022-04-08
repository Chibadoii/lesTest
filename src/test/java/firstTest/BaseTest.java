package firstTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void beforeT(){
        System.out.println("Действие перед началом теста");
    }
    @AfterTest
    public void afterT(){
        System.out.println("Действие после теста");
    }
    @BeforeMethod
    public void beforeM(){
        System.out.println("Действие перед началом Метода");
    }
    @AfterMethod
    public void afterM(){
        System.out.println("Действие после метода");
    }
}
