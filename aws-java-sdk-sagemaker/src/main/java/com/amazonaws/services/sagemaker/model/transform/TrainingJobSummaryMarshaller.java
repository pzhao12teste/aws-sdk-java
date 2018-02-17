/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrainingJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrainingJobSummaryMarshaller {

    private static final MarshallingInfo<String> TRAININGJOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobName").build();
    private static final MarshallingInfo<String> TRAININGJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobArn").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<java.util.Date> TRAININGENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingEndTime").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").build();
    private static final MarshallingInfo<String> TRAININGJOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingJobStatus").build();

    private static final TrainingJobSummaryMarshaller instance = new TrainingJobSummaryMarshaller();

    public static TrainingJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TrainingJobSummary trainingJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (trainingJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trainingJobSummary.getTrainingJobName(), TRAININGJOBNAME_BINDING);
            protocolMarshaller.marshall(trainingJobSummary.getTrainingJobArn(), TRAININGJOBARN_BINDING);
            protocolMarshaller.marshall(trainingJobSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(trainingJobSummary.getTrainingEndTime(), TRAININGENDTIME_BINDING);
            protocolMarshaller.marshall(trainingJobSummary.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(trainingJobSummary.getTrainingJobStatus(), TRAININGJOBSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
