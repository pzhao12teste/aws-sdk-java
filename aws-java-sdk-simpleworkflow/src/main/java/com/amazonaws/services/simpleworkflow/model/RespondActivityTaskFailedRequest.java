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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskFailed" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RespondActivityTaskFailedRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     */
    private String taskToken;
    /**
     * <p>
     * Description of the error that may assist in diagnostics.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Detailed information about the failure.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important>
     *        <p>
     *        <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *        is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *        its progress and respond with results.
     *        </p>
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @return The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important>
     *         <p>
     *         <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *         is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *         its progress and respond with results.
     *         </p>
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> of the <a>ActivityTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> of the <a>ActivityTask</a>.</p> <important>
     *        <p>
     *        <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *        is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *        its progress and respond with results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondActivityTaskFailedRequest withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * Description of the error that may assist in diagnostics.
     * </p>
     * 
     * @param reason
     *        Description of the error that may assist in diagnostics.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Description of the error that may assist in diagnostics.
     * </p>
     * 
     * @return Description of the error that may assist in diagnostics.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Description of the error that may assist in diagnostics.
     * </p>
     * 
     * @param reason
     *        Description of the error that may assist in diagnostics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondActivityTaskFailedRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Detailed information about the failure.
     * </p>
     * 
     * @param details
     *        Detailed information about the failure.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Detailed information about the failure.
     * </p>
     * 
     * @return Detailed information about the failure.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Detailed information about the failure.
     * </p>
     * 
     * @param details
     *        Detailed information about the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondActivityTaskFailedRequest withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondActivityTaskFailedRequest == false)
            return false;
        RespondActivityTaskFailedRequest other = (RespondActivityTaskFailedRequest) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public RespondActivityTaskFailedRequest clone() {
        return (RespondActivityTaskFailedRequest) super.clone();
    }

}
