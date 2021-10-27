package test.challenge;

import com.beust.jcommander.internal.Console;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.grid.config.Config;
import org.openqa.selenium.remote.http.TextMessage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.challenge.PageObject;

public class FirstTest extends PageObject {

    @Test
    public void VerifyButtonText(){
        PreCondition();
        ClickOnLinkAddRemove();
        ClickOnButtonAddRemove();
        Assert.assertEquals(VerifyTextDelete(),"Delete");

    }

}

