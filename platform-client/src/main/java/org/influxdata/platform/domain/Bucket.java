/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.platform.domain;

import java.util.ArrayList;
import java.util.List;

import com.squareup.moshi.Json;

/**
 * Bucket is a bucket.
 *
 * @author Jakub Bednar (bednar@github) (13/09/2018 09:21)
 */
public final class Bucket extends AbstractHasLinks {

    private String id;
    private String name;

    @Json(name = "organizationID")
    private String orgID;

    @Json(name = "organization")
    private String organizationName;

    /**
     * For support V1 sources.
     */
    @Json(name = "rp")
    private String retentionPolicyName;

    /**
     * The retention rules.
     */
    private List<RetentionRule> retentionRules = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(final String orgID) {
        this.orgID = orgID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(final String organizationName) {
        this.organizationName = organizationName;
    }

    public String getRetentionPolicyName() {
        return retentionPolicyName;
    }

    public void setRetentionPolicyName(final String retentionPolicyName) {
        this.retentionPolicyName = retentionPolicyName;
    }

    public List<RetentionRule> getRetentionRules() {
        return retentionRules;
    }

    public void setRetentionRules(final List<RetentionRule> retentionRules) {
        this.retentionRules = retentionRules;
    }
}