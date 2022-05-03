package pages;

import Utility.Utility;
import org.openqa.selenium.By;

public class AccountOverViewPage extends Utility {
    By logOut=By.xpath("//div[@id='leftPanel']/ul/li[8]/a");


    public void clickOnLogOutBtn(){
        clickOnElement(logOut);
    }
}
