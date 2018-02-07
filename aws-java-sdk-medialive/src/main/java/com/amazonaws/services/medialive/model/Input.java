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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for Input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Input" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Input implements Serializable, Cloneable, StructuredPojo {

    /** Unique ARN of input (generated, immutable) */
    private String arn;
    /** List of channel IDs that that input is attached to (currently an input can only be attached to one channel) */
    private java.util.List<String> attachedChannels;
    /** List of destinations of input (PULL-type) */
    private java.util.List<InputDestination> destinations;
    /** generated ID of input (unique for user account, immutable) */
    private String id;
    /** user-assigned name (mutable) */
    private String name;
    /** List of IDs for all the security groups attached to the input. */
    private java.util.List<String> securityGroups;
    /** List of sources of input (PULL-type) */
    private java.util.List<InputSource> sources;

    private String state;

    private String type;

    /**
     * Unique ARN of input (generated, immutable)
     * 
     * @param arn
     *        Unique ARN of input (generated, immutable)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique ARN of input (generated, immutable)
     * 
     * @return Unique ARN of input (generated, immutable)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * Unique ARN of input (generated, immutable)
     * 
     * @param arn
     *        Unique ARN of input (generated, immutable)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * List of channel IDs that that input is attached to (currently an input can only be attached to one channel)
     * 
     * @return List of channel IDs that that input is attached to (currently an input can only be attached to one
     *         channel)
     */

    public java.util.List<String> getAttachedChannels() {
        return attachedChannels;
    }

    /**
     * List of channel IDs that that input is attached to (currently an input can only be attached to one channel)
     * 
     * @param attachedChannels
     *        List of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel)
     */

    public void setAttachedChannels(java.util.Collection<String> attachedChannels) {
        if (attachedChannels == null) {
            this.attachedChannels = null;
            return;
        }

        this.attachedChannels = new java.util.ArrayList<String>(attachedChannels);
    }

    /**
     * List of channel IDs that that input is attached to (currently an input can only be attached to one channel)
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachedChannels(java.util.Collection)} or {@link #withAttachedChannels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attachedChannels
     *        List of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withAttachedChannels(String... attachedChannels) {
        if (this.attachedChannels == null) {
            setAttachedChannels(new java.util.ArrayList<String>(attachedChannels.length));
        }
        for (String ele : attachedChannels) {
            this.attachedChannels.add(ele);
        }
        return this;
    }

    /**
     * List of channel IDs that that input is attached to (currently an input can only be attached to one channel)
     * 
     * @param attachedChannels
     *        List of channel IDs that that input is attached to (currently an input can only be attached to one
     *        channel)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withAttachedChannels(java.util.Collection<String> attachedChannels) {
        setAttachedChannels(attachedChannels);
        return this;
    }

    /**
     * List of destinations of input (PULL-type)
     * 
     * @return List of destinations of input (PULL-type)
     */

    public java.util.List<InputDestination> getDestinations() {
        return destinations;
    }

    /**
     * List of destinations of input (PULL-type)
     * 
     * @param destinations
     *        List of destinations of input (PULL-type)
     */

    public void setDestinations(java.util.Collection<InputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<InputDestination>(destinations);
    }

    /**
     * List of destinations of input (PULL-type)
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        List of destinations of input (PULL-type)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withDestinations(InputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<InputDestination>(destinations.length));
        }
        for (InputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * List of destinations of input (PULL-type)
     * 
     * @param destinations
     *        List of destinations of input (PULL-type)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withDestinations(java.util.Collection<InputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * generated ID of input (unique for user account, immutable)
     * 
     * @param id
     *        generated ID of input (unique for user account, immutable)
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * generated ID of input (unique for user account, immutable)
     * 
     * @return generated ID of input (unique for user account, immutable)
     */

    public String getId() {
        return this.id;
    }

    /**
     * generated ID of input (unique for user account, immutable)
     * 
     * @param id
     *        generated ID of input (unique for user account, immutable)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withId(String id) {
        setId(id);
        return this;
    }

    /**
     * user-assigned name (mutable)
     * 
     * @param name
     *        user-assigned name (mutable)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * user-assigned name (mutable)
     * 
     * @return user-assigned name (mutable)
     */

    public String getName() {
        return this.name;
    }

    /**
     * user-assigned name (mutable)
     * 
     * @param name
     *        user-assigned name (mutable)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withName(String name) {
        setName(name);
        return this;
    }

    /**
     * List of IDs for all the security groups attached to the input.
     * 
     * @return List of IDs for all the security groups attached to the input.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * List of IDs for all the security groups attached to the input.
     * 
     * @param securityGroups
     *        List of IDs for all the security groups attached to the input.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * List of IDs for all the security groups attached to the input.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        List of IDs for all the security groups attached to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * List of IDs for all the security groups attached to the input.
     * 
     * @param securityGroups
     *        List of IDs for all the security groups attached to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * List of sources of input (PULL-type)
     * 
     * @return List of sources of input (PULL-type)
     */

    public java.util.List<InputSource> getSources() {
        return sources;
    }

    /**
     * List of sources of input (PULL-type)
     * 
     * @param sources
     *        List of sources of input (PULL-type)
     */

    public void setSources(java.util.Collection<InputSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<InputSource>(sources);
    }

    /**
     * List of sources of input (PULL-type)
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        List of sources of input (PULL-type)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withSources(InputSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<InputSource>(sources.length));
        }
        for (InputSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * List of sources of input (PULL-type)
     * 
     * @param sources
     *        List of sources of input (PULL-type)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Input withSources(java.util.Collection<InputSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * @param state
     * @see InputState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see InputState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputState
     */

    public Input withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputState
     */

    public Input withState(InputState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param type
     * @see InputType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see InputType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public Input withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputType
     */

    public Input withType(InputType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAttachedChannels() != null)
            sb.append("AttachedChannels: ").append(getAttachedChannels()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAttachedChannels() == null ^ this.getAttachedChannels() == null)
            return false;
        if (other.getAttachedChannels() != null && other.getAttachedChannels().equals(this.getAttachedChannels()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAttachedChannels() == null) ? 0 : getAttachedChannels().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Input clone() {
        try {
            return (Input) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
