gradle-scm-plugin
=================

Base SCM Plugin for gathering information and performing actions

Actions
-------

* Boolean switchToBranch() - Switch to branch, create if needed
* Boolean updateFromRepository() - Get latest changes from a remote repository.
* Boolean commit() - Commit changes. If this is a distributed SCM it should also push the changes to the remote.
* Boolean tag()- Tag a commit. If this is a distributed SCM it should also push the tag to the remote.
* Boolean preChanges() - Allow an SCM provider the chance to do any actions it needs to before another plugin edits a file. For many SCM providers this will be a no-op.
* Boolean undoChanges() - Undo all changes to the repository.

