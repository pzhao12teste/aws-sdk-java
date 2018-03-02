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
package com.amazonaws.services.greengrass.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrass.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateLoggerDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLoggerDefinitionResultJsonUnmarshaller implements Unmarshaller<UpdateLoggerDefinitionResult, JsonUnmarshallerContext> {

    public UpdateLoggerDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateLoggerDefinitionResult updateLoggerDefinitionResult = new UpdateLoggerDefinitionResult();

        return updateLoggerDefinitionResult;
    }

    private static UpdateLoggerDefinitionResultJsonUnmarshaller instance;

    public static UpdateLoggerDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateLoggerDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
