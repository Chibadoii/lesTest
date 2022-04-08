package firstTest;

import Emp.forConstructo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends  BaseTest {

    String firstParam = "Кто виноват?";
    String secondParam = "Nobody";


    @Parameters({"IDont", "IKnow"})
    @Test
    public void startTest( String firstParam, String secondParam) {
        System.out.println("Первый паарметр" + firstParam);
        System.out.println("Второй паарметр" + secondParam);
        System.out.println("Но на самом деле " + this.firstParam + " " + this.secondParam);

        this.firstParam = firstParam;
        this.secondParam = secondParam;

    }
    @Test(priority = 2)
    public void startTest() {
        System.out.println("Первый паарметр" + firstParam);
        System.out.println("Второй паарметр" + secondParam);
        System.out.println("Но на самом деле " + this.firstParam + " " + this.secondParam);


    }
    @Test(priority = 1)
    public void startTestV2() {
        forConstructo con = new forConstructo();
        System.out.println("Первый паарметр" + firstParam);
        System.out.println("Второй паарметр" + secondParam);
        System.out.println("Но на самом деле " + con.constParam + " " + con.constParam2);

    }
}