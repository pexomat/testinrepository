import static com.codeborne.selenide.Selenide.$x;

public class PhilipsJobsPage {

    private String searchResultsXPath = "//*[@id='SearchResults']";
    private String saveJobButtonXPath = "//*[@id='SaveJob']";
    private String lastJobXPath = "//*[@id='SearchResults']/*[last()]";
    private String myJobsSearchXPath = "//*[@id='dropdown-My-job-search']";
    private String savedJobsItem = "//*[@id='subtab']/ul/li[6]/a";

    public PhilipsJobsPage clickOnJobByIndex(int indexOfJob) {
        String asd = searchResultsXPath + "/*[" + indexOfJob + "]";
        $x(searchResultsXPath + "/*[" + indexOfJob + "]").click();
        return this;
    }

    public PhilipsJobsPage saveDisplayedJob() {
        $x(saveJobButtonXPath).click();
        return this;
    }

    public PhilipsJobsPage clickOnLastJob() {
        $x(lastJobXPath).click();
        return this;
    }

    public SavedJobsPage clickOnSavedJobs() {
        ($x(myJobsSearchXPath)).hover();
        ($x(savedJobsItem)).click();
        return new SavedJobsPage();
    }
}
