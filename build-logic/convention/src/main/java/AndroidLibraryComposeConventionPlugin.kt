import com.android.build.gradle.LibraryExtension
import com.noxis.gradleplugins.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class AndroidComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {

            project.pluginManager.apply("com.android.library")
//            apply(plugin = "com.android.library")
//            apply(plugin = "org.jetbrains.kotlin.plugin.compose")

            extensions.configure<LibraryExtension> {
                configureAndroidCompose(this)
            }
        }
    }
}