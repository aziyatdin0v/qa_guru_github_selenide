package qa.guru;

import org.junit.jupiter.api.Test;
import qa.guru.pages.GithubPages;

public class GithubSelenideTest extends BaseTest {

    GithubPages gitHubPages = new GithubPages();

    @Test
    public void searchJUnitCodeInWikiSelenideRepo() {
        gitHubPages.openPage()
                .searchSelenideRepo()
                .openWikiPage()
                .openWikiPage()
                .existSoftAssertionsInPage()
                .clickToSoftAssertions()
                .shouldJUnitCodeInPage();
    }
}
