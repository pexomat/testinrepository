import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private String CreateAccountButton = "//*[contains(@href,'account/account-lite')]";

    public HomePage open() {
        Selenide.open("https://www.monsterworksdemo.com/home/");
        return this;
    }

    public CreateAccountPage clickOnCreateAccount() {
        $x(CreateAccountButton).click();
        return new CreateAccountPage();
    }
}