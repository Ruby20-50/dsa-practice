## Birthday Cake Candles

**Problem:** You are in charge of the cake for a child's birthday. It will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Given the heights of all the candles, count how many candles are the tallest.

[HackerRank link](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)

**Approach:** Traverse the array once while tracking the height of the tallest candle seen so far. On each element, compare it to the running max:
- if it's **greater**, a new tallest height has been found — reset the count to `1`.
- if it's **equal**, it ties the current tallest — increment the count.


**Difficulty:** easy

**Complexity:**
- Time: O(n)
- Space: O(1)

**Languages:** Java, Python, PHP