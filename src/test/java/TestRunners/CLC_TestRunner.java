package TestRunners;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculatorScreen;
import setup.Setup;

public class CLC_TestRunner extends Setup {

    @Test
    public void doSum(){
        CalculatorScreen calScrn = new CalculatorScreen(driver);
        String resultActual = calScrn.doSum();
        System.out.println(resultActual);
        String resultExpected="6";

        Assert.assertTrue(resultActual.contains(resultExpected));
    }
}
