package pages;

import io.appium.java_client.MobileElement;
import tests.AndroidSetUp;

public class MainPage {

    private MobileElement searchButton = (MobileElement) AndroidSetUp.getDriver().findElementById("menu_search");
    private MobileElement searchField = (MobileElement) AndroidSetUp.getDriver().findElementById("search_src_text");

    public SearchPage performSearch() {
        searchButton.click();
        searchField.sendKeys("android");
        return new SearchPage();

    }


}
