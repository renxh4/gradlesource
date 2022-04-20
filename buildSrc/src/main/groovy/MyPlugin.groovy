import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
       AppExtension appExtension  =  project.getExtensions().getByName("android")
        appExtension.defaultConfig.buildConfigField("String","sa","ss")

        appExtension.getDefaultConfig().addBuildConfigField()
    }
}