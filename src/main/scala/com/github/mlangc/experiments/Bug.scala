package com.github.mlangc.experiments

object Bug {
  def main(args: Array[String]): Unit = {
    sealed trait Step {
      def back: Step = this match {
        case StepDown => StepBack(0)
        case StepBack(level) => StepBack(level + 1)
      }

      def targetSize(originalSize: Int): Int = this match {
        case StepDown => originalSize/2
        case StepBack(level) =>
          val baseLevel = {
            if (level == 0) StepDown.targetSize(originalSize)
            else StepBack(level-1).targetSize(originalSize)
          }

          val gap = (originalSize - baseLevel)
          baseLevel + gap/2
      }

      def isExhausted(originalSize: Int): Boolean = {
        targetSize(originalSize) == originalSize - 1
      }
    }

    case object StepDown extends Step
    case class StepBack(level: Int) extends Step

    println(StepDown.back)
  }
}
