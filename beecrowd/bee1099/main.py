lines = int(input())

for i in range(lines):
    inputs = input().split(" ")
    first = int(inputs[0])
    second = int(inputs[1])

    sumOfOdds = 0

    if first < second:
        first = first +second
        second = first - second
        first = first -second

    # print(f"{first} {second}")

    for j in range(second+1, first):
        if j%2 ==1:
            sumOfOdds += j

    print(sumOfOdds)
