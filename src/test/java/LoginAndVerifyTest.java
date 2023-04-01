import Data.DataHelper;
import Data.SQLHelper;
import PageObjects.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static Data.SQLHelper.cleanDataBase;
import static com.codeborne.selenide.Selenide.open;

public class LoginAndVerifyTest {
    @AfterAll
    static void teardown() {
        cleanDataBase();
    }

    @Test
    void shouldSuccessfullyLogin() {

        open("http://localhost:9999");
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var authCodePage = loginPage.validLogin(authInfo);
        /*authCodePage.verifyAuthCodePageVisibility();
        /*var verificationCode = SQLHelper.getVerificationCode();
        authCodePage.validVerify(verificationCode.getCode());*/

    }
}
