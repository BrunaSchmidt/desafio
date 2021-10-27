package test.challenge;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.challenge.PageObject;

public class TirdTest extends PageObject {

    @Test
    public void VerifyText(){
        PreCondition();
        ClickOnLinkKeyPresses();
        FillTarget();
        Assert.assertEquals(GetTargetText(), GetResultText());
        PosCondition();

    }
}
