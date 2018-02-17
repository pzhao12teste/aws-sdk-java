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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a new player session that is created as a result of a successful FlexMatch match. A successful match
 * automatically creates new player sessions for every player ID in the original matchmaking request.
 * </p>
 * <p>
 * When players connect to the match's game session, they must include both player ID and player session ID in order to
 * claim their assigned player slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/MatchedPlayerSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchedPlayerSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a player
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Unique identifier for a player session
     * </p>
     */
    private String playerSessionId;

    /**
     * <p>
     * Unique identifier for a player
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player
     * </p>
     * 
     * @return Unique identifier for a player
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchedPlayerSession withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player session
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session
     */

    public void setPlayerSessionId(String playerSessionId) {
        this.playerSessionId = playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session
     * </p>
     * 
     * @return Unique identifier for a player session
     */

    public String getPlayerSessionId() {
        return this.playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchedPlayerSession withPlayerSessionId(String playerSessionId) {
        setPlayerSessionId(playerSessionId);
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
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getPlayerSessionId() != null)
            sb.append("PlayerSessionId: ").append(getPlayerSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchedPlayerSession == false)
            return false;
        MatchedPlayerSession other = (MatchedPlayerSession) obj;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getPlayerSessionId() == null ^ this.getPlayerSessionId() == null)
            return false;
        if (other.getPlayerSessionId() != null && other.getPlayerSessionId().equals(this.getPlayerSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getPlayerSessionId() == null) ? 0 : getPlayerSessionId().hashCode());
        return hashCode;
    }

    @Override
    public MatchedPlayerSession clone() {
        try {
            return (MatchedPlayerSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.MatchedPlayerSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
