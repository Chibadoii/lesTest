package firstTest;

import Calculator.TestCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeworkTests extends BaseTest {
    public String PathInfo() {
        String curDir = System.getProperty("user.dir");
        System.out.println(System.getProperty("os.name"));
        String filePath;

        if (System.getProperty("os.name").contains("Windows")) {
            filePath = curDir + "\\src\\main\\resources\\test";
        } else {
            filePath = curDir + "/src/main/resources/test";
        }

        return filePath;
    }

    @Test(description = "Проверяем наличие слова в файле")
    public void test1Hm() {

        System.out.println("TestPathFile");
        String filePath = PathInfo();//По идеи это должно было бы быть удобно, но мне не хватило фантазии для других методов с путем)
        String line = null;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            bf.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertion a = new Assertion();
        a.assertTrue(line.contains("Привет."), "Not Found");


    }
    //Пришлось по простому
    public TestCalculator calc;
    private final double Num1 = 15.5;
    private final double Num2 = 7.5;

    @Test(description = "Начинаем невероятнейшие вычисления",groups = "calcTest")
    public void TestAdd(){
        double exRes = Num1 + Num2;
        double acRes = calc.add(Num1, Num2);

        Assert.assertEquals(acRes,exRes,"Неверный результат");
    }
    @Test(groups = "calcTest")
    public void TestMult(){
        double exRes = Num1 * Num2;
        double acRes = calc.mult(Num1, Num2);

        Assert.assertEquals(acRes,exRes,"Неверный результат");
    }
    @Test(groups = "calcTest")
    public void TestDiv(){
        double exRes = Num1 / Num2;
        double acRes = calc.div(Num1, Num2);

        System.out.println("15488488");
        Assert.assertEquals(acRes,exRes,"Неверный результат");
    }
}


