// ============================================================================
//  File          : ViewInformationPertainingToPetOwnerTest
//  Created       : 05.04.2012   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2010 Zoral, Ukraine
// ============================================================================

package com.xpinjection.coverage.stories;

import com.xpinjection.coverage.PetClinicApplication;
import com.xpinjection.coverage.steps.PetOwnerSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.matchers.BeanMatchers.the;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
@Issues({"#222", "#321"})
@RunWith(ThucydidesRunner.class)
@Story(PetClinicApplication.PetOwnerManagement.ViewInformationPertainingToPetOwner.class)
public class ViewInformationPertainingToPetOwnerTest {
    @Managed
    public WebDriver webDriver;

    @ManagedPages(defaultUrl = "http://localhost:8080")
    public Pages pages;

    @Steps
    public PetOwnerSteps steps;

    @Test
    public void petOwnerCanBeSearchedByLastName() {
        steps.openPetOwnersSearchPage();
        steps.searchPetOwnerByLastName("Davis");
        steps.petOwnerWithFollowingDataShouldPresent(
                the("Name", is("Betty Davis")),
                the("Address", is("638 Cardinal Ave.")),
                the("City", is("Sun Prairie")),
                the("Telephone", startsWith("608")));
    }
}
