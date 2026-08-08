def miniMaxSum(arr):
   total = sum(arr)
   minimum = min(arr)
   maximum = max(arr)
   print(f"{total - maximum} {total - minimum}")
