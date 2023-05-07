/*
 * Copyright © 2022-2023, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
rootProject.name = "rui-example"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "hu.simplexion.rui") {
                useModule("hu.simplexion.rui:rui-gradle-plugin:0.1.0")
            }
        }
    }
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}