package pages;

import io.appium.java_client.MobileElement;
import tests.AndroidSetUp;

public class SearchPage {

    private MobileElement firstItem = (MobileElement) AndroidSetUp.getDriver().findElementById("view");

    public ModelPage chooseItem() {
        firstItem.click();
        return new ModelPage();
    }

}
