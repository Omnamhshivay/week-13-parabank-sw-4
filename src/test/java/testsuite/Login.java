package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountOverViewPage;
import pages.HomePage;
import testbase.TestBase;

public class Login extends TestBase {
    HomePage homePage=new HomePage();
    AccountOverViewPage accountOverviewPage=new AccountOverViewPage();
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {
        homePage.sendEmailToEmailIdFieldOnHomePage("Amitabh");
        homePage.sendPasswordOnHomePage("123456");
        homePage.clickOnLoginLink();
        String actualTitle=homePage.validateAccountOverView();
        String expectedTitle="Accounts Overview";
        Assert.assertEquals(actualTitle,expectedTitle,"Account overview Title Validation");
    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.sendEmailToEmailIdFieldOnHomePage("Amitabh");
        homePage.clickOnLoginLink();
        String actualMessage=homePage.validateErrorMessage();
        String expectedMessage="Please enter a username and password.";
        Assert.assertEquals(actualMessage,expectedMessage,"Login Error message Validation");
    }
    @Test
    public void userShouldLogOutSuccessfully() {
        homePage.sendEmailToEmailIdFieldOnHomePage("Amitabh");
        homePage.sendPasswordOnHomePage("123456");
        homePage.clickOnLoginLink();
        accountOverviewPage.clickOnLogOutBtn();
        homePage.validateCustomerLoginText();
    }


}
