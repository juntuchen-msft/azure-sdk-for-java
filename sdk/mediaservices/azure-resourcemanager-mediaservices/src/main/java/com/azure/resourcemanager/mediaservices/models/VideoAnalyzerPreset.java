// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * A video analyzer preset that extracts insights (rich metadata) from both audio and video, and outputs a JSON format
 * file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.VideoAnalyzerPreset")
@Fluent
public final class VideoAnalyzerPreset extends AudioAnalyzerPreset {
    /*
     * Defines the type of insights that you want the service to generate. The
     * allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and
     * 'AllInsights'. The default is AllInsights. If you set this to
     * AllInsights and the input is audio only, then only audio insights are
     * generated. Similarly if the input is video only, then only video
     * insights are generated. It is recommended that you not use
     * AudioInsightsOnly if you expect some of your inputs to be video only; or
     * use VideoInsightsOnly if you expect some of your inputs to be audio
     * only. Your Jobs in such conditions would error out.
     */
    @JsonProperty(value = "insightsToExtract")
    private InsightsType insightsToExtract;

    /**
     * Get the insightsToExtract property: Defines the type of insights that you want the service to generate. The
     * allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If
     * you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the
     * input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly
     * if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to
     * be audio only. Your Jobs in such conditions would error out.
     *
     * @return the insightsToExtract value.
     */
    public InsightsType insightsToExtract() {
        return this.insightsToExtract;
    }

    /**
     * Set the insightsToExtract property: Defines the type of insights that you want the service to generate. The
     * allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If
     * you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the
     * input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly
     * if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to
     * be audio only. Your Jobs in such conditions would error out.
     *
     * @param insightsToExtract the insightsToExtract value to set.
     * @return the VideoAnalyzerPreset object itself.
     */
    public VideoAnalyzerPreset withInsightsToExtract(InsightsType insightsToExtract) {
        this.insightsToExtract = insightsToExtract;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoAnalyzerPreset withAudioLanguage(String audioLanguage) {
        super.withAudioLanguage(audioLanguage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoAnalyzerPreset withMode(AudioAnalysisMode mode) {
        super.withMode(mode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoAnalyzerPreset withExperimentalOptions(Map<String, String> experimentalOptions) {
        super.withExperimentalOptions(experimentalOptions);
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
    }
}
