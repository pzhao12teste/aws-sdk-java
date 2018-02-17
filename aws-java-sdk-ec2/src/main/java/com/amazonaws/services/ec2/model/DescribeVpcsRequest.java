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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpcsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeVpcsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the
     * VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits
     * (for example, <code>/28</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated with
     * the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block associated
     * with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource. Specify
     * the key of the tag in the filter name and the value of the tag in the filter value. For example, for the tag
     * Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcIds;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the
     * VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits
     * (for example, <code>/28</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated with
     * the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block associated
     * with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource. Specify
     * the key of the tag in the filter name and the value of the tag in the filter value. For example, for the tag
     * Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match
     *         the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one
     *         or two digits (for example, <code>/28</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated
     *         with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block
     *         associated with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *         Specify the key of the tag in the filter name and the value of the tag in the filter value. For example,
     *         for the tag Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the
     *         filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's
     *         value is), and the tag value X (regardless of what the tag's key is). If you want to list only resources
     *         where Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-key</code> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the
     * VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits
     * (for example, <code>/28</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated with
     * the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block associated
     * with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource. Specify
     * the key of the tag in the filter name and the value of the tag in the filter value. For example, for the tag
     * Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match
     *        the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or
     *        two digits (for example, <code>/28</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated
     *        with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block
     *        associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        Specify the key of the tag in the filter name and the value of the tag in the filter value. For example,
     *        for the tag Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the
     *        filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the
     * VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits
     * (for example, <code>/28</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated with
     * the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block associated
     * with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource. Specify
     * the key of the tag in the filter name and the value of the tag in the filter value. For example, for the tag
     * Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match
     *        the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or
     *        two digits (for example, <code>/28</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated
     *        with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block
     *        associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        Specify the key of the tag in the filter name and the value of the tag in the filter value. For example,
     *        for the tag Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the
     *        filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the
     * VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits
     * (for example, <code>/28</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated with
     * the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block associated
     * with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource. Specify
     * the key of the tag in the filter name and the value of the tag in the filter value. For example, for the tag
     * Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>cidr</code> - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match
     *        the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or
     *        two digits (for example, <code>/28</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.cidr-block</code> - An IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.association-id</code> - The association ID for an IPv4 CIDR block associated
     *        with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cidr-block-association.state</code> - The state of an IPv4 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dhcp-options-id</code> - The ID of a set of DHCP options.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.ipv6-cidr-block</code> - An IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.association-id</code> - The association ID for an IPv6 CIDR block
     *        associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-cidr-block-association.state</code> - The state of an IPv6 CIDR block associated with the VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>isDefault</code> - Indicates whether the VPC is the default VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the VPC (<code>pending</code> | <code>available</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        Specify the key of the tag in the filter name and the value of the tag in the filter value. For example,
     *        for the tag Purpose=X, specify <code>tag:Purpose</code> for the filter name and <code>X</code> for the
     *        filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @return One or more VPC IDs.</p>
     *         <p>
     *         Default: Describes all your VPCs.
     */

    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
            vpcIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcIds;
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     */

    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }

        this.vpcIds = new com.amazonaws.internal.SdkInternalList<String>(vpcIds);
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcIds(java.util.Collection)} or {@link #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcsRequest withVpcIds(String... vpcIds) {
        if (this.vpcIds == null) {
            setVpcIds(new com.amazonaws.internal.SdkInternalList<String>(vpcIds.length));
        }
        for (String ele : vpcIds) {
            this.vpcIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC IDs.
     * </p>
     * <p>
     * Default: Describes all your VPCs.
     * </p>
     * 
     * @param vpcIds
     *        One or more VPC IDs.</p>
     *        <p>
     *        Default: Describes all your VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcsRequest withVpcIds(java.util.Collection<String> vpcIds) {
        setVpcIds(vpcIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcsRequest> getDryRunRequest() {
        Request<DescribeVpcsRequest> request = new DescribeVpcsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getVpcIds() != null)
            sb.append("VpcIds: ").append(getVpcIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcsRequest == false)
            return false;
        DescribeVpcsRequest other = (DescribeVpcsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVpcIds() == null ^ this.getVpcIds() == null)
            return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcsRequest clone() {
        return (DescribeVpcsRequest) super.clone();
    }
}
