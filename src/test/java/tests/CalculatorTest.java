package tests;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import pages.CalculatorPage;

public class CalculatorTest {
    private final CalculatorPage calculatorPage = new CalculatorPage();
    private final MobileElement digit_9 = calculatorPage.getDigit_9();
    private final MobileElement digit_7 = calculatorPage.getDigit_7();
    private final MobileElement add_button = calculatorPage.getAdd_button();
    private final MobileElement equal_button = calculatorPage.getEqual_button();
    private final MobileElement result = calculatorPage.getResult();
    private final MobileElement sub_button = calculatorPage.getMinus_button();
    private final MobileElement mul_button = calculatorPage.getMultiply_button();
    private final MobileElement div_button = calculatorPage.getDivide_button();

    @Test
    public void sum2Numbers(){
        digit_9.click();
        add_button.click();
        digit_7.click();
        equal_button.click();
        System.out.println("Resultado: " + result.getText());
    }

    @Test
    public void sub2Numbers(){
        digit_9.click();
        sub_button.click();
        digit_7.click();
        equal_button.click();
        System.out.println("Resultado: " + result.getText());
    }

    @Test
    public void mul2Numbers(){
        digit_9.click();
        mul_button.click();
        digit_7.click();
        equal_button.click();
        System.out.println("Resultado: " + result.getText());
    }

    @Test
    public void div2Numbers(){
        digit_9.click();
        div_button.click();
        digit_7.click();
        equal_button.click();
        System.out.println("Resultado: " + result.getText());
    }
}
