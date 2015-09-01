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
package nebula.plugin.scm.providers

/**
 * The actions an SCM provider would need to support
 */
abstract class ScmProvider {
    /**
     * Switch to and create branch if necessary
     */
    abstract Boolean switchToBranch(String branch)

    /**
     * Get latest changes from a remote repository.
     */
    abstract Boolean updateFromRepository()

    /**
     * Commit changes. If this is a distributed SCM it should also push the changes to the remote.
     */
    Boolean commit(String message, String... filenames) {
        commit(message, filenames as List)
    }

    /**
     * Commit changes. If this is a distributed SCM it should also push the changes to the remote.
     */
    abstract Boolean commit(String message, List<String> files)

    /**
     * Tag a commit. If this is a distributed SCM it should also push the tag to the remote.
     */
    abstract Boolean tag(String tagname, String message = null)

    /**
     * Allow an SCM provider the chance to do any actions it needs to before another plugin edits a file.
     * For many SCM providers this will be a no-op.
     */
    Boolean preChanges(String... filenames) {
        preChanges(filenames as List)
    }

    /**
     * Tell if there are outstanding changes to the repository.
     */
    Boolean hasChanges() {
        // Assume we have changes unless underlying provider can say otherwise.
        return true;
    }

    /**
     * Allow an SCM provider the chance to do any actions it needs to before another plugin edits a file.
     * For many SCM providers this will be a no-op.
     */
    abstract Boolean preChanges(List<String> files)

    /**
     * Undo all changes to the repository.
     */
    abstract Boolean undoChanges()    
}
