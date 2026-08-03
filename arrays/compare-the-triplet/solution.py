def compareTriplets(a: list[int] , b: list[int]):
    a_score = 0
    b_score = 0
    for i in range(len(a)):
        if a[i] > b[i]:
            a_score += 1
        if a[i] < b[i]:
            b_score += 1
        
    result = [a_score, b_score]
    return result 