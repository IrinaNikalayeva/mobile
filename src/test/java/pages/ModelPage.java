package pages;

import io.appium.java_client.MobileElement;
import tests.AndroidSetUp;

public class ModelPage {

    MobileElement offersButton = (MobileElement) AndroidSetUp.getDriver().findElementById("offersContainer");
    MobileElement productTitle = (MobileElement) AndroidSetUp.getDriver().findElementById("tv_product_title");

    public void skipIntro() {
        offersButton.click();
    }

    public boolean isContainsSearchWord() {
        boolean result = productTitle.getText().contains("Android");
        return result;
    }

}
