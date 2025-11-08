totalPrice = int(input())
n = int(input())
sumPrice = 0

for i in range(n):
    price, count = map(int, input().split())
    sumPrice += price * count

if totalPrice == sumPrice:
    print("Yes")
else:
    print("No")