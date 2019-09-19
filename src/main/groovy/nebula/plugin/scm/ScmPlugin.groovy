/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nebula.plugin.scm

import groovy.transform.CompileDynamic
import nebula.plugin.scm.providers.ScmFactory
import org.gradle.api.Plugin
import org.gradle.api.Project

class ScmPlugin implements Plugin<Project> {
    static final String FACTORY_NAME = 'scmFactory'

    @CompileDynamic
    @Override
    void apply(Project project) {
        if (!project.rootProject.ext.has(FACTORY_NAME)) {
            project.rootProject.ext.set(FACTORY_NAME, new ScmFactory())    
        }
    }
}
