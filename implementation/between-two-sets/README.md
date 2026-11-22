## Between Two Sets

**Problem:** Given two arrays of integers `a` and `b`, count how many integers `x` satisfy both conditions: every element of `a` is a factor of `x`, and `x` is a factor of every element of `b`. Such numbers are "between the two arrays". Return how many exist (`getTotalX`).
[HackerRank link](https://www.hackerrank.com/challenges/between-two-sets/problem)

**Approach:** The first condition means `x` is a multiple of every element of `a`, which holds exactly when `x` is a multiple of `L = lcm(a)`. The second condition means `x` divides every element of `b`, which holds exactly when `x` divides `G = gcd(b)`. Compute `L` and `G`, then step through the multiples of `L` up to `G` (`x = L, 2L, 3L, ...`) and count each `x` where `G % x == 0`. If `L > G`, the answer is 0. Example: `a = [2, 4]`, `b = [16, 32, 96]` gives `L = 4`, `G = 16`, and the valid numbers are 4, 8 and 16, so the output is 3.

**Difficulty:** easy

**Complexity:**
- Time: O(n + m) gcd/lcm computations (each O(log max)), plus at most G / L loop iterations to count the candidates, where n = size of `a` and m = size of `b`
- Space: O(1) additional space (excluding input storage)

**Languages:** Java, Python