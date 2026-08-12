#
# Complete the 'countApplesAndOranges' function below.
#
# The function accepts following parameters:
#  1. INTEGER s
#  2. INTEGER t
#  3. INTEGER a
#  4. INTEGER b
#  5. INTEGER_ARRAY apples
#  6. INTEGER_ARRAY oranges
#

def countApplesAndOranges(s, t, a, b, apples, oranges):
    a_count = 0
    o_count = 0
    for m in apples:
        m += a
        if m >= s and m <= t:
            a_count += 1
    for n in oranges:
        n += b
        if n >= s and n <= t:
            o_count += 1
    print(a_count)
    print(o_count)
