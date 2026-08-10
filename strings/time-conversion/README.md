## Time Conversion

**Problem:** Given a time in 12-hour AM/PM format, convert it to military (24-hour) time. Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock, and 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
[HackerRank link](https://www.hackerrank.com/challenges/time-conversion)

**Approach:** Extract the hour (first 2 chars), the rest of the time string (:mm:ss), and the AM/PM marker (first char). Apply the conversion rules (PM and hour ≠ 12 → add 12; AM and hour == 12 → set hour to 0), then zero-pad the hour back to 2 digits and concatenate with the rest of the time.

**Difficulty:** easy

**Complexity:**
- Time: O(1) — input length is fixed (9 characters)
- Space: O(1) — fixed-size output string

**Languages:** Java, Python, PHP