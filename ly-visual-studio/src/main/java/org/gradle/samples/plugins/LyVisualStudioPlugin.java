package org.gradle.samples.plugins;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.AppliedPlugin;
import org.gradle.ide.visualstudio.VisualStudioRootExtension;
import org.gradle.api.model.ObjectFactory;

public class LyVisualStudioPlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    project.getPluginManager().withPlugin("visual-studio",  new Action<AppliedPlugin>() {
      @Override
      public void execute(AppliedPlugin appliedPlugin) {
        Configuration configuration = createElementsConfiguration(project.getConfigurations(), project.getObjects());

        VisualStudioRootExtension library = project.getExtensions().getByType(VisualStudioRootExtension.class);

        configure();
      }
    });

  }

  private static Configuration createElementsConfiguration(ConfigurationContainer configurations, ObjectFactory objectFactory) {
    return configurations.create("lyVisualStudioConfig", new Action<Configuration>() {
      @Override
      public void execute(Configuration configuration) {
        configurations.all(new Action<Configuration>() {
          @Override
          public void execute(Configuration it) {

          }
        });
      }
    });
  }


  public void configure() {

  }


}
