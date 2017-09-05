package example

import shapeless.{:+:, CNil, Coproduct, Generic, Inl, Inr}

trait W[A]

object W {

  implicit def genericW[A, K <: Coproduct](
      implicit G: Generic.Aux[A, K]): W[A] = new W[A] {}
}
