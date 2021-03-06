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
package com.amazonaws.services.iotanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoggingOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoggingOptionsMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> LEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("level").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();

    private static final LoggingOptionsMarshaller instance = new LoggingOptionsMarshaller();

    public static LoggingOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoggingOptions loggingOptions, ProtocolMarshaller protocolMarshaller) {

        if (loggingOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loggingOptions.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(loggingOptions.getLevel(), LEVEL_BINDING);
            protocolMarshaller.marshall(loggingOptions.getEnabled(), ENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
