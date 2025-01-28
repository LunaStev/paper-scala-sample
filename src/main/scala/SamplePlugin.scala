package io.github.lunastev.sample.plugin

import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    getLogger.info("Scala-based Paper plugin is enabled!")
  }

  override def onDisable(): Unit = {
    getLogger.info("Scala-based Paper plugin is disabled!")
  }
}
