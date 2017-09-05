package example

import types._

object Test {
  implicitly[W[Foo]] // this invocation triggers the knownDirectSubclasses error
}
