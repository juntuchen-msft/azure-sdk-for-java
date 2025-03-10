// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Day of the week. */
@Fluent
public final class Day {
    /*
     * Date of the month
     */
    @JsonProperty(value = "date")
    private Integer date;

    /*
     * Whether Date is last date of month
     */
    @JsonProperty(value = "isLast")
    private Boolean isLast;

    /**
     * Get the date property: Date of the month.
     *
     * @return the date value.
     */
    public Integer date() {
        return this.date;
    }

    /**
     * Set the date property: Date of the month.
     *
     * @param date the date value to set.
     * @return the Day object itself.
     */
    public Day withDate(Integer date) {
        this.date = date;
        return this;
    }

    /**
     * Get the isLast property: Whether Date is last date of month.
     *
     * @return the isLast value.
     */
    public Boolean isLast() {
        return this.isLast;
    }

    /**
     * Set the isLast property: Whether Date is last date of month.
     *
     * @param isLast the isLast value to set.
     * @return the Day object itself.
     */
    public Day withIsLast(Boolean isLast) {
        this.isLast = isLast;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
