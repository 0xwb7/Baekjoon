n = int(input())
str = input()
nl = []
for i in range(n):
    nl.append(int(str.split()[i]))

t = int(input())
cnt = 0

for i in nl:
    if i == t:
        cnt += 1

print(cnt)