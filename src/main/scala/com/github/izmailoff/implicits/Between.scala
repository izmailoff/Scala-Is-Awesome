package com.github.izmailoff.implicits

/**
 * Provides syntax sugar for testing if a variable is in a closed interval.
 * Sample use:
 * {{{
 * import BetweenImplicits._
 * 1 between 0 and 5 == true
 * }}}
 */
class Between[T <% Ordered[T]](val value: Option[T]) {

  def between(low: T) =
    if (value.get >= low)
      new Between(value)
    else
      new Between(None: Option[T])

  def and(high: T) = value match {
    case Some(v) => v <= high
    case None => false
  }
}

/**
 * Single import for use of implicit 'between'.
 * See [[com.github.izmailoff.implicits.Between]] for more information.
 */
object BetweenImports {
  type Between[T] = com.github.izmailoff.implicits.Between[T]

  implicit def int2Between[T <% Ordered[T]](someValue: T): Between[T] = new Between(Some(someValue))
}

