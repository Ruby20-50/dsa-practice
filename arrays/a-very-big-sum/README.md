## A Very Big Sum

**Problem:** Given an array of integers, calculate the sum of its elements. Note that some elements may be quite large, so the sum can exceed the range of a standard 32-bit integer — hence the "very big" in the name.

[HackerRank link](https://www.hackerrank.com/challenges/a-very-big-sum/problem)

**Approach:** Iterate through the array once, accumulating each element into a running total, then return the total. The key detail is using a data type wide enough to hold the sum (e.g. `long` in Java) since individual elements can be up to 10^9 and the array can have up to 10 elements, making the sum exceed the range of a 32-bit `int`. Python doesn't need this consideration since its integers have arbitrary precision.

**Difficulty:** easy

**Complexity:**
- Time: O(n) — one pass through the array
- Space: O(1) — only a single accumulator variable is used

**Languages:** Java, Python