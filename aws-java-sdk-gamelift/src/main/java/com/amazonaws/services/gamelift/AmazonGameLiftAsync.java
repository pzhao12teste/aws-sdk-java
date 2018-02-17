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
package com.amazonaws.services.gamelift;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gamelift.AbstractAmazonGameLiftAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Amazon GameLift is a managed service for developers who need a scalable, dedicated server solution for their
 * multiplayer games. Amazon GameLift provides tools for the following tasks: (1) acquire computing resources and deploy
 * game servers, (2) scale game server capacity to meet player demand, (3) host game sessions and manage player access,
 * and (4) track in-depth metrics on player usage and server performance.
 * </p>
 * <p>
 * The Amazon GameLift service API includes two important function sets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Manage game sessions and player access</b> -- Retrieve information on available game sessions; create new game
 * sessions; send player requests to join a game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Configure and manage game server resources</b> -- Manage builds, fleets, queues, and aliases; set autoscaling
 * policies; retrieve logs and metrics.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift. You can use the API functionality with
 * these tools:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The Amazon Web Services software development kit (<a href="http://aws.amazon.com/tools/#sdk">AWS SDK</a>) is
 * available in <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-supported.html#gamelift-supported-clients"
 * >multiple languages</a> including C++ and C#. Use the SDK to access the API programmatically from an application,
 * such as a game client.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href="http://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool is primarily useful for handling
 * administrative actions, such as setting up and managing Amazon GameLift settings and resources. You can use the AWS
 * CLI to manage all of your AWS services.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href="https://console.aws.amazon.com/gamelift/home">AWS Management Console</a> for Amazon GameLift provides a
 * web interface to manage your Amazon GameLift settings and resources. The console includes a dashboard for tracking
 * key resources, including builds and fleets, and displays usage and performance metrics for your games as customizable
 * graphs.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GameLift Local is a tool for testing your game's integration with Amazon GameLift before deploying it on the
 * service. This tools supports a subset of key API actions, which can be called from either the AWS CLI or
 * programmatically. See <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing-local.html">Testing an
 * Integration</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>MORE RESOURCES</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a> -- Learn
 * more about Amazon GameLift features and how to use them.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/tutorials">Lumberyard and Amazon GameLift Tutorials</a> -- Get started
 * fast with walkthroughs and sample projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/blogs/gamedev/">GameDev Blog</a> -- Stay up to date with new features and techniques.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html">GameDev Forums</a> -- Connect with
 * the GameDev community.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html">Amazon GameLift Document
 * History</a> -- See changes to the Amazon GameLift service, SDKs, and documentation, as well as links to release
 * notes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>API SUMMARY</b>
 * </p>
 * <p>
 * This list offers a functional overview of the Amazon GameLift service API.
 * </p>
 * <p>
 * <b>Managing Games and Players</b>
 * </p>
 * <p>
 * Use these actions to start new game sessions, find existing game sessions, track game session status and other
 * information, and enable player access to game sessions.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Discover existing game sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>SearchGameSessions</a> -- Retrieve all available game sessions or search for game sessions that match a set of
 * criteria.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Start new game sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start new games with Queues to find the best available hosting resources across multiple regions, minimize player
 * latency, and balance game session activity for efficiency and cost effectiveness.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartGameSessionPlacement</a> -- Request a new game session placement and add one or more players to it.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionPlacement</a> -- Get details on a placement request, including status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopGameSessionPlacement</a> -- Cancel a placement request.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a>CreateGameSession</a> -- Start a new game session on a specific fleet. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Start new game sessions with FlexMatch matchmaking</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartMatchmaking</a> -- Request matchmaking for one players or a group who want to play together.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmaking</a> -- Get details on a matchmaking request, including status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AcceptMatch</a> -- Register that a player accepts a proposed match, for matches that require player acceptance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopMatchmaking</a> -- Cancel a matchmaking request.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage game session data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> -- Retrieve metadata for one or more game sessions, including length of time active and
 * current player count. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionDetails</a> -- Retrieve metadata and the game session protection setting for one or more game
 * sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSession</a> -- Change game session settings, such as maximum player count and join policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetGameSessionLogUrl</a> -- Get the location of saved logs for a game session.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage player sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a> -- Send a request for a player to join a game session. <i>Available in Amazon GameLift
 * Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a> -- Send a request for multiple players to join a game session. <i>Available in Amazon
 * GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a> -- Get details on player activity, including status, playing time, and player data.
 * <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Setting Up and Managing Game Servers</b>
 * </p>
 * <p>
 * When setting up Amazon GameLift resources for your game, you first <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">create a game build</a>
 * and upload it to Amazon GameLift. You can then use these actions to configure and manage a fleet of resources to run
 * your game servers, scale capacity to meet player demand, access performance and utilization metrics, and more.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Manage game builds</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBuild</a> -- Create a new build using files stored in an Amazon S3 bucket. (Update uploading permissions
 * with <a>RequestUploadCredentials</a>.) To create a build and upload files from a local path, use the AWS CLI command
 * <code>upload-build</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBuilds</a> -- Get a list of all builds uploaded to a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeBuild</a> -- Retrieve information associated with a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateBuild</a> -- Change build metadata, including build name and version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBuild</a> -- Remove a build from Amazon GameLift.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleets</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateFleet</a> -- Configure and activate a new fleet to run a build's game servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListFleets</a> -- Get a list of all fleet IDs in a Amazon GameLift region (all statuses).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a> -- Terminate a fleet that is no longer running game servers or hosting players.
 * </p>
 * </li>
 * <li>
 * <p>
 * View / update fleet configurations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a> / <a>UpdateFleetAttributes</a> -- View or change a fleet's metadata and settings for
 * game session protection and resource creation limits.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a> / <a>UpdateFleetPortSettings</a> -- View or change the inbound permissions (IP
 * address and port setting ranges) allowed for a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a> / <a>UpdateRuntimeConfiguration</a> -- View or change what server processes (and
 * how many) to run on each instance in a fleet.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Control fleet capacity</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a> -- Retrieve maximum number of instances allowed for the current AWS account and the
 * current usage level.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a> / <a>UpdateFleetCapacity</a> -- Retrieve the capacity settings and the current number of
 * instances in a fleet; adjust fleet capacity settings to scale up or down.
 * </p>
 * </li>
 * <li>
 * <p>
 * Autoscale -- Manage autoscaling rules and apply them to a fleet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a> -- Create a new autoscaling policy, or update an existing one.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a> -- Retrieve an existing autoscaling policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a> -- Delete an autoscaling policy and stop it from affecting a fleet's capacity.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage VPC peering connections for fleets</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateVpcPeeringAuthorization</a> -- Authorize a peering connection to one of your VPCs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVpcPeeringAuthorizations</a> -- Retrieve valid peering connection authorizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteVpcPeeringAuthorization</a> -- Delete a peering connection authorization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateVpcPeeringConnection</a> -- Establish a peering connection between the VPC for a Amazon GameLift fleet and
 * one of your VPCs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVpcPeeringConnections</a> -- Retrieve information on active or pending VPC peering connections with a
 * Amazon GameLift fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteVpcPeeringConnection</a> -- Delete a VPC peering connection with a Amazon GameLift fleet.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Access fleet activity statistics</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetUtilization</a> -- Get current data on the number of server processes, game sessions, and players
 * currently active on a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a> -- Get a fleet's logged events for a specified time span.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> -- Retrieve metadata associated with one or more game sessions, including length of time
 * active and current player count.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Remotely access an instance</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeInstances</a> -- Get information on each instance in a fleet, including instance ID, IP address, and
 * status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetInstanceAccess</a> -- Request access credentials needed to remotely connect to a specified instance in a fleet.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleet aliases</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateAlias</a> -- Define a new alias and optionally assign it to a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAliases</a> -- Get all fleet aliases defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a> -- Retrieve information on an existing alias.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a> -- Change settings for a alias, such as redirecting it from one fleet to another.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a> -- Remove an alias from the region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a> -- Get the fleet ID that a specified alias points to.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage game session queues</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSessionQueue</a> -- Create a queue for processing requests for new game sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionQueues</a> -- Retrieve game session queues defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSessionQueue</a> -- Change the configuration of a game session queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteGameSessionQueue</a> -- Remove a game session queue from the region.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage FlexMatch resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateMatchmakingConfiguration</a> -- Create a matchmaking configuration with instructions for building a player
 * group and placing in a new game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmakingConfigurations</a> -- Retrieve matchmaking configurations defined a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateMatchmakingConfiguration</a> -- Change settings for matchmaking configuration. queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteMatchmakingConfiguration</a> -- Remove a matchmaking configuration from the region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateMatchmakingRuleSet</a> -- Create a set of rules to use when searching for player matches.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmakingRuleSets</a> -- Retrieve matchmaking rule sets defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ValidateMatchmakingRuleSet</a> -- Verify syntax for a set of matchmaking rules.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGameLiftAsync extends AmazonGameLift {

    /**
     * <p>
     * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may
     * require player acceptance; if so, then matches built with that configuration cannot be completed unless all
     * players accept the proposed match within a specified time limit.
     * </p>
     * <p>
     * When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in the
     * ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an
     * error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have
     * registered acceptance, the matchmaking tickets advance to status <code>PLACING</code>, where a new game session
     * is created for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players
     * accepted the match, the ticket status is returned to <code>SEARCHING</code> to find a new match. For tickets
     * where one or more players failed to accept the match, the ticket status is set to <code>FAILED</code>, and
     * processing is terminated. A new matchmaking request for these players can be submitted as needed.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptMatchRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the AcceptMatch operation returned by the service.
     * @sample AmazonGameLiftAsync.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(AcceptMatchRequest acceptMatchRequest);

    /**
     * <p>
     * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may
     * require player acceptance; if so, then matches built with that configuration cannot be completed unless all
     * players accept the proposed match within a specified time limit.
     * </p>
     * <p>
     * When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in the
     * ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an
     * error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have
     * registered acceptance, the matchmaking tickets advance to status <code>PLACING</code>, where a new game session
     * is created for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players
     * accepted the match, the ticket status is returned to <code>SEARCHING</code> to find a new match. For tickets
     * where one or more players failed to accept the match, the ticket status is set to <code>FAILED</code>, and
     * processing is terminated. A new matchmaking request for these players can be submitted as needed.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptMatchRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptMatch operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(AcceptMatchRequest acceptMatchRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptMatchRequest, AcceptMatchResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a
     * fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing
     * your game client or other game components. For example, for games in production, using an alias allows you to
     * seamlessly redirect your player base to a new game server update.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points
     * to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to
     * an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you
     * want to direct players to an upgrade site.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can
     * point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game session. You can reassign an alias to another
     * fleet by calling <code>UpdateAlias</code>.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a
     * fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing
     * your game client or other game components. For example, for games in production, using an alias allows you to
     * seamlessly redirect your player base to a new game server update.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points
     * to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to
     * an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you
     * want to direct players to an upgrade site.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can
     * point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game session. You can reassign an alias to another
     * fleet by calling <code>UpdateAlias</code>.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon GameLift build from a set of game server binary files stored in an Amazon Simple Storage
     * Service (Amazon S3) location. To use this API call, create a <code>.zip</code> file containing all of the files
     * for the build and store it in an Amazon S3 bucket under your AWS account. For help on packaging your build files
     * and creating a build, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your Game to
     * Amazon GameLift</a>.
     * </p>
     * <important>
     * <p>
     * Use this API action ONLY if you are storing your game build files in an Amazon S3 bucket. To create a build using
     * files stored locally, use the CLI command <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html"> <code>upload-build</code>
     * </a>, which uploads the build files from a file location you specify.
     * </p>
     * </important>
     * <p>
     * To create a new build using <code>CreateBuild</code>, identify the storage location and operating system of your
     * game build. You also have the option of specifying a build name and version. If successful, this action creates a
     * new build record with an unique build ID and in <code>INITIALIZED</code> status. Use the API call
     * <a>DescribeBuild</a> to check the status of your build. A build must be in <code>READY</code> status before it
     * can be used to create fleets to host your game.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Creates a new Amazon GameLift build from a set of game server binary files stored in an Amazon Simple Storage
     * Service (Amazon S3) location. To use this API call, create a <code>.zip</code> file containing all of the files
     * for the build and store it in an Amazon S3 bucket under your AWS account. For help on packaging your build files
     * and creating a build, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your Game to
     * Amazon GameLift</a>.
     * </p>
     * <important>
     * <p>
     * Use this API action ONLY if you are storing your game build files in an Amazon S3 bucket. To create a build using
     * files stored locally, use the CLI command <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html"> <code>upload-build</code>
     * </a>, which uploads the build files from a file location you specify.
     * </p>
     * </important>
     * <p>
     * To create a new build using <code>CreateBuild</code>, identify the storage location and operating system of your
     * game build. You also have the option of specifying a build name and version. If successful, this action creates a
     * new build record with an unique build ID and in <code>INITIALIZED</code> status. Use the API call
     * <a>DescribeBuild</a> to check the status of your build. A build must be in <code>READY</code> status before it
     * can be used to create fleets to host your game.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest createBuildRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler);

    /**
     * <p>
     * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2)
     * instances, each of which can run multiple server processes to host game sessions. You configure a fleet to create
     * instances with certain hardware specifications (see <a href="http://aws.amazon.com/ec2/instance-types/">Amazon
     * EC2 Instance Types</a> for more information), and deploy a specified game build to each instance. A newly created
     * fleet passes through several statuses; once it reaches the <code>ACTIVE</code> status, it can begin hosting game
     * sessions.
     * </p>
     * <p>
     * To create a new fleet, you must specify the following: (1) fleet name, (2) build ID of an uploaded game build,
     * (3) an EC2 instance type, and (4) a run-time configuration that describes which server processes to run on each
     * instance in the fleet. (Although the run-time configuration is not a required parameter, the fleet cannot be
     * successfully activated without it.)
     * </p>
     * <p>
     * You can also configure the new fleet with the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fleet description
     * </p>
     * </li>
     * <li>
     * <p>
     * Access permissions for inbound traffic
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet-wide game session protection
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource creation limit
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use Amazon CloudWatch for metrics, you can add the new fleet to a metric group. This allows you to view
     * aggregated metrics for a set of fleets. Once you specify a metric group, the new fleet's metrics are included in
     * the metric group's data.
     * </p>
     * <p>
     * You have the option of creating a VPC peering connection with the new fleet. For more information, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * If the CreateFleet call is successful, Amazon GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a fleet record and sets the status to <code>NEW</code> (followed by other statuses as the fleet is
     * activated).
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's target capacity to 1 (desired instances), which causes Amazon GameLift to start one new EC2
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Starts launching server processes on the instance. If the fleet is configured to run multiple server processes
     * per instance, Amazon GameLift staggers each launch by a few seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's status to <code>ACTIVE</code> as soon as one server process in the fleet is ready to host a game
     * session.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2)
     * instances, each of which can run multiple server processes to host game sessions. You configure a fleet to create
     * instances with certain hardware specifications (see <a href="http://aws.amazon.com/ec2/instance-types/">Amazon
     * EC2 Instance Types</a> for more information), and deploy a specified game build to each instance. A newly created
     * fleet passes through several statuses; once it reaches the <code>ACTIVE</code> status, it can begin hosting game
     * sessions.
     * </p>
     * <p>
     * To create a new fleet, you must specify the following: (1) fleet name, (2) build ID of an uploaded game build,
     * (3) an EC2 instance type, and (4) a run-time configuration that describes which server processes to run on each
     * instance in the fleet. (Although the run-time configuration is not a required parameter, the fleet cannot be
     * successfully activated without it.)
     * </p>
     * <p>
     * You can also configure the new fleet with the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fleet description
     * </p>
     * </li>
     * <li>
     * <p>
     * Access permissions for inbound traffic
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet-wide game session protection
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource creation limit
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use Amazon CloudWatch for metrics, you can add the new fleet to a metric group. This allows you to view
     * aggregated metrics for a set of fleets. Once you specify a metric group, the new fleet's metrics are included in
     * the metric group's data.
     * </p>
     * <p>
     * You have the option of creating a VPC peering connection with the new fleet. For more information, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * If the CreateFleet call is successful, Amazon GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a fleet record and sets the status to <code>NEW</code> (followed by other statuses as the fleet is
     * activated).
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's target capacity to 1 (desired instances), which causes Amazon GameLift to start one new EC2
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Starts launching server processes on the instance. If the fleet is configured to run multiple server processes
     * per instance, Amazon GameLift staggers each launch by a few seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's status to <code>ACTIVE</code> as soon as one server process in the fleet is ready to host a game
     * session.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a game session record and assigns an
     * available server process in the specified fleet to host the game session. A fleet must have an
     * <code>ACTIVE</code> status before a game session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow
     * in the game session. You can also provide a name and game-specific properties for this game session. If
     * successful, a <a>GameSession</a> object is returned containing the game session properties and other settings you
     * specified.
     * </p>
     * <p>
     * <b>Idempotency tokens.</b> You can add a token that uniquely identifies game session requests. This is useful for
     * ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are
     * processed only once; subsequent requests return the original result. All response values are the same with the
     * exception of game session status, which may change.
     * </p>
     * <p>
     * <b>Resource creation limits.</b> If you are creating a game session on a fleet with a resource creation limit
     * policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the
     * policy for this new game session request.
     * </p>
     * <p>
     * <b>Player acceptance policy.</b> By default, newly created game sessions are open to new players. You can
     * restrict new player access by using <a>UpdateGameSession</a> to change the game session's player session creation
     * policy.
     * </p>
     * <p>
     * <b>Game session logs.</b> Logs are retained for all active game sessions for 14 days. To access the logs, call
     * <a>GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a game session record and assigns an
     * available server process in the specified fleet to host the game session. A fleet must have an
     * <code>ACTIVE</code> status before a game session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow
     * in the game session. You can also provide a name and game-specific properties for this game session. If
     * successful, a <a>GameSession</a> object is returned containing the game session properties and other settings you
     * specified.
     * </p>
     * <p>
     * <b>Idempotency tokens.</b> You can add a token that uniquely identifies game session requests. This is useful for
     * ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are
     * processed only once; subsequent requests return the original result. All response values are the same with the
     * exception of game session status, which may change.
     * </p>
     * <p>
     * <b>Resource creation limits.</b> If you are creating a game session on a fleet with a resource creation limit
     * policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the
     * policy for this new game session request.
     * </p>
     * <p>
     * <b>Player acceptance policy.</b> By default, newly created game sessions are open to new players. You can
     * restrict new player access by using <a>UpdateGameSession</a> to change the game session's player session creation
     * policy.
     * </p>
     * <p>
     * <b>Game session logs.</b> Logs are retained for all active game sessions for 14 days. To access the logs, call
     * <a>GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest createGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game
     * sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can
     * wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple
     * regions. To add placement requests to a queue, call <a>StartGameSessionPlacement</a> and reference the queue
     * name.
     * </p>
     * <p>
     * <b>Destination order.</b> When processing a request for a game session, Amazon GameLift tries each destination in
     * order until it finds one with available resources to host the new game session. A queue's default order is
     * determined by how destinations are listed. The default order is overridden when a game session placement request
     * provides player latency information. Player latency information enables Amazon GameLift to prioritize
     * destinations where players report the lowest average latency, as a result placing the new game session where the
     * majority of players will have the best possible gameplay experience.
     * </p>
     * <p>
     * <b>Player latency policies.</b> For placement requests containing player latency information, use player latency
     * policies to protect individual players from very high latencies. With a latency cap, even when a destination can
     * deliver a low latency for most players, the game is not placed where any individual player is reporting latency
     * higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively
     * starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls;
     * for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a
     * higher cap for the next 60 seconds, etc.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency
     * policies. If successful, a new queue object is returned.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(CreateGameSessionQueueRequest createGameSessionQueueRequest);

    /**
     * <p>
     * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game
     * sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can
     * wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple
     * regions. To add placement requests to a queue, call <a>StartGameSessionPlacement</a> and reference the queue
     * name.
     * </p>
     * <p>
     * <b>Destination order.</b> When processing a request for a game session, Amazon GameLift tries each destination in
     * order until it finds one with available resources to host the new game session. A queue's default order is
     * determined by how destinations are listed. The default order is overridden when a game session placement request
     * provides player latency information. Player latency information enables Amazon GameLift to prioritize
     * destinations where players report the lowest average latency, as a result placing the new game session where the
     * majority of players will have the best possible gameplay experience.
     * </p>
     * <p>
     * <b>Player latency policies.</b> For placement requests containing player latency information, use player latency
     * policies to protect individual players from very high latencies. With a latency cap, even when a destination can
     * deliver a low latency for most players, the game is not placed where any individual player is reporting latency
     * higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively
     * starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls;
     * for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a
     * higher cap for the next 60 seconds, etc.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency
     * policies. If successful, a new queue object is returned.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(CreateGameSessionQueueRequest createGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionQueueRequest, CreateGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines
     * for matching players and getting the matches into games. You can set up multiple matchmaking configurations to
     * handle the scenarios needed for your game. Each matchmaking request (<a>StartMatchmaking</a>) specifies a
     * configuration for the match and provides player attributes to support the configuration being used.
     * </p>
     * <p>
     * To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule
     * set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a
     * new game session for the match; and the maximum time allowed for a matchmaking attempt.
     * </p>
     * <p>
     * <b>Player acceptance</b> -- In each configuration, you have the option to require that all players accept
     * participation in a proposed match. To enable this feature, set <i>AcceptanceRequired</i> to true and specify a
     * time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does
     * not move ahead to game session placement unless all matched players accept.
     * </p>
     * <p>
     * <b>Matchmaking status notification</b> -- There are two ways to track the progress of matchmaking tickets: (1)
     * polling ticket status with <a>DescribeMatchmaking</a>; or (2) receiving notifications with Amazon Simple
     * Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the
     * notifications, and provide the topic ARN in the matchmaking configuration (see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-notification.html"> Setting up
     * Notifications for Matchmaking</a>). Since notifications promise only "best effort" delivery, we recommend calling
     * <code>DescribeMatchmaking</code> if no notifications are received within 30 seconds.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(
            CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest);

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines
     * for matching players and getting the matches into games. You can set up multiple matchmaking configurations to
     * handle the scenarios needed for your game. Each matchmaking request (<a>StartMatchmaking</a>) specifies a
     * configuration for the match and provides player attributes to support the configuration being used.
     * </p>
     * <p>
     * To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule
     * set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a
     * new game session for the match; and the maximum time allowed for a matchmaking attempt.
     * </p>
     * <p>
     * <b>Player acceptance</b> -- In each configuration, you have the option to require that all players accept
     * participation in a proposed match. To enable this feature, set <i>AcceptanceRequired</i> to true and specify a
     * time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does
     * not move ahead to game session placement unless all matched players accept.
     * </p>
     * <p>
     * <b>Matchmaking status notification</b> -- There are two ways to track the progress of matchmaking tickets: (1)
     * polling ticket status with <a>DescribeMatchmaking</a>; or (2) receiving notifications with Amazon Simple
     * Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the
     * notifications, and provide the topic ARN in the matchmaking configuration (see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-notification.html"> Setting up
     * Notifications for Matchmaking</a>). Since notifications promise only "best effort" delivery, we recommend calling
     * <code>DescribeMatchmaking</code> if no notifications are received within 30 seconds.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(
            CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMatchmakingConfigurationRequest, CreateMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the
     * number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or
     * character type. Rule sets are used in matchmaking configurations, which define how matchmaking requests are
     * handled. Each <a>MatchmakingConfiguration</a> uses one rule set; you can set up multiple rule sets to handle the
     * scenarios that suit your game (such as for different game modes), and create a separate matchmaking configuration
     * for each rule set. See additional information on rule set content in the <a>MatchmakingRuleSet</a> structure. For
     * help creating rule sets, including useful examples, see the topic <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> Adding FlexMatch to Your
     * Game</a>.
     * </p>
     * <p>
     * Once created, matchmaking rule sets cannot be changed or deleted, so we recommend checking the rule set syntax
     * using <a>ValidateMatchmakingRuleSet</a>before creating the rule set.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide the set of rules and a unique name. Rule sets must be defined in the
     * same region as the matchmaking configuration they will be used with. Rule sets cannot be edited or deleted. If
     * you need to change a rule set, create a new one with the necessary edits and then update matchmaking
     * configurations to use the new rule set.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest);

    /**
     * <p>
     * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the
     * number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or
     * character type. Rule sets are used in matchmaking configurations, which define how matchmaking requests are
     * handled. Each <a>MatchmakingConfiguration</a> uses one rule set; you can set up multiple rule sets to handle the
     * scenarios that suit your game (such as for different game modes), and create a separate matchmaking configuration
     * for each rule set. See additional information on rule set content in the <a>MatchmakingRuleSet</a> structure. For
     * help creating rule sets, including useful examples, see the topic <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> Adding FlexMatch to Your
     * Game</a>.
     * </p>
     * <p>
     * Once created, matchmaking rule sets cannot be changed or deleted, so we recommend checking the rule set syntax
     * using <a>ValidateMatchmakingRuleSet</a>before creating the rule set.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide the set of rules and a unique name. Rule sets must be defined in the
     * same region as the matchmaking configuration they will be used with. Rule sets cannot be edited or deleted. If
     * you need to change a rule set, create a new one with the necessary edits and then update matchmaking
     * configurations to use the new rule set.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMatchmakingRuleSetRequest, CreateMatchmakingRuleSetResult> asyncHandler);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. Before a player can be added, a game session
     * must have an <code>ACTIVE</code> status, have a creation policy of <code>ALLOW_ALL</code>, and have an open
     * player slot. To add a group of players to a game session, use <a>CreatePlayerSessions</a>.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a string of player data. If
     * successful, the player is added to the game session and a new <a>PlayerSession</a> object is returned. Player
     * sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSession operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. Before a player can be added, a game session
     * must have an <code>ACTIVE</code> status, have a creation policy of <code>ALLOW_ALL</code>, and have an open
     * player slot. To add a group of players to a game session, use <a>CreatePlayerSessions</a>.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a string of player data. If
     * successful, the player is added to the game session and a new <a>PlayerSession</a> object is returned. Player
     * sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest createPlayerSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can
     * be added, a game session must have an <code>ACTIVE</code> status, have a creation policy of
     * <code>ALLOW_ALL</code>, and have an open player slot. To add a single player to a game session, use
     * <a>CreatePlayerSession</a>.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data
     * strings. If successful, the players are added to the game session and a set of new <a>PlayerSession</a> objects
     * is returned. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can
     * be added, a game session must have an <code>ACTIVE</code> status, have a creation policy of
     * <code>ALLOW_ALL</code>, and have an open player slot. To add a single player to a game session, use
     * <a>CreatePlayerSession</a>.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data
     * strings. If successful, the players are added to the game session and a set of new <a>PlayerSession</a> objects
     * is returned. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest createPlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a
     * virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to
     * communicate directly with other AWS resources. Once you've received authorization, call
     * <a>CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use
     * to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the AWS account with the VPC that you
     * want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a
     * DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of
     * the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If
     * successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the AWS account with the VPC that is
     * peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the
     * peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled by a call to
     * <a>DeleteVpcPeeringAuthorization</a>. You must create or delete the peering connection while the authorization is
     * valid.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(
            CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest);

    /**
     * <p>
     * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a
     * virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to
     * communicate directly with other AWS resources. Once you've received authorization, call
     * <a>CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use
     * to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the AWS account with the VPC that you
     * want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a
     * DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of
     * the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If
     * successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the AWS account with the VPC that is
     * peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the
     * peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled by a call to
     * <a>DeleteVpcPeeringAuthorization</a>. You must create or delete the peering connection while the authorization is
     * valid.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(
            CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringAuthorizationRequest, CreateVpcPeeringAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for
     * your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other
     * AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you
     * use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more
     * information, see <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering
     * with Amazon GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to call
     * <a>CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift
     * fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection
     * for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer
     * with. This operation is asynchronous. If successful, a <a>VpcPeeringConnection</a> request is created. You can
     * use continuous polling to track the request's status using <a>DescribeVpcPeeringConnections</a>, or by monitoring
     * fleet events for success or failure using <a>DescribeFleetEvents</a>.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for
     * your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other
     * AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you
     * use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more
     * information, see <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering
     * with Amazon GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to call
     * <a>CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift
     * fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection
     * for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer
     * with. This operation is asynchronous. If successful, a <a>VpcPeeringConnection</a> request is created. You can
     * use continuous polling to track the request's status using <a>DescribeVpcPeeringConnections</a>, or by monitoring
     * fleet events for success or failure using <a>DescribeFleetEvents</a>.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias. Game clients attempting to access a server process
     * using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias. Game clients attempting to access a server process
     * using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the
     * build, but you can no longer create new fleets with the deleted build.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the
     * build, but you can no longer create new fleets with the deleted build.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest deleteBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, DeleteBuildResult> asyncHandler);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to
     * zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use
     * that fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to
     * zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use
     * that fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a game session queue. This action means that any <a>StartGameSessionPlacement</a> requests that reference
     * this queue will fail. To delete a queue, specify the queue name.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest);

    /**
     * <p>
     * Deletes a game session queue. This action means that any <a>StartGameSessionPlacement</a> requests that reference
     * this queue will fail. To delete a queue, specify the queue name.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGameSessionQueueRequest, DeleteGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(
            DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(
            DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMatchmakingConfigurationRequest, DeleteMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to
     * create a peering connection, call <a>DeleteVpcPeeringConnection</a> to remove the connection.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(
            DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest);

    /**
     * <p>
     * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to
     * create a peering connection, call <a>DeleteVpcPeeringConnection</a> to remove the connection.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(
            DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringAuthorizationRequest, DeleteVpcPeeringAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC
     * peering connection that you want to delete. You can check for an authorization by calling
     * <a>DescribeVpcPeeringAuthorizations</a> or request a new one using <a>CreateVpcPeeringAuthorization</a>.
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the
     * connection is removed.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

    /**
     * <p>
     * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC
     * peering connection that you want to delete. You can check for an authorization by calling
     * <a>DescribeVpcPeeringAuthorizations</a> or request a new one using <a>CreateVpcPeeringAuthorization</a>.
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the
     * connection is removed.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's
     * target fleet ID only, use <code>ResolveAlias</code>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, the requested alias record is returned.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's
     * target fleet ID only, use <code>ResolveAlias</code>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, the requested alias record is returned.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest describeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build ID. If successful, an object containing
     * the build properties is returned.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build ID. If successful, an object containing
     * the build properties is returned.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest describeBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * maximum number of instances allowed per AWS account (service limit)
     * </p>
     * </li>
     * <li>
     * <p>
     * current usage level for the AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management
     * Console for Amazon GameLift (see the drop-down list in the upper right corner).
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * maximum number of instances allowed per AWS account (service limit)
     * </p>
     * </li>
     * <li>
     * <p>
     * current usage level for the AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management
     * Console for Amazon GameLift (see the drop-down list in the upper right corner).
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can
     * request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID. When specifying a list of fleet IDs,
     * attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can
     * request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID. When specifying a list of fleet IDs,
     * attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest describeFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of
     * instances that have been requested for the fleet and the number currently active. You can request capacity for
     * all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>FleetCapacity</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only
     * for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of
     * instances that have been requested for the fleet and the number currently active. You can request capacity for
     * all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>FleetCapacity</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only
     * for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest describeFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use
     * the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event
     * log entries matching the request are returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetEvents operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use
     * the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event
     * log entries matching the request are returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetEvents operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest describeFleetEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses
     * and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound
     * connection permissions, specify a fleet ID. If successful, a collection of <a>IpPermission</a> objects is
     * returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses
     * and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound
     * connection permissions, specify a fleet ID. If successful, a collection of <a>IpPermission</a> objects is
     * returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or
     * specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a <a>FleetUtilization</a> object is returned for
     * each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets
     * that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or
     * specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a <a>FleetUtilization</a> object is returned for
     * each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets
     * that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest describeFleetUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> or <code>GameSessionArn</code> to request details
     * for a specific game session; (2) provide either a <code>FleetId</code> or an <code>AliasId</code> to request
     * properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can
     * filter this request by game session status. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>GameSessionDetail</a> object is returned for each session matching the
     * request.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> or <code>GameSessionArn</code> to request details
     * for a specific game session; (2) provide either a <code>FleetId</code> or an <code>AliasId</code> to request
     * properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can
     * filter this request by game session status. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>GameSessionDetail</a> object is returned for each session matching the
     * request.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionDetailsRequest, DescribeGameSessionDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties and current status of a game session placement request. To get game session placement
     * details, specify the placement ID. If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessionPlacement operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(
            DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest);

    /**
     * <p>
     * Retrieves properties and current status of a game session placement request. To get game session placement
     * details, specify the placement ID. If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionPlacement operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(
            DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionPlacementRequest, DescribeGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the region.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessionQueues operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(
            DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest);

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the region.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionQueues operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(
            DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionQueuesRequest, DescribeGameSessionQueuesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a
     * fleet. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered by
     * certain criteria. To retrieve protection policy settings for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this
     * request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages.
     * If successful, a <a>GameSession</a> object is returned for each game session matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a
     * fleet. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered by
     * certain criteria. To retrieve protection policy settings for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this
     * request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages.
     * If successful, a <a>GameSession</a> object is returned for each game session matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest describeGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all
     * instances in the fleet or get details on one specific instance.
     * </p>
     * <p>
     * To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID
     * only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an
     * <a>Instance</a> object is returned for each result.
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all
     * instances in the fleet or get details on one specific instance.
     * </p>
     * <p>
     * To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID
     * only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an
     * <a>Instance</a> object is returned for each result.
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a set of one or more matchmaking tickets. Use this operation to retrieve ticket information, including
     * status and--once a successful match is made--acquire connection information for the resulting new game session.
     * </p>
     * <p>
     * You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to
     * using event notifications. See more details on tracking matchmaking requests through polling or notifications in
     * <a>StartMatchmaking</a>.
     * </p>
     * <p>
     * You can request data for a one or a list of ticket IDs. If the request is successful, a ticket object is returned
     * for each requested ID. When specifying a list of ticket IDs, objects are returned only for tickets that currently
     * exist.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(DescribeMatchmakingRequest describeMatchmakingRequest);

    /**
     * <p>
     * Retrieves a set of one or more matchmaking tickets. Use this operation to retrieve ticket information, including
     * status and--once a successful match is made--acquire connection information for the resulting new game session.
     * </p>
     * <p>
     * You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to
     * using event notifications. See more details on tracking matchmaking requests through polling or notifications in
     * <a>StartMatchmaking</a>.
     * </p>
     * <p>
     * You can request data for a one or a list of ticket IDs. If the request is successful, a ticket object is returned
     * for each requested ID. When specifying a list of ticket IDs, objects are returned only for tickets that currently
     * exist.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(DescribeMatchmakingRequest describeMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRequest, DescribeMatchmakingResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following
     * options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to
     * retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is
     * returned for each requested name. When specifying a list of names, only configurations that currently exist are
     * returned.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingConfigurationsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeMatchmakingConfigurations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest);

    /**
     * <p>
     * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following
     * options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to
     * retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is
     * returned for each requested name. When specifying a list of names, only configurations that currently exist are
     * returned.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingConfigurationsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmakingConfigurations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingConfigurationsRequest, DescribeMatchmakingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region,
     * or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRuleSetsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(
            DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest);

    /**
     * <p>
     * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region,
     * or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMatchmakingRuleSetsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(
            DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRuleSetsRequest, DescribeMatchmakingRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a
     * <code>PlayerSessionId</code> to request properties for a specific player session; (2) provide a
     * <code>GameSessionId</code> to request properties for all player sessions in the specified game session; (3)
     * provide a <code>PlayerId</code> to request properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a
     * player ID. You can filter this request by player session status. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a <a>PlayerSession</a> object is returned for each session
     * matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a
     * <code>PlayerSessionId</code> to request properties for a specific player session; (2) provide a
     * <code>GameSessionId</code> to request properties for all player sessions in the specified game session; (3)
     * provide a <code>PlayerId</code> to request properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a
     * player ID. You can filter this request by player session status. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a <a>PlayerSession</a> object is returned for each session
     * matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * Player-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreatePlayerSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreatePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribePlayerSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest describePlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon
     * GameLift how to launch server processes on instances in the fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeRuntimeConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest);

    /**
     * <p>
     * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon
     * GameLift how to launch server processes on instances in the fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRuntimeConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuntimeConfigurationRequest, DescribeRuntimeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC
     * peering authorizations and requests for peering. This includes those initiated and received by this account.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringAuthorizationsRequest
     * @return A Java Future containing the result of the DescribeVpcPeeringAuthorizations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest);

    /**
     * <p>
     * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC
     * peering authorizations and requests for peering. This includes those initiated and received by this account.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringAuthorizations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringAuthorizationsRequest, DescribeVpcPeeringAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or
     * for one specific fleet ID.
     * </p>
     * <p>
     * To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If
     * successful, the retrieved information includes both active and pending connections. Active connections identify
     * the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

    /**
     * <p>
     * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or
     * for one specific fleet ID.
     * </p>
     * <p>
     * To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If
     * successful, the retrieved information includes both active and pending connections. Active connections identify
     * the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * VPC peering connection operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringAuthorizations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringAuthorization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateVpcPeeringConnection</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeVpcPeeringConnections</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteVpcPeeringConnection</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL
     * to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service.
     * @sample AmazonGameLiftAsync.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL
     * to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler);

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or watching activity in real time.
     * </p>
     * <p>
     * Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon
     * GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux
     * instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client.
     * The private key must be saved in the proper format to a <code>.pem</code> file before using. If you're making
     * this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See
     * the example later in this topic). For more information on remote access, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Accessing an
     * Instance</a>.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of the instance and the fleet it belongs to. If
     * successful, an <a>InstanceAccess</a> object is returned containing the instance's IP address and a set of
     * credentials.
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the GetInstanceAccess operation returned by the service.
     * @sample AmazonGameLiftAsync.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest getInstanceAccessRequest);

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or watching activity in real time.
     * </p>
     * <p>
     * Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon
     * GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux
     * instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client.
     * The private key must be saved in the proper format to a <code>.pem</code> file before using. If you're making
     * this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See
     * the example later in this topic). For more information on remote access, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Accessing an
     * Instance</a>.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of the instance and the fleet it belongs to. If
     * successful, an <a>InstanceAccess</a> object is returned containing the instance's IP address and a set of
     * credentials.
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceAccess operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest getInstanceAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessRequest, GetInstanceAccessResult> asyncHandler);

    /**
     * <p>
     * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy
     * type. Use the pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Returned aliases are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonGameLiftAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy
     * type. Use the pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Returned aliases are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AmazonGameLiftAsync.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonGameLiftAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy prompts Amazon GameLift to track a
     * certain metric for a fleet and automatically change the fleet's capacity in specific circumstances. Each scaling
     * policy contains one rule statement. Fleets can have multiple scaling policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15] minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the rule values.
     * All parameters for this action are required. If successful, the policy name is returned. Scaling policies cannot
     * be suspended or made inactive. To stop enforcing a scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsync.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy prompts Amazon GameLift to track a
     * certain metric for a fleet and automatically change the fleet's capacity in specific circumstances. Each scaling
     * policy contains one rule statement. Fleets can have multiple scaling policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15] minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the rule values.
     * All parameters for this action are required. If successful, the policy name is returned. Scaling policies cannot
     * be suspended or made inactive. To stop enforcing a scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * <i>This API call is not currently in use. </i> Retrieves a fresh set of upload credentials and the assigned
     * Amazon S3 storage location for a specific build. Valid credentials are required to upload your game build files
     * to Amazon S3.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsync.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * <i>This API call is not currently in use. </i> Retrieves a fresh set of upload credentials and the assigned
     * Amazon S3 storage location for a specific build. Valid credentials are required to upload your game build files
     * to Amazon S3.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest requestUploadCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ResolveAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest resolveAliasRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves a set of game sessions that match a set of search criteria and sorts them in a specified order. A game
     * session search is limited to a single fleet. Search results include only game sessions that are in
     * <code>ACTIVE</code> status. If you need to retrieve game sessions with a status other than active, use
     * <a>DescribeGameSessions</a>. If you need to retrieve the protection policy for each game session, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * You can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- Unique identifier for the game session. You can use either a <code>GameSessionId</code>
     * or <code>GameSessionArn</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionName</b> -- Name assigned to a game session. This value is set when requesting a new game session
     * with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>. Game session names do not need to be
     * unique to a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>creationTimeMillis</b> -- Value indicating when a game session was created. It is expressed in Unix time as
     * milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>playerSessionCount</b> -- Number of players currently connected to a game session. This value changes rapidly
     * as players join the session or drop out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether a game session has reached its maximum
     * number of players. When searching with this attribute, the search value must be <code>true</code> or
     * <code>false</code>. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort
     * expression, or both. Use the pagination parameters to retrieve results as a set of sequential pages. If
     * successful, a collection of <a>GameSession</a> objects matching the request is returned.
     * </p>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the SearchGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest searchGameSessionsRequest);

    /**
     * <p>
     * Retrieves a set of game sessions that match a set of search criteria and sorts them in a specified order. A game
     * session search is limited to a single fleet. Search results include only game sessions that are in
     * <code>ACTIVE</code> status. If you need to retrieve game sessions with a status other than active, use
     * <a>DescribeGameSessions</a>. If you need to retrieve the protection policy for each game session, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * You can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- Unique identifier for the game session. You can use either a <code>GameSessionId</code>
     * or <code>GameSessionArn</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionName</b> -- Name assigned to a game session. This value is set when requesting a new game session
     * with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>. Game session names do not need to be
     * unique to a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>creationTimeMillis</b> -- Value indicating when a game session was created. It is expressed in Unix time as
     * milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>playerSessionCount</b> -- Number of players currently connected to a game session. This value changes rapidly
     * as players join the session or drop out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether a game session has reached its maximum
     * number of players. When searching with this attribute, the search value must be <code>true</code> or
     * <code>false</code>. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort
     * expression, or both. Use the pagination parameters to retrieve results as a set of sequential pages. If
     * successful, a collection of <a>GameSession</a> objects matching the request is returned.
     * </p>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest searchGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchGameSessionsRequest, SearchGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out.
     * </p>
     * <p>
     * A game session placement request can also request player sessions. When a new game session is successfully
     * created, Amazon GameLift creates a player session for each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order.
     * </p>
     * <p>
     * Alternatively, when requesting a game session with players, you can also provide latency data for each player in
     * relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in
     * the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a
     * region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each
     * region's average lag for all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The queue name and a set of game session properties and settings
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) A set of IDs and player data for each player you want to join to the new game session
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency data for all players (if you want to optimize game play for the players)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a new game session placement is created.
     * </p>
     * <p>
     * To track the status of a placement request, call <a>DescribeGameSessionPlacement</a> and check the request's
     * status. If the status is <code>FULFILLED</code>, a new game session has been created and a game session ARN and
     * region are referenced. If the placement request times out, you can resubmit the request or retry it with a
     * different queue.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the StartGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsync.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(
            StartGameSessionPlacementRequest startGameSessionPlacementRequest);

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out.
     * </p>
     * <p>
     * A game session placement request can also request player sessions. When a new game session is successfully
     * created, Amazon GameLift creates a player session for each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order.
     * </p>
     * <p>
     * Alternatively, when requesting a game session with players, you can also provide latency data for each player in
     * relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in
     * the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a
     * region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each
     * region's average lag for all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The queue name and a set of game session properties and settings
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) A set of IDs and player data for each player you want to join to the new game session
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency data for all players (if you want to optimize game play for the players)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a new game session placement is created.
     * </p>
     * <p>
     * To track the status of a placement request, call <a>DescribeGameSessionPlacement</a> and check the request's
     * status. If the status is <code>FULFILLED</code>, a new game session has been created and a game session ARN and
     * region are referenced. If the placement request times out, you can resubmit the request or retry it with a
     * different queue.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(
            StartGameSessionPlacementRequest startGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<StartGameSessionPlacementRequest, StartGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new
     * game for the matched players. Each matchmaking request specifies the type of match to build (team configuration,
     * rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to
     * host the new game session for optimal performance. A matchmaking request might start with a single player or a
     * group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match
     * type, rules, and the queue used to place a new game session are defined in a
     * <code>MatchmakingConfiguration</code>. For complete information on setting up and using FlexMatch, see the topic
     * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> Adding FlexMatch to Your
     * Game</a>.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If
     * successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>. Track the status of the
     * ticket to respond as needed and acquire game session connection information for successfully completed matches.
     * </p>
     * <p>
     * <b>Tracking ticket status</b> -- A couple of options are available for tracking the status of matchmaking
     * requests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Polling -- Call <code>DescribeMatchmaking</code>. This operation returns the full ticket object, including
     * current status and (for completed tickets) game session connection info. We recommend polling no more than once
     * every 10 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service
     * (SNS). Notifications are easy to set up (see <a>CreateMatchmakingConfiguration</a>) and typically deliver match
     * status changes faster and more efficiently than polling. We recommend that you use polling to back up to
     * notifications (since delivery is not guaranteed) and call <code>DescribeMatchmaking</code> only when
     * notifications are not received within 30 seconds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Processing a matchmaking request</b> -- FlexMatch handles a matchmaking request as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Your client code submits a <code>StartMatchmaking</code> request for one or more players and tracks the status of
     * the request ticket.
     * </p>
     * </li>
     * <li>
     * <p>
     * FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is
     * identified, all tickets in the proposed match are advanced to the next status.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status
     * <code>REQUIRES_ACCEPTANCE</code>. This status triggers your client code to solicit acceptance from all players in
     * every ticket involved in the match, and then call <a>AcceptMatch</a> for each player. If any player rejects or
     * fails to accept the match before a specified timeout, the proposed match is dropped (see <code>AcceptMatch</code>
     * for more details).
     * </p>
     * </li>
     * <li>
     * <p>
     * Once a match is proposed and accepted, the matchmaking tickets move into status <code>PLACING</code>. FlexMatch
     * locates resources for a new game session using the game session queue (set in the matchmaking configuration) and
     * creates the game session based on the match data.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the match is successfully placed, the matchmaking tickets move into <code>COMPLETED</code> status.
     * Connection information (including game session endpoint and player session) is added to the matchmaking tickets.
     * Matched players can use the connection information to join the game.
     * </p>
     * </li>
     * </ol>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMatchmakingRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the StartMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest startMatchmakingRequest);

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new
     * game for the matched players. Each matchmaking request specifies the type of match to build (team configuration,
     * rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to
     * host the new game session for optimal performance. A matchmaking request might start with a single player or a
     * group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match
     * type, rules, and the queue used to place a new game session are defined in a
     * <code>MatchmakingConfiguration</code>. For complete information on setting up and using FlexMatch, see the topic
     * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/match-intro.html"> Adding FlexMatch to Your
     * Game</a>.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If
     * successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>. Track the status of the
     * ticket to respond as needed and acquire game session connection information for successfully completed matches.
     * </p>
     * <p>
     * <b>Tracking ticket status</b> -- A couple of options are available for tracking the status of matchmaking
     * requests:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Polling -- Call <code>DescribeMatchmaking</code>. This operation returns the full ticket object, including
     * current status and (for completed tickets) game session connection info. We recommend polling no more than once
     * every 10 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service
     * (SNS). Notifications are easy to set up (see <a>CreateMatchmakingConfiguration</a>) and typically deliver match
     * status changes faster and more efficiently than polling. We recommend that you use polling to back up to
     * notifications (since delivery is not guaranteed) and call <code>DescribeMatchmaking</code> only when
     * notifications are not received within 30 seconds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Processing a matchmaking request</b> -- FlexMatch handles a matchmaking request as follows:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Your client code submits a <code>StartMatchmaking</code> request for one or more players and tracks the status of
     * the request ticket.
     * </p>
     * </li>
     * <li>
     * <p>
     * FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is
     * identified, all tickets in the proposed match are advanced to the next status.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status
     * <code>REQUIRES_ACCEPTANCE</code>. This status triggers your client code to solicit acceptance from all players in
     * every ticket involved in the match, and then call <a>AcceptMatch</a> for each player. If any player rejects or
     * fails to accept the match before a specified timeout, the proposed match is dropped (see <code>AcceptMatch</code>
     * for more details).
     * </p>
     * </li>
     * <li>
     * <p>
     * Once a match is proposed and accepted, the matchmaking tickets move into status <code>PLACING</code>. FlexMatch
     * locates resources for a new game session using the game session queue (set in the matchmaking configuration) and
     * creates the game session based on the match data.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the match is successfully placed, the matchmaking tickets move into <code>COMPLETED</code> status.
     * Connection information (including game session endpoint and player session) is added to the matchmaking tickets.
     * Matched players can use the connection information to join the game.
     * </p>
     * </li>
     * </ol>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startMatchmakingRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest startMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<StartMatchmakingRequest, StartMatchmakingResult> asyncHandler);

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the StopGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsync.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(StopGameSessionPlacementRequest stopGameSessionPlacementRequest);

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(StopGameSessionPlacementRequest stopGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<StopGameSessionPlacementRequest, StopGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the
     * ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to
     * <code>CANCELLED</code>.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopMatchmakingRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the StopMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(StopMatchmakingRequest stopMatchmakingRequest);

    /**
     * <p>
     * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the
     * ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to
     * <code>CANCELLED</code>.
     * </p>
     * <p>
     * Matchmaking-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopMatchmaking</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AcceptMatch</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopMatchmakingRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(StopMatchmakingRequest stopMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<StopMatchmakingRequest, StopMatchmakingResult> asyncHandler);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * <p>
     * Alias-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResolveAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * <p>
     * Build-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListBuilds</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateBuild</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteBuild</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest updateBuildRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID
     * and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID
     * and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest updateFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you
     * want this fleet to contain. Before calling this action, you may want to call <a>DescribeEC2InstanceLimits</a> to
     * get the maximum capacity based on the fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using autoscaling (see <a>PutScalingPolicy</a>), you may want to specify a minimum and/or maximum
     * capacity. If you don't provide these, autoscaling can set capacity anywhere between zero and the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If
     * successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the
     * desired instance count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you
     * want this fleet to contain. Before calling this action, you may want to call <a>DescribeEC2InstanceLimits</a> to
     * get the maximum capacity based on the fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using autoscaling (see <a>PutScalingPolicy</a>), you may want to specify a minimum and/or maximum
     * capacity. If you don't provide these, autoscaling can set capacity anywhere between zero and the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If
     * successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the
     * desired instance count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest updateFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the
     * permissions you want to update. List the permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions. If
     * successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the
     * permissions you want to update. List the permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions. If
     * successful, the fleet ID for the updated fleet is returned.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum player count, protection policy, which
     * controls whether or not an active game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can join the session. To update a game
     * session, specify the game session ID and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum player count, protection policy, which
     * controls whether or not an active game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can join the session. To update a game
     * session, specify the game session ID and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * <p>
     * Game-session-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionDetails</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>SearchGameSessions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSession</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetGameSessionLogUrl</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Game session placements
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StartGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionPlacement</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopGameSessionPlacement</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest updateGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a game session queue, which determines how new game session requests in the queue are
     * processed. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(UpdateGameSessionQueueRequest updateGameSessionQueueRequest);

    /**
     * <p>
     * Updates settings for a game session queue, which determines how new game session requests in the queue are
     * processed. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * <p>
     * Queue-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeGameSessionQueues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateGameSessionQueue</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteGameSessionQueue</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(UpdateGameSessionQueueRequest updateGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionQueueRequest, UpdateGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to
     * be updated and provide the new settings.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(
            UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest);

    /**
     * <p>
     * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to
     * be updated and provide the new settings.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMatchmakingConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(
            UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMatchmakingConfigurationRequest, UpdateMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch
     * server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update run-time configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> object
     * with the updated collection of server process configurations.
     * </p>
     * <p>
     * Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how
     * it launches server processes to comply with the latest version. Existing server processes are not affected by the
     * update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the
     * current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing
     * processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

    /**
     * <p>
     * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch
     * server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update run-time configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> object
     * with the updated collection of server process configurations.
     * </p>
     * <p>
     * Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how
     * it launches server processes to comply with the latest version. Existing server processes are not affected by the
     * update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the
     * current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing
     * processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.
     * </p>
     * <p>
     * Fleet-related operations include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateFleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListFleets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Describe fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetUtilization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeRuntimeConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeFleetEvents</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Update fleets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Manage fleet capacity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeScalingPolicies</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteScalingPolicy</a> (automatic scaling)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEC2InstanceLimits</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <a>DeleteFleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuntimeConfigurationRequest, UpdateRuntimeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set uses
     * syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a
     * rule set string.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param validateMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsync.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(
            ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest);

    /**
     * <p>
     * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set uses
     * syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a
     * rule set string.
     * </p>
     * <p>
     * Operations related to match configurations and rule sets include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingConfigurations</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteMatchmakingConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeMatchmakingRuleSets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ValidateMatchmakingRuleSet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param validateMatchmakingRuleSetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(
            ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateMatchmakingRuleSetRequest, ValidateMatchmakingRuleSetResult> asyncHandler);

}
