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

import nebula.plugin.scm.providers.NoOpScmProvider
import nebula.plugin.scm.providers.ScmProvider
import nebula.test.PluginProjectSpec

class ScmPluginSpec extends PluginProjectSpec {
    String pluginName = 'com.netflix.nebula.gradle-scm'

    def 'no op provider is created'() {
        project.apply plugin: pluginName

        when:
        def provider = project.scmFactory.create()

        then:
        noExceptionThrown()
        provider instanceof NoOpScmProvider
        provider instanceof ScmProvider
    }
}
