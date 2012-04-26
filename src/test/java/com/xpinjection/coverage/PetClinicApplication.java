// ============================================================================
//  File          : PetClinicApplication
//  Created       : 05.04.2012   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2010 Zoral, Ukraine
// ============================================================================

package com.xpinjection.coverage;

import net.thucydides.core.annotations.Feature;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class PetClinicApplication {
    @Feature
    public class PetOwnerManagement {
        public class ViewInformationPertainingToPetOwner {}
        public class UpdateTheInformationPertainingToPetOwner {}
        public class AddNewPetOwnerToTheSystem {}
    }
    @Feature
    public class PetManagement {
        public class ViewInformationPertainingToPet {}
        public class UpdateTheInformationPertainingToPet {}
        public class AddNewPetToTheSystem {}
    }
    @Feature
    public class VeterinarianVisits {
        public class ViewListOfVeterinariansAndTheirSpecialities {}
        public class ViewInformationPertainingToPetVisitationHistory {}
        public class AddInformationPertainingToVisitToThePetVisitationHistory {}
    }
}

