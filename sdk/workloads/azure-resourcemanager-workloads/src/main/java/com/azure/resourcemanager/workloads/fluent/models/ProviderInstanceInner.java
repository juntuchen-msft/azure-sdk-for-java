// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.workloads.models.ProviderInstancePropertiesErrors;
import com.azure.resourcemanager.workloads.models.ProviderSpecificProperties;
import com.azure.resourcemanager.workloads.models.WorkloadMonitorProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A provider instance associated with monitor. */
@Fluent
public final class ProviderInstanceInner extends ProxyResource {
    /*
     * Provider Instance properties
     */
    @JsonProperty(value = "properties")
    private ProviderInstanceProperties innerProperties;

    /**
     * Get the innerProperties property: Provider Instance properties.
     *
     * @return the innerProperties value.
     */
    private ProviderInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: State of provisioning of the provider instance.
     *
     * @return the provisioningState value.
     */
    public WorkloadMonitorProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the errors property: Defines the provider instance errors.
     *
     * @return the errors value.
     */
    public ProviderInstancePropertiesErrors errors() {
        return this.innerProperties() == null ? null : this.innerProperties().errors();
    }

    /**
     * Get the providerSettings property: Defines the provider instance errors.
     *
     * @return the providerSettings value.
     */
    public ProviderSpecificProperties providerSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().providerSettings();
    }

    /**
     * Set the providerSettings property: Defines the provider instance errors.
     *
     * @param providerSettings the providerSettings value to set.
     * @return the ProviderInstanceInner object itself.
     */
    public ProviderInstanceInner withProviderSettings(ProviderSpecificProperties providerSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProviderInstanceProperties();
        }
        this.innerProperties().withProviderSettings(providerSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
