# Inconsistent Behavior of Mutable Collections During Iteration and Removal in Kotlin

This repository demonstrates an inconsistency in Kotlin's handling of mutable collections when removing elements during iteration.  Specifically, `removeIf()` works correctly with `MutableList` and `MutableSet`, but directly removing elements within a standard `for` loop results in a `ConcurrentModificationException`.

The `bug.kt` file shows the problematic code, highlighting the different behavior between `removeIf()` and manual removal in a `for` loop.  The `bugSolution.kt` file provides a corrected approach using iterators or creating a new list for safe removal.

This inconsistency can be easily overlooked and lead to runtime exceptions.  This example serves as a cautionary note to developers working with mutable collections in Kotlin.