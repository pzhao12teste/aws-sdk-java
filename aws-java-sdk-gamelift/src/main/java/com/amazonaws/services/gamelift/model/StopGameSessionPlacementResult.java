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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopGameSessionPlacementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end time
     * stamp.
     * </p>
     */
    private GameSessionPlacement gameSessionPlacement;

    /**
     * <p>
     * Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end time
     * stamp.
     * </p>
     * 
     * @param gameSessionPlacement
     *        Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end
     *        time stamp.
     */

    public void setGameSessionPlacement(GameSessionPlacement gameSessionPlacement) {
        this.gameSessionPlacement = gameSessionPlacement;
    }

    /**
     * <p>
     * Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end time
     * stamp.
     * </p>
     * 
     * @return Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end
     *         time stamp.
     */

    public GameSessionPlacement getGameSessionPlacement() {
        return this.gameSessionPlacement;
    }

    /**
     * <p>
     * Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end time
     * stamp.
     * </p>
     * 
     * @param gameSessionPlacement
     *        Object that describes the canceled game session placement, with <code>CANCELLED</code> status and an end
     *        time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopGameSessionPlacementResult withGameSessionPlacement(GameSessionPlacement gameSessionPlacement) {
        setGameSessionPlacement(gameSessionPlacement);
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
        if (getGameSessionPlacement() != null)
            sb.append("GameSessionPlacement: ").append(getGameSessionPlacement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopGameSessionPlacementResult == false)
            return false;
        StopGameSessionPlacementResult other = (StopGameSessionPlacementResult) obj;
        if (other.getGameSessionPlacement() == null ^ this.getGameSessionPlacement() == null)
            return false;
        if (other.getGameSessionPlacement() != null && other.getGameSessionPlacement().equals(this.getGameSessionPlacement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionPlacement() == null) ? 0 : getGameSessionPlacement().hashCode());
        return hashCode;
    }

    @Override
    public StopGameSessionPlacementResult clone() {
        try {
            return (StopGameSessionPlacementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
