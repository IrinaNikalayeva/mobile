package pages;

import io.appium.java_client.MobileElement;
import tests.AndroidSetUp;

public class ModelPage {

    private MobileElement offersButton = (MobileElement) AndroidSetUp.getDriver().findElementById("offersContainer");
    private MobileElement productTitle = (MobileElement) AndroidSetUp.getDriver().findElementById("tv_product_title");

    public void skipIntro() {
        offersButton.click();
    }

    public boolean isContainsSearchWord() {
        return productTitle.getText().contains("Android");
    }

}
