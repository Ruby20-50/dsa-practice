import math 

def getTotalX(a, b):
    # Write your code here
    l = 1
    for x in a:
        l = math.lcm(l,x)
    g = 0
    for x in b :
        g = math.gcd(g,x)
    count = 0
    for x in range(l,g+1,l):
        if g % x == 0 :
            count += 1
    return count 