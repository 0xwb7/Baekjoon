n = int(input())
nl = list(map(int, input().split()))
cnt = 0
t = int(input())

for i in nl:
    if i == t:
        cnt += 1
        
print(cnt)