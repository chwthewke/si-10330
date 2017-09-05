package example

object types {
  // Interestingly, removing the `types` object and putting Foo, Bar, Baz at the top-level would fix the error

  sealed trait Foo
  case object Bar extends Foo
  case object Baz extends Foo

  implicitly[W[Foo]] // this invocation DOES NOT trigger the knownDirectSubclasses error (see Test.scala)
}
