n, m = map(int, input().split())
nl = []
for i in range(n):
    nl.append(i + 1)

for l in range(m):
    i, j = map(int, input().split())
    i -= 1
    j -= 1
    
    temp = nl[i]
    nl[i] = nl[j]
    nl[j] = temp
     
print(*nl)