package com.github.mlangc.experiments

import java.util.UUID

/*
 * Try "Organize Imports here"...
 */
class ImportsRemovedFromLazyVals2 {
  lazy val test: UUID = ImportsFromLazyValsRemoved1.getUuid()
}
