gradle-scm-plugin
=================
[![Build Status](https://travis-ci.org/nebula-plugins/gradle-scm-plugin.svg?branch=master)](https://travis-ci.org/nebula-plugins/gradle-scm-plugin)
[![Coverage Status](https://coveralls.io/repos/nebula-plugins/gradle-scm-plugin/badge.svg?branch=masterservice=github)](https://coveralls.io/github/nebula-plugins/gradle-scm-plugin?branch=master)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/nebula-plugins/gradle-scm-plugin?utm_source=badgeutm_medium=badgeutm_campaign=pr-badge)
[![Apache 2.0](https://img.shields.io/github/license/nebula-plugins/gradle-scm-plugin.svg)](http://www.apache.org/licenses/LICENSE-2.0)


Base SCM Plugin for gathering information and performing actions

Actions
-------

* Boolean switchToBranch() - Switch to branch, create if needed
* Boolean updateFromRepository() - Get latest changes from a remote repository.
* Boolean commit() - Commit changes. If this is a distributed SCM it should also push the changes to the remote.
* Boolean tag()- Tag a commit. If this is a distributed SCM it should also push the tag to the remote.
* Boolean preChanges() - Allow an SCM provider the chance to do any actions it needs to before another plugin edits a file. For many SCM providers this will be a no-op.
* Boolean undoChanges() - Undo all changes to the repository.

