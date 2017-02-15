package jetbrains.teamcity.plugins.buildEventsSample;

import com.intellij.openapi.diagnostic.Logger;
import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.BuildServerListener;
import jetbrains.buildServer.serverSide.SRunningBuild;
import jetbrains.buildServer.serverSide.impl.LogUtil;
import jetbrains.buildServer.util.EventDispatcher;
import org.jetbrains.annotations.NotNull;

/**
 * @author Yegor.Yarko
 *         Date: 15/02/2017
 */
public class BuildEventsListener extends BuildServerAdapter {
  private static Logger LOG = Logger.getInstance(BuildEventsListener.class.getName());

  public BuildEventsListener(@NotNull EventDispatcher<BuildServerListener> dispatcher) {
    dispatcher.addListener(this);
  }

  @Override
  public void buildFinished(@NotNull final SRunningBuild build) {
    LOG.info("Build finished: " + LogUtil.describeInDetail(build.getBuildPromotion().getAssociatedBuild()));
  }
}
