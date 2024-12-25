# Kotlin Mutable List Modification with map

This repository demonstrates a common pitfall in Kotlin when using the `map` function with mutable lists.  The `map` function, by default, returns a *new* list with the transformations applied.  It does *not* modify the original list in place.

The `bug.kt` file shows this behavior: a call to `map` on a mutable list does not modify the original list. To modify the original list, you must use `mapTo`, as shown in the corrected version.

## How to Reproduce
1. Clone the repository.
2. Compile and run `bug.kt`.
3. Observe that the original mutable list remains unchanged after the `map` operation.

## Solution
The `bugSolution.kt` file provides the corrected code, which uses `mapTo` to correctly modify the original mutable list.
