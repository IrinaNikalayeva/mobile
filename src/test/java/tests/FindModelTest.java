package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ModelPage;
import pages.TutorialPage;

import java.net.MalformedURLException;


public class FindModelTest extends AndroidSetUp {

    @BeforeClass
    public void setUp() throws MalformedURLException {
        prepareAndroidForAppium();
    }

    @Test
    public void SampleTest() {
        TutorialPage tutorialPage = new TutorialPage();
        tutorialPage.skipTutorial()
            .performSearch()
            .chooseItem()
            .skipIntro();
        ModelPage modelPage = new ModelPage();
        Assert.assertTrue(modelPage.isContainsSearchWord(ModelPage.SEARCHWORD));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
