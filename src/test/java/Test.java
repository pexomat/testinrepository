import static com.codeborne.selenide.Selenide.$x;

public class Test {
    @org.testng.annotations.Test

    public void testName() throws InterruptedException {
        String firstSavedJobXPath = "//*[@id='view_432607031']";
        String secondSavedJobXPath = "//*[@id='view_217492427']";

        HomePage homepage = new HomePage();
        CreateAccountPage createAccountPage = homepage.open().clickOnCreateAccount();
        DashboardPage dashboardPage = createAccountPage
                .fillInEmail("testing.purposes45@mailinator.com")
                .fillInPassword("Monster2020*", false)
                .fillInPassword("Monster2020*", true)
                .selectJobCorpsCenter()
                .selectWhereDidYouHearAboutUs()
                .switchTermsConditions()
                .clickCreateAnAccount();

        PhilipsJobsPage philipsJobsPage = dashboardPage
                .clickOnPhilipsJobsInFooter()
                .clickOnJobByIndex(2)
                .saveDisplayedJob()
                .clickOnLastJob()
                .saveDisplayedJob();

        SavedJobsPage savedJobsPage = philipsJobsPage.clickOnSavedJobs();

        ($x(firstSavedJobXPath)).isDisplayed();
        ($x(secondSavedJobXPath)).isDisplayed();
    }
}
