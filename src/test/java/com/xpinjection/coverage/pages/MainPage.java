// ============================================================================
//  File          : MainPage
//  Created       : 05.04.2012   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2010 Zoral, Ukraine
// ============================================================================

package com.xpinjection.coverage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
@DefaultUrl("http://localhost:8080/petclinic")
public class MainPage extends PageObject {
    @FindBy(linkText = "Find owner")
    private WebElement findOwnerLink;

    @FindBy(linkText = "Display all veterinarians")
    private WebElement allVeterinariansLink;

    public MainPage(final WebDriver driver) {
        super(driver);
    }

    public void openVeterinariansPage() {
        clickOn(allVeterinariansLink);
        waitForAllTextToAppear("Veterinarians:");
    }

    public void openPetOwnersSearchPage() {
        clickOn(findOwnerLink);
        waitForAllTextToAppear("Find Owners:");
    }
}
