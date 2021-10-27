package pageobject.challenge;

import org.openqa.selenium.By;
import challenge.test.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObject extends BasePage {

    public void ClickOnLinkAddRemove(){

        driver.findElement(By.linkText("Add/Remove Elements")).click();

    }

    public void ClickOnButtonAddRemove(){

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

    }

    public String VerifyTextDelete(){

        String textDelete = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button")).getText();

        return textDelete;

    }

    public void ClickOnLinkDropdown(){

        driver.findElement(By.linkText("Dropdown")).click();

    }

    public void SelectOption(){

        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select element = new Select(selectElement);
        element.selectByIndex(2);

    }

    public void ClickOnLinkKeyPresses(){

        driver.findElement(By.linkText("Key Presses")).click();

    }

    public void FillTarget()  {

        driver.findElement(By.id("target")).sendKeys("TESTE");

    }

    public char GetTargetText() {

        String target = driver.findElement(By.id("target")).getAttribute("value");
        char lastCharTarget = target.charAt(target.length() -1 );

        return lastCharTarget;
    }

    public char GetResultText(){

        String result = driver.findElement(By.id("result")).getText();
        char lastCharResult = result.charAt(result.length() -1);

        return lastCharResult;
    }
}


