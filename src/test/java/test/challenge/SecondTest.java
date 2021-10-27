package test.challenge;

import org.testng.annotations.Test;
import pageobject.challenge.PageObject;

public class SecondTest extends PageObject {

    @Test
    public void SelectOptionOnDropDown(){
        PreCondition();
        ClickOnLinkDropdown();
        SelectOption();
    }
}
