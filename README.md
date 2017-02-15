# TeamCity-plugin-buildEventsSample

Basic TeamCity plugin to log build events

Build
 Issue 'mvn package' command from the root project to build your plugin. Resulting package <artifactId>.zip will be placed in 'target' directory. 
 
Install
 To install the plugin, put zip archive into <TeamCity Data Directory>/plugins directory and restart the server.
 Place plugin-buildEvents-logConfig.xml into <TeamCity Data Directory>/config/_logging
 
Use
 Select "plugin-buildEvents-logConfig" logging preset under TeamCity server Administration / Diagnostics. Check logs/teamcity-buildEvents.log TeamCity server log.