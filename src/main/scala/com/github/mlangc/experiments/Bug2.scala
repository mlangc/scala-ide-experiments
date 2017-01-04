package com.github.mlangc.experiments

package outer {
  package inner {
    trait /*(*/TryRenameMe/*)*/
  }
}

import outer._

class Bug2 { this: inner.TryRenameMe =>
  
}