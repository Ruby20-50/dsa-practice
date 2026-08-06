---README Template---

## Plus Minus

**Problem:** Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each ratio, with 6 digits after the decimal.
[HackerRank link](https://www.hackerrank.com/challenges/plus-minus/problem)

**Approach:** Iterate through the array once, using counters to tally how many elements are positive, negative, and zero. Divide each counter by the array's total length to get the ratio, then print each with 6 decimal places using fixed-point formatting.

**Difficulty:** easy

**Complexity:**
- Time: O(n) — a single pass through the array
- Space: O(1) — only a constant number of counters used, regardless of input size

**Languages:** Java, Python