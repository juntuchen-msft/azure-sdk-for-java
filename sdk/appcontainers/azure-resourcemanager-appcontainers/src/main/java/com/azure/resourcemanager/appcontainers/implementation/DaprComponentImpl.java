// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentInner;
import com.azure.resourcemanager.appcontainers.models.DaprComponent;
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.DaprSecretsCollection;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.util.Collections;
import java.util.List;

public final class DaprComponentImpl implements DaprComponent, DaprComponent.Definition, DaprComponent.Update {
    private DaprComponentInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String componentType() {
        return this.innerModel().componentType();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Boolean ignoreErrors() {
        return this.innerModel().ignoreErrors();
    }

    public String initTimeout() {
        return this.innerModel().initTimeout();
    }

    public List<Secret> secrets() {
        List<Secret> inner = this.innerModel().secrets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<DaprMetadata> metadata() {
        List<DaprMetadata> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> scopes() {
        List<String> inner = this.innerModel().scopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DaprComponentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String environmentName;

    private String name;

    public DaprComponentImpl withExistingManagedEnvironment(String resourceGroupName, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.environmentName = environmentName;
        return this;
    }

    public DaprComponent create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .createOrUpdateWithResponse(resourceGroupName, environmentName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DaprComponent create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .createOrUpdateWithResponse(resourceGroupName, environmentName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DaprComponentImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new DaprComponentInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DaprComponentImpl update() {
        return this;
    }

    public DaprComponent apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .createOrUpdateWithResponse(resourceGroupName, environmentName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DaprComponent apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .createOrUpdateWithResponse(resourceGroupName, environmentName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DaprComponentImpl(
        DaprComponentInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.environmentName = Utils.getValueFromIdByName(innerObject.id(), "managedEnvironments");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "daprComponents");
    }

    public DaprComponent refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .getWithResponse(resourceGroupName, environmentName, name, Context.NONE)
                .getValue();
        return this;
    }

    public DaprComponent refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDaprComponents()
                .getWithResponse(resourceGroupName, environmentName, name, context)
                .getValue();
        return this;
    }

    public DaprSecretsCollection listSecrets() {
        return serviceManager.daprComponents().listSecrets(resourceGroupName, environmentName, name);
    }

    public Response<DaprSecretsCollection> listSecretsWithResponse(Context context) {
        return serviceManager
            .daprComponents()
            .listSecretsWithResponse(resourceGroupName, environmentName, name, context);
    }

    public DaprComponentImpl withComponentType(String componentType) {
        this.innerModel().withComponentType(componentType);
        return this;
    }

    public DaprComponentImpl withVersion(String version) {
        this.innerModel().withVersion(version);
        return this;
    }

    public DaprComponentImpl withIgnoreErrors(Boolean ignoreErrors) {
        this.innerModel().withIgnoreErrors(ignoreErrors);
        return this;
    }

    public DaprComponentImpl withInitTimeout(String initTimeout) {
        this.innerModel().withInitTimeout(initTimeout);
        return this;
    }

    public DaprComponentImpl withSecrets(List<Secret> secrets) {
        this.innerModel().withSecrets(secrets);
        return this;
    }

    public DaprComponentImpl withMetadata(List<DaprMetadata> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public DaprComponentImpl withScopes(List<String> scopes) {
        this.innerModel().withScopes(scopes);
        return this;
    }
}
