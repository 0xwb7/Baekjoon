hours, minutes = map(int, input().split())
cookingTime = int(input())
minutes += cookingTime
hours += minutes // 60
minutes %= 60

if hours >= 24:
    print(hours - 24, minutes)
else:
    print(hours, minutes)