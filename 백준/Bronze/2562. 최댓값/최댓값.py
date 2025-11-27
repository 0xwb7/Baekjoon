nl = []
for i in range(9):
    nl.append(int(input()))

maxNum = max(nl)

for i in range(len(nl)):
    if nl[i] == maxNum:
        print(maxNum)
        print(i + 1)

        