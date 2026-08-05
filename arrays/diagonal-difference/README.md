## Diagonal Difference

**Problem:** Given a square matrix, calculate the absolute difference between the sums of its primary diagonal (left-to-right) and secondary diagonal (right-to-left).
[HackerRank link](https://www.hackerrank.com/challenges/diagonal-difference/problem)

**Approach:** Iterate through the matrix with nested loops using row index `i` and column index `j`. Sum elements where `i == j` for the primary diagonal, and sum elements where `i + j == n - 1` for the secondary diagonal. Return the absolute value of the difference between the two sums.

**Difficulty:** easy

**Complexity:**
- Time: O(n²) — visits every element of the n×n matrix once
- Space: O(1) — only two accumulator variables are used beyond the input

**Languages:** Java, Python