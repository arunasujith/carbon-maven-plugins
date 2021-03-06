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

package org.wso2.maven.p2.feature.install;

import org.apache.maven.plugin.logging.Log;
import org.apache.maven.project.MavenProject;
import org.eclipse.tycho.p2.facade.internal.P2ApplicationLauncher;

import java.net.URL;
import java.util.List;

/**
 * Bean class containing all the parameters entered to the mojo through plugin configuration.
 *
 * The purpose of this class is to make any configuration property accessible from any class by simply passing this
 * bean as a parameter.
 *
 * @since 2.0.0
 */
public class FeatureInstallResourceBundle {

    private String destination;
    private String profile;
    private URL repository;
    private List<Feature> features;
    private boolean deleteOldProfileFiles;
    private MavenProject project;
    private P2ApplicationLauncher launcher;
    private int forkedProcessTimeoutInSeconds;
    private Log log;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public URL getRepository() {
        return repository;
    }

    public void setRepository(URL repository) {
        this.repository = repository;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public boolean isDeleteOldProfileFiles() {
        return deleteOldProfileFiles;
    }

    public void setDeleteOldProfileFiles(boolean deleteOldProfileFiles) {
        this.deleteOldProfileFiles = deleteOldProfileFiles;
    }

    public MavenProject getProject() {
        return project;
    }

    public void setProject(MavenProject project) {
        this.project = project;
    }

    public P2ApplicationLauncher getLauncher() {
        return launcher;
    }

    public void setLauncher(P2ApplicationLauncher launcher) {
        this.launcher = launcher;
    }

    public int getForkedProcessTimeoutInSeconds() {
        return forkedProcessTimeoutInSeconds;
    }

    public void setForkedProcessTimeoutInSeconds(int forkedProcessTimeoutInSeconds) {
        this.forkedProcessTimeoutInSeconds = forkedProcessTimeoutInSeconds;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }
}
