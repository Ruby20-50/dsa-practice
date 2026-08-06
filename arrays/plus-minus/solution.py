
def plusMinus(arr):
    # Write your code here
    positive=0
    negative=0
    zero=0
    for i in range(len(arr)):
        if arr[i] > 0:
            positive += 1
        elif arr[i] < 0:
            negative += 1
        else:
            zero += 1
    positive /= len(arr)
    negative /= len(arr)
    zero /= len(arr)
    print(f"{positive:.6f}\n{negative:.6f}\n{zero:.6f}")
