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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DescribeReservedCacheNodesOfferings</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodesOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedCacheNodesOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     */
    private String reservedCacheNodesOfferingId;
    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the available offerings matching the specified
     * cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given
     * duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     */
    private String duration;
    /**
     * <p>
     * The product description filter value. Use this parameter to show only the available offerings matching the
     * specified product description.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @return The offering identifier filter value. Use this parameter to show only the available offering that matches
     *         the specified reservation identifier.</p>
     *         <p>
     *         Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public String getReservedCacheNodesOfferingId() {
        return this.reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        setReservedCacheNodesOfferingId(reservedCacheNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the available offerings matching the specified
     * cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type filter value. Use this parameter to show only the available offerings matching the
     *        specified cache node type.</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the available offerings matching the specified
     * cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @return The cache node type filter value. Use this parameter to show only the available offerings matching the
     *         specified cache node type.</p>
     *         <p>
     *         The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *         provide more memory and computational power at lower cost when compared to their equivalent previous
     *         generation counterparts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *         <code>cache.t2.medium</code>
     *         </p>
     *         <p>
     *         <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *         </p>
     *         <p>
     *         <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *         <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>T1 node types:</b> <code>cache.t1.micro</code>
     *         </p>
     *         <p>
     *         <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *         <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation:
     *         </p>
     *         <p>
     *         <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: (not recommended)
     *         </p>
     *         <p>
     *         <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Notes:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *         either <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type filter value. Use this parameter to show only the available offerings matching the specified
     * cache node type.
     * </p>
     * <p>
     * The following node types are supported by ElastiCache. Generally speaking, the current generation types provide
     * more memory and computational power at lower cost when compared to their equivalent previous generation
     * counterparts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>
     * </p>
     * <p>
     * <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>
     * </p>
     * <p>
     * <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>,
     * <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>T1 node types:</b> <code>cache.t1.micro</code>
     * </p>
     * <p>
     * <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>, <code>cache.m1.large</code>,
     * <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation:
     * </p>
     * <p>
     * <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: (not recommended)
     * </p>
     * <p>
     * <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type filter value. Use this parameter to show only the available offerings matching the
     *        specified cache node type.</p>
     *        <p>
     *        The following node types are supported by ElastiCache. Generally speaking, the current generation types
     *        provide more memory and computational power at lower cost when compared to their equivalent previous
     *        generation counterparts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>T2 node types:</b> <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *        <code>cache.t2.medium</code>
     *        </p>
     *        <p>
     *        <b>M3 node types:</b> <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *        <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>
     *        </p>
     *        <p>
     *        <b>M4 node types:</b> <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>T1 node types:</b> <code>cache.t1.micro</code>
     *        </p>
     *        <p>
     *        <b>M1 node types:</b> <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     *        <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>C1 node types:</b> <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation:
     *        </p>
     *        <p>
     *        <b>R3 node types:</b> <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: (not recommended)
     *        </p>
     *        <p>
     *        <b>M2 node types:</b> <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode disabled): Redis backup/restore is not supported on T1 and T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis (cluster mode enabled): Backup/restore is not supported on T1 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given
     * duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a
     *        given duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given
     * duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @return Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a
     *         given duration.</p>
     *         <p>
     *         Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a given
     * duration.
     * </p>
     * <p>
     * Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * </p>
     * 
     * @param duration
     *        Duration filter value, specified in years or seconds. Use this parameter to show only reservations for a
     *        given duration.</p>
     *        <p>
     *        Valid Values: <code>1 | 3 | 31536000 | 94608000</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the available offerings matching the
     * specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Use this parameter to show only the available offerings matching the
     *        specified product description.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the available offerings matching the
     * specified product description.
     * </p>
     * 
     * @return The product description filter value. Use this parameter to show only the available offerings matching
     *         the specified product description.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The product description filter value. Use this parameter to show only the available offerings matching the
     * specified product description.
     * </p>
     * 
     * @param productDescription
     *        The product description filter value. Use this parameter to show only the available offerings matching the
     *        specified product description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only the available offerings matching the
     *        specified offering type.</p>
     *        <p>
     *        Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @return The offering type filter value. Use this parameter to show only the available offerings matching the
     *         specified offering type.</p>
     *         <p>
     *         Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type.
     * </p>
     * <p>
     * Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only the available offerings matching the
     *        specified offering type.</p>
     *        <p>
     *        Valid Values: <code>"Light Utilization"|"Medium Utilization"|"Heavy Utilization"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *         retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesOfferingsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: ").append(getReservedCacheNodesOfferingId()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedCacheNodesOfferingsRequest == false)
            return false;
        DescribeReservedCacheNodesOfferingsRequest other = (DescribeReservedCacheNodesOfferingsRequest) obj;
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedCacheNodesOfferingsRequest clone() {
        return (DescribeReservedCacheNodesOfferingsRequest) super.clone();
    }

}
