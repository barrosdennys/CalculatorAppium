package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.DriverManager;

public class CalculatorPage {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();

    MobileElement digit_9 = driver.findElementById("com.android.calculator2:id/digit_9");
    MobileElement digit_7 = driver.findElementById("com.android.calculator2:id/digit_7");
    MobileElement add_button = driver.findElementById("com.android.calculator2:id/op_add");
    MobileElement minus_button = driver.findElementById("com.android.calculator2:id/op_sub");
    MobileElement divide_button = driver.findElementById("com.android.calculator2:id/op_div");
    MobileElement multiply_button = driver.findElementById("com.android.calculator2:id/op_mul");
    MobileElement equal_button = driver.findElementById("com.android.calculator2:id/eq");
    MobileElement result = driver.findElementById("com.android.calculator2:id/result");

    public MobileElement getMinus_button() {
        return minus_button;
    }

    public MobileElement getDivide_button() {
        return divide_button;
    }

    public MobileElement getMultiply_button() {
        return multiply_button;
    }

    public MobileElement getDigit_9() {
        return digit_9;
    }

    public MobileElement getDigit_7() {
        return digit_7;
    }

    public MobileElement getAdd_button() {
        return add_button;
    }

    public MobileElement getEqual_button() {
        return equal_button;
    }

    public MobileElement getResult() {
        return result;
    }

}
