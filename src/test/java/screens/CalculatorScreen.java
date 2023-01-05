package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setup.Setup.PACKAGE_ID;

public class CalculatorScreen {

    @FindBy (id = PACKAGE_ID+":id/digit_1")
    AndroidElement btn_1;

    @FindBy (id = PACKAGE_ID+":id/digit_5")
    AndroidElement btn_5;

    @FindBy (id = PACKAGE_ID+":id/op_add")
    AndroidElement btn_plus;

    @FindBy (id = PACKAGE_ID+":id/result_preview")
    AndroidElement result_preview;

    public CalculatorScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    public String doSum(){
        btn_1.click();
        btn_plus.click();
        btn_5.click();
        return result_preview.getText();
    }

}
