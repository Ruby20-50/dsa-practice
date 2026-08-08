## Mini-Max Sum

**Problem:** Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Print the two values as a single line of two space-separated long integers.
[HackerRank link](https://www.hackerrank.com/challenges/mini-max-sum/problem)

**Approach:** Traverse the array once, computing the total sum along with the minimum and maximum elements. The minimum possible sum of four excludes the largest element (`total - max`); the maximum possible sum of four excludes the smallest element (`total - min`).

**Difficulty:** easy

**Complexity:**
- Time: O(n)
- Space: O(1)

**Languages:** Java, Python, PHP