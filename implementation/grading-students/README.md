## Grading Students

**Problem:** Given a list of student grades, round each grade up to the nearest multiple of 5 if the grade is at least 38 (passing) and the difference to the next multiple of 5 is less than 3. Grades below 38 or already at a safe distance from the next multiple of 5 are left unchanged.
[HackerRank link](https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true)

**Approach:** For each grade, check two conditions: (1) the grade must be a passing grade (> 37), and (2) its remainder when divided by 5 must be >= 3. If both hold, round up to the next multiple of 5 using ((grade + 5) / floor_div 5) * 5; otherwise leave the grade as-is. Each language needs the correct integer (floor) division operator — Java's / on ints does this natively, Python needs //, and PHP needs intdiv().

**Difficulty:** easy

**Complexity:**

Time: O(n) — single pass over the grades list
Space: O(n) — one output list of the same size as the input

**Languages:** Java, Python, PHP