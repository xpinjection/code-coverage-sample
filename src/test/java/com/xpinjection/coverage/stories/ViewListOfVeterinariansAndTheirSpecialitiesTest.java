// ============================================================================
//  File          : ViewListOfVeterinariansAndTheirSpecialitiesTest
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

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
@Issues({"#123", "#456"})
@RunWith(ThucydidesRunner.class)
@Story(PetClinicApplication.VeterinarianVisits.ViewListOfVeterinariansAndTheirSpecialities.class)
public class ViewListOfVeterinariansAndTheirSpecialitiesTest {
    @Managed
    public WebDriver webDriver;

    @ManagedPages(defaultUrl = "http://localhost:8080")
    public Pages pages;

    @Steps
    public PetOwnerSteps steps;

    @Test
    public void listOfVeterinariansIsPredefined() {
        steps.openVeterinariansPage();
        steps.shouldBeListOfPredefinedVeterinarians(6);
    }

    @Test
    @Pending
    @Issue("#156")
    public void listOfVeterinariansIsAvailableInXmlFormat() {}
}
