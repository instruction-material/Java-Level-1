# Java foundations build 16: largest adjacent gap

Course: Java Level 1
Module: Java foundations build 16

Complete a List-processing method that finds the largest increase between neighboring values. The project reinforces index-based loops, reading adjacent elements, tracking a best-so-far value, and returning a safe result when there is not enough data to compare.

Requirements:
- Implement `computeScore(List<Integer> values)`.
- Compare each value with the value immediately before it.
- Track the largest positive adjacent difference.
- Return `0` when the list has fewer than two values or when no positive increase appears.
- Verify the default case by hand: gaps are `3`, `3`, and `5`, so the result is `5`.

Quick run hint: `javac Main.java && java Main`
