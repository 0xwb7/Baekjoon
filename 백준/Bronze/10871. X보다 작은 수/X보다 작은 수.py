n, t = map(int, input().split())
nl = list(map(int, input().split()))
numList = []

for i in nl:
    if i < t:
        numList.append(i)

for i in numList:
    print(i, end = ' ')
