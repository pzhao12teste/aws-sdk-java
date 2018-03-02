/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateConfigurationResult, JsonUnmarshallerContext> {

    public UpdateConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateConfigurationResult updateConfigurationResult = new UpdateConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updateConfigurationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateConfigurationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestRevision", targetDepth)) {
                    context.nextToken();
                    updateConfigurationResult.setLatestRevision(ConfigurationRevisionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    context.nextToken();
                    updateConfigurationResult.setWarnings(new ListUnmarshaller<SanitizationWarning>(SanitizationWarningJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateConfigurationResult;
    }

    private static UpdateConfigurationResultJsonUnmarshaller instance;

    public static UpdateConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
