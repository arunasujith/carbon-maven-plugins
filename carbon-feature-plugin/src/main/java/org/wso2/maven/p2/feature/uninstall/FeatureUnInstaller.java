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

import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.eclipse.tycho.p2.facade.internal.P2ApplicationLauncher;
import org.wso2.maven.p2.utils.P2ApplicationLaunchManager;

import java.util.List;

/**
 * FeatureUninstaller takes configuration data from FeatureUninstallMojo and perform the uninstall task.
 *
 * @since 2.0.0
 */
public class FeatureUnInstaller {

    private String destination;
    private String profile;
    private List<Feature> features;
    private MavenProject project;
    private P2ApplicationLauncher launcher;
    private int forkedProcessTimeoutInSeconds;

    private static final String PUBLISHER_APPLICATION = "org.eclipse.equinox.p2.director";

    /**
     * default constructor which is executed during object creation of this class.
     *
     * @throws MojoFailureException
     */
    public void uninstallFeatures() throws MojoFailureException {
        String iUs = getIUsToUninstall();
        uninstallFeatures(iUs);
    }

    /**
     * Analyze the given set of features and generate the string containing metadata about all the features to be
     * uninstalled.
     *
     * @return String representing metadata about the features to be uninstalled
     */
    private String getIUsToUninstall() {
        if (features == null) {
            return null;
        }
        StringBuilder uninstallUIs = new StringBuilder();

        for (Feature feature : features) {
            uninstallUIs.append(feature.getId().trim()).append("/").append(feature.getVersion().trim()).append(",");
        }
        return uninstallUIs.toString();
    }

    /**
     * uninstall the set of features given as a collection of IUs
     *
     * @param uninstallUIs comma separated list of IUs
     * @throws MojoFailureException
     */
    private void uninstallFeatures(String uninstallUIs) throws MojoFailureException {
        if (project != null) {
            P2ApplicationLaunchManager launcher = new P2ApplicationLaunchManager(this.launcher);
            launcher.setWorkingDirectory(project.getBasedir());
            launcher.setApplicationName(PUBLISHER_APPLICATION);
            launcher.addArgumentsToUnInstallFeatures(uninstallUIs, destination, profile);
            launcher.performAction(forkedProcessTimeoutInSeconds);
        }
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setProject(MavenProject project) {
        this.project = project;
    }

    public void setLauncher(P2ApplicationLauncher launcher) {
        this.launcher = launcher;
    }

    public void setForkedProcessTimeoutInSeconds(int forkedProcessTimeoutInSeconds) {
        this.forkedProcessTimeoutInSeconds = forkedProcessTimeoutInSeconds;
    }
}
