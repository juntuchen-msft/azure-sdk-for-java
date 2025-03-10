// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** workbook. */
@Fluent
public final class MicrosoftGraphWorkbook extends MicrosoftGraphEntity {
    /*
     * workbookApplication
     */
    @JsonProperty(value = "application")
    private MicrosoftGraphWorkbookApplication application;

    /*
     * The comments property.
     */
    @JsonProperty(value = "comments")
    private List<MicrosoftGraphWorkbookComment> comments;

    /*
     * workbookFunctions
     */
    @JsonProperty(value = "functions")
    private MicrosoftGraphWorkbookFunctions functions;

    /*
     * Represents a collection of workbook scoped named items (named ranges and
     * constants). Read-only.
     */
    @JsonProperty(value = "names")
    private List<MicrosoftGraphWorkbookNamedItem> names;

    /*
     * The status of workbook operations. Getting an operation collection is
     * not supported, but you can get the status of a long-running operation if
     * the Location header is returned in the response. Read-only.
     */
    @JsonProperty(value = "operations")
    private List<MicrosoftGraphWorkbookOperation> operations;

    /*
     * Represents a collection of tables associated with the workbook.
     * Read-only.
     */
    @JsonProperty(value = "tables")
    private List<MicrosoftGraphWorkbookTable> tables;

    /*
     * Represents a collection of worksheets associated with the workbook.
     * Read-only.
     */
    @JsonProperty(value = "worksheets")
    private List<MicrosoftGraphWorkbookWorksheet> worksheets;

    /*
     * workbook
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the application property: workbookApplication.
     *
     * @return the application value.
     */
    public MicrosoftGraphWorkbookApplication application() {
        return this.application;
    }

    /**
     * Set the application property: workbookApplication.
     *
     * @param application the application value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withApplication(MicrosoftGraphWorkbookApplication application) {
        this.application = application;
        return this;
    }

    /**
     * Get the comments property: The comments property.
     *
     * @return the comments value.
     */
    public List<MicrosoftGraphWorkbookComment> comments() {
        return this.comments;
    }

    /**
     * Set the comments property: The comments property.
     *
     * @param comments the comments value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withComments(List<MicrosoftGraphWorkbookComment> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the functions property: workbookFunctions.
     *
     * @return the functions value.
     */
    public MicrosoftGraphWorkbookFunctions functions() {
        return this.functions;
    }

    /**
     * Set the functions property: workbookFunctions.
     *
     * @param functions the functions value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withFunctions(MicrosoftGraphWorkbookFunctions functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the names property: Represents a collection of workbook scoped named items (named ranges and constants).
     * Read-only.
     *
     * @return the names value.
     */
    public List<MicrosoftGraphWorkbookNamedItem> names() {
        return this.names;
    }

    /**
     * Set the names property: Represents a collection of workbook scoped named items (named ranges and constants).
     * Read-only.
     *
     * @param names the names value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withNames(List<MicrosoftGraphWorkbookNamedItem> names) {
        this.names = names;
        return this;
    }

    /**
     * Get the operations property: The status of workbook operations. Getting an operation collection is not supported,
     * but you can get the status of a long-running operation if the Location header is returned in the response.
     * Read-only.
     *
     * @return the operations value.
     */
    public List<MicrosoftGraphWorkbookOperation> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The status of workbook operations. Getting an operation collection is not supported,
     * but you can get the status of a long-running operation if the Location header is returned in the response.
     * Read-only.
     *
     * @param operations the operations value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withOperations(List<MicrosoftGraphWorkbookOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Get the tables property: Represents a collection of tables associated with the workbook. Read-only.
     *
     * @return the tables value.
     */
    public List<MicrosoftGraphWorkbookTable> tables() {
        return this.tables;
    }

    /**
     * Set the tables property: Represents a collection of tables associated with the workbook. Read-only.
     *
     * @param tables the tables value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withTables(List<MicrosoftGraphWorkbookTable> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the worksheets property: Represents a collection of worksheets associated with the workbook. Read-only.
     *
     * @return the worksheets value.
     */
    public List<MicrosoftGraphWorkbookWorksheet> worksheets() {
        return this.worksheets;
    }

    /**
     * Set the worksheets property: Represents a collection of worksheets associated with the workbook. Read-only.
     *
     * @param worksheets the worksheets value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withWorksheets(List<MicrosoftGraphWorkbookWorksheet> worksheets) {
        this.worksheets = worksheets;
        return this;
    }

    /**
     * Get the additionalProperties property: workbook.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbook.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbook object itself.
     */
    public MicrosoftGraphWorkbook withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbook withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (application() != null) {
            application().validate();
        }
        if (comments() != null) {
            comments().forEach(e -> e.validate());
        }
        if (functions() != null) {
            functions().validate();
        }
        if (names() != null) {
            names().forEach(e -> e.validate());
        }
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
        if (tables() != null) {
            tables().forEach(e -> e.validate());
        }
        if (worksheets() != null) {
            worksheets().forEach(e -> e.validate());
        }
    }
}
