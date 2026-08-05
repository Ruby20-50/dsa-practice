def diagonalDifference(arr):
    prim_diag= 0
    sec_diag=0
    for n in range(len(arr)):
        for m in range(len(arr)):
            if m == n:
              prim_diag += arr[n][m]
            if m+n == len(arr) -1:
                sec_diag += arr[n][m]
    return abs(prim_diag - sec_diag)  
