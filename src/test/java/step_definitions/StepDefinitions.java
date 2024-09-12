package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

/**
 * @author niajulhasan
 */

import io.cucumber.java.en.Given;

public class StepDefinitions {
    private final AppiumDriver driver = Hooks.driver;

    @Given("the button is visible")
    public void page_element_visible_check() {
        // Code to launch 
        assertTrue(driver.findElement(By.id("id")).isDisplayed()); 
    }
}
