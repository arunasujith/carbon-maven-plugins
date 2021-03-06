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

package org.wso2.maven.p2.repository;

import org.wso2.maven.p2.beans.CarbonArtifact;

/**
 * Bean class representing a Feature object provided as an input param to RepositoryGeneratorMojo
 */
public class Feature extends CarbonArtifact {
    private String id;

    /**
     * Returns the feature id represented by this feature.
     *
     * @return String feature id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the feture id represented by this feature.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }
}
