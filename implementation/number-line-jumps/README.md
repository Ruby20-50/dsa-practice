## Number Line Jumps

**Problem:** Given two kangaroos on a number line ready to jump in the positive direction. 
- The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
- The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
Determine whether both kangaroos meet at the same location at the same time as part of the show.

[HackerRank link](https://www.hackerrank.com/challenges/kangaroo/problem)

**Approach:** the equation n = (x2 - x1) / (v1 - v2) determines if the two Kangaroos meet at a point only if n is **a non-negative whole number**
in order to avoid runtime error the denominator (v1 - v2) should be checked first if it equals zero 
if so, there are two cases arise out of this case:
- one when the kangaroos start at the same point then YES they have met. 
- two when the kangaroos start at different points then NO they will never meet. 
**Difficulty:** easy

**Complexity:**
- Time: O(1)
- Space: O(1)

**Languages:** Java, Python, PHP