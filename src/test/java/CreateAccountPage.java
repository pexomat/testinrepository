import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPage {
    private String emailTextFieldXPath = "//*[contains(@id,'c_elem_0')]";
    private String passwordTextFieldXPath = "//*[contains(@id,'a_elem_1')]";
    private String reEnterPasswordTextFieldXPath = "//*[contains(@id,'a_elem_2')]";
    private String jobCorpsCenterDropdownXPath = "//*[@id='elem_3']";
    private String whereDidYouHearAboutUsXPath = "//*[@id='elem_4']";
    private String termsConditionsSwitchXPath = "//*[@class='checkbox-custom checkbox-toggle']";
    private String createAnAccountButtonXPath = "//*[@class='btn btn-md btn-primary pull-right ng-binding']";

    public CreateAccountPage fillInEmail(String email) {
        $x(emailTextFieldXPath).val(email);
        return this;
    }

    public CreateAccountPage fillInPassword(String password, boolean isReEnter) {
        if (isReEnter) {
            $x(reEnterPasswordTextFieldXPath).val(password);
        } else {
            $x(passwordTextFieldXPath).val(password);
        }
        return this;
    }

    public CreateAccountPage selectJobCorpsCenter() {
        Select jobCorpsCenterDropdown = new Select($x(jobCorpsCenterDropdownXPath));
        jobCorpsCenterDropdown.selectByIndex(1);
        return this;
    }

    public CreateAccountPage selectWhereDidYouHearAboutUs() {
        Select whereDidYouHearAboutUs = new Select($x(whereDidYouHearAboutUsXPath));
        whereDidYouHearAboutUs.selectByVisibleText("Email");
        return this;
    }

    public CreateAccountPage switchTermsConditions() {
        $x(termsConditionsSwitchXPath).click();
        return this;
    }

    public DashboardPage clickCreateAnAccount() {
        $x(createAnAccountButtonXPath).click();
        return new DashboardPage();
    }
}