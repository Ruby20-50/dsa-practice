## Apples and Oranges

**Problem:** Given the positions of an apple tree (`a`) and an orange tree (`b`), and the distances each fruit falls from its own tree along the x-axis (negative = left, positive = right), count how many apples and how many oranges land within Sam's house, defined by the inclusive range `[s, t]`.
[HackerRank link](https://www.hackerrank.com/challenges/apple-and-orange/problem)

**Approach:** For each fruit, add its fall distance to its tree's position to get its absolute landing point on the x-axis (`applesElementLandingPoint = distance + tree Position`). Then check whether that landing point falls within the inclusive range `[s, t]`. Do this separately for apples (using `a`) and oranges (using `b`), tallying a count for each. Print the two counts on separate lines.

**Difficulty:** easy

**Complexity:**
- Time: O(m + n), where m = number of apples and n = number of oranges — single pass through each list
- Space: O(1) additional space (excluding input storage)

**Languages:** Java, PHP, Python