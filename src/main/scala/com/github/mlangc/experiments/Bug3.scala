package com.github.mlangc.experiments

package outer {
  package /*(*/tryRenameMe/*)*/ {
    trait I
  }
}

import outer._

class Bug3 { this: tryRenameMe.I =>
  
}