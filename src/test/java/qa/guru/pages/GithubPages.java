package qa.guru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class GithubPages {

    private static final String REPO_NAME = "selenide";
    private final SelenideElement
            searchInput = $(".header-search-input"),
            wikiTab = $(linkText("Wikis")),
            linkSoftAssertions = $(linkText("SoftAssertions")),
            searchJUnitCode = $(withText("com.codeborne.selenide.junit5.SoftAssertsExtension"));

    public GithubPages openPage() {
        open("/");
        return this;
    }

    public GithubPages searchSelenideRepo() {
        searchInput.click();
        searchInput.setValue(REPO_NAME);
        searchInput.submit();
        return this;
    }

    public GithubPages openWikiPage() {
        wikiTab.click();
        return this;
    }

    public GithubPages clickToSoftAssertions() {
        linkSoftAssertions.click();
        return this;
    }

    public GithubPages shouldHaveJUnitCode() {
        searchJUnitCode.shouldHave(Condition.exist);
        return this;
    }
}
