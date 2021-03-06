/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.maven.p2.feature.uninstall;

/**
 * Bean class representing a Feature object provided as an input param to FeatureGenMojo
 */
public class Feature {
    private String id;
    private String version;

    /**
     * Gets the id of the feature to be uninstalled.
     *
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the feature to be uninstalled.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the version of the feature to be uninstalled.
     *
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version of the feature to be uninstalled.
     *
     * @param version String
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
