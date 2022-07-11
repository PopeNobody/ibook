package com.github.popenobody.ibook.services

import com.intellij.openapi.project.Project
import com.github.popenobody.ibook.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
