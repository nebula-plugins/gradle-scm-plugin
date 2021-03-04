gradle-scm-plugin
=================

![Support Status](https://img.shields.io/badge/nebula-active-green.svg)
[![Gradle Plugin Portal](https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/com.netflix.nebula/gradle-scm-plugin/maven-metadata.xml.svg?label=gradlePluginPortal)](https://plugins.gradle.org/plugin/nebula.gradle-scm)
[![Maven Central](https://img.shields.io/maven-central/v/com.netflix.nebula/gradle-scm-plugin)](https://maven-badges.herokuapp.com/maven-central/com.netflix.nebula/gradle-scm-plugin)
![CI](https://github.com/nebula-plugins/gradle-scm-plugin/actions/workflows/ci.yml/badge.svg)
![Publish](https://github.com/nebula-plugins/gradle-scm-plugin/actions/workflows/publish.yml/badge.svg)
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

