package parabank;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.*;

public class PageBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected final By bodyLocator = By.tagName("body");

    public PageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    protected WebElement waitVisibiiltyAndFindElement(By locator) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this.driver.findElement(locator);
    }

    public String getBodyText() {
        WebElement resultElement = this.waitVisibiiltyAndFindElement(bodyLocator);
        return resultElement.getText();
    }
}
