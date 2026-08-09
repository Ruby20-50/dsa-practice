def birthdayCakeCandles(candles):
    tllst_cndl = 0
    count = 1
    for n in candles:
        if tllst_cndl == n:
            count += 1
        elif tllst_cndl < n:
            count = 1
        tllst_cndl = max(tllst_cndl, n)
        
    return count

## alternative solution using built-in functions
def birthdayCakeCandles_alt(candles):
    return candles.count(max(candles))