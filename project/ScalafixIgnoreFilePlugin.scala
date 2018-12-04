/*
 * Copyright (C) 2018 Lightbend Inc. <https://www.lightbend.com>
 */
package akka

import sbt.plugins.JvmPlugin
import sbt.{AutoPlugin, PluginTrigger, Plugins}

object ScalafixIgnoreFilePlugin extends AutoPlugin with ScalafixIgnoreFileSupport {
  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = JvmPlugin
  import sbt._
  lazy val scalafixIgnoredSetting: Seq[Setting[_]] = Seq(
    ignore(Test)
  )

  override def projectSettings: Seq[Def.Setting[_]] = scalafixIgnoredSetting
}
