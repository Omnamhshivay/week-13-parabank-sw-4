package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import testbase.TestBase;

public class Register extends TestBase {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();
        String actualText = signUpPage.VerifySignUpText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText, expectedText, "Verify SignUp Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        signUpPage.enterFirstName("Amitabh");
        signUpPage.enterLastname("Bachan");
        signUpPage.enterAddress("123 Jalsa");
        signUpPage.enterCityName("london");
        signUpPage.enterStateName("Marrow");
        signUpPage.enterZipCode("456737");
        signUpPage.enterPhoneNumber("98989467498");
        signUpPage.enterSnnNumber("126874");
        signUpPage.sendEmailToEmailIdField();
        signUpPage.enterPassword("123456");
        signUpPage.enterConfirmedPassword("123456");
        signUpPage.clickOnRegisterButton();
        String actualText=signUpPage.verifyAccountCreatedSuccessfully();
        String expectedText="Your account was created successfully. You are now logged in.";
        Assert.assertEquals(actualText,expectedText,"account successfully created text");
    }
}
