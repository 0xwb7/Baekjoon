n, m = map(int, input().split())
nl = []
for i in range(n):
    nl.append(0)

for l in range(m):
    i, j, k = map(int, input().split())
    i -= 1
    j -= 1
    
    for o in range(i, j + 1, 1):
        nl[o] = k
print(*nl)