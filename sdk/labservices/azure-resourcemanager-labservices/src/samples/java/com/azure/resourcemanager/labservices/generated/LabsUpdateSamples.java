// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.models.EnableState;
import com.azure.resourcemanager.labservices.models.Lab;
import com.azure.resourcemanager.labservices.models.SecurityProfile;

/** Samples for Labs Update. */
public final class LabsUpdateSamples {
    /*
     * x-ms-original-file: specification/labservices/resource-manager/Microsoft.LabServices/preview/2021-11-15-preview/examples/Labs/patchLab.json
     */
    /**
     * Sample code: patchLab.
     *
     * @param manager Entry point to LabServicesManager.
     */
    public static void patchLab(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        Lab resource = manager.labs().getByResourceGroupWithResponse("testrg123", "testlab", Context.NONE).getValue();
        resource.update().withSecurityProfile(new SecurityProfile().withOpenAccess(EnableState.ENABLED)).apply();
    }
}
