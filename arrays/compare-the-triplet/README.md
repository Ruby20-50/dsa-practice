## Problem name

**Problem:** The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to calculate their comparison points by comparing each category:

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.

[HackerRank link](https://www.hackerrank.com/challenges/compare-the-triplets/problem)

**Approach:** Iterate through both triplets index by index, comparing a[i] and b[i]. Increment Alice's score if a[i] is greater, Bob's score if a[i] is smaller; ties are skipped. Return both scores together as the result.
**Difficulty:** easy

**Complexity:**
- Time:O(n), where n is the length of the triplets (fixed at 3, so effectively O(1))
- Space: O(1) — only two counters and a fixed 2-element result array are used, no extra space that scales with input


**Languages:** Java, Python