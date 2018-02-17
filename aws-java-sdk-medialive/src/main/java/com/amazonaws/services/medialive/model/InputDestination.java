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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for a PUSH type input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     */
    private String ip;
    /** port for input */
    private String port;
    /**
     * This represents the endpoint that the customer stream will be pushed to.
     */
    private String url;

    /**
     * system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     * 
     * @param ip
     *        system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     * 
     * @return system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     * 
     * @param ip
     *        system-generated static IP address of endpoint. Remains fixed for the lifetime of the input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * port for input
     * 
     * @param port
     *        port for input
     */

    public void setPort(String port) {
        this.port = port;
    }

    /**
     * port for input
     * 
     * @return port for input
     */

    public String getPort() {
        return this.port;
    }

    /**
     * port for input
     * 
     * @param port
     *        port for input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withPort(String port) {
        setPort(port);
        return this;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @param url
     *        This represents the endpoint that the customer stream will be pushed to.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @return This represents the endpoint that the customer stream will be pushed to.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @param url
     *        This represents the endpoint that the customer stream will be pushed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withUrl(String url) {
        setUrl(url);
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestination == false)
            return false;
        InputDestination other = (InputDestination) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public InputDestination clone() {
        try {
            return (InputDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
