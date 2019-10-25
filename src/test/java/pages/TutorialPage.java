package pages;

import io.appium.java_client.MobileElement;
import tests.AndroidSetUp;

public class TutorialPage {

    MobileElement nextContainer = (MobileElement) AndroidSetUp.getDriver().findElementById("nextContainer");

    public MainPage skipTutorial() {
            nextContainer.click();
            nextContainer.click();
            nextContainer.click();
            nextContainer.click();
            nextContainer.click();
        return new MainPage();
    }
}
