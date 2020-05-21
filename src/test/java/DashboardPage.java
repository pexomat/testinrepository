import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage {
    private String PhilipsJobsXPath = "//*[text()='Philips Jobs']";

    /*
    * Full disclosure here. Yes I know that Thread.sleep is a sacrilege. But bear with me.
    * Here in this class I am trying to click on Philis Jobs in footer right after navigating from dashboard page.
    * And it seems, that this link is displayed, enabled and exist (as you can see commented lower) and yet after clicking nothing happens.
    * I have no idea what is going on. Nothing happens after click if I dont wait, yet link is there.  Maybe bug?
    */

    public PhilipsJobsPage clickOnPhilipsJobsInFooter() throws InterruptedException {
        Thread.sleep(5000);
        // $x(PhilipsJobsXPath).isDisplayed();
        // $x(PhilipsJobsXPath).isEnabled();
        // $x(PhilipsJobsXPath).exists();
        $x(PhilipsJobsXPath).click();
        return new PhilipsJobsPage();
    }
}
