hours, minutes = map(int, input().split())

if minutes >= 45:
    print(hours, minutes - 45)
else:
    if hours == 0:
        print(23, minutes + 15)
    else:
        print(hours - 1, minutes + 15)