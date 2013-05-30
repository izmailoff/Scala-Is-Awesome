package com.github.izmailoff.implicits

import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification
import org.specs2.matcher.DataTables
import com.github.izmailoff.implicits.BetweenImports._

@RunWith(classOf[JUnitRunner])
class BetweenSuite extends Specification with DataTables {
  
  "BETWEEN" should {
    "correctly work with various INT ranges" in {
      "value between" | "low and" | "high" | "is " |
      1               ! 0         ! 2      ! true  |
      -555            ! -987      ! -123   ! true  |
      321             ! 0         ! 100    ! false |
      321             ! 456       ! 888    ! false |
      7               ! 7         ! 7      ! true  |
      7               ! 7         ! 9      ! true  |
      7               ! 4         ! 7      ! true  |
      5               ! 9         ! 2      ! false |> {
      (value          ,  low      ,  high  , result) =>
        value between low and high must be equalTo result
      }
    }

    "correctly work with various CHAR ranges" in {
      "value between" | "low and" | "high" | "is " |
      'a'             ! 'a'       ! 'b'    ! true  |
      'a'             ! 'b'       ! 'c'    ! false |
      'f'             ! 'a'       ! 'z'    ! true  |
      'a'             ! 'a'       ! 'a'    ! true  |> {
      (value          ,  low      ,  high  , result) =>
        value between low and high must be equalTo result
      }
    }

    "correctly work with various STRING ranges" in {
      "value between" || "low and" || "high" || "is " |
      "abc"           !! "abc"     !! "bcda" !! true  |
      "abc"           !! "a"       !! "aaa"  !! false |
      "z"             !! "abc"     !! "z"    !! true  |
      "z"             !! "abc"     !! "za"   !! true  |
      "z"             !! "z"       !! "a"    !! false |> {
      (value          ,  low      ,  high  , result) =>
        value between low and high must be equalTo result
      }
    }

    "correctly work with various DOUBLE ranges" in {
      "value between" | "low and" | "high" | "is " |
      1.1             ! 0.2       ! 3.5    ! true  |
      5.9             ! 7.8       ! 9.6    ! false |
      9.8             ! 9.8       ! 10.2   ! true  |
      5.4             ! 2.3       ! 5.4    ! true  |> {
      (value          ,  low      ,  high  , result) =>
        value between low and high must be equalTo result
      }
    }

    // TODO: consider doing this or remove it:
//    "correctly work with various INT and DOUBLE ranges" in {
//      "value between" | "low and" | "high" | "is " |
//      1             ! 0       ! 3.5    ! true  |
//      5             ! 7       ! 9.6    ! false |
//      9             ! 9       ! 10.2   ! true  |
//      5             ! 2       ! 5.4    ! true  |> {
//      (value          ,  low      ,  high  , result) =>
//        value between low and high must be equalTo result
//      }
//    }
  }

}