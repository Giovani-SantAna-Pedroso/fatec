while True:
    [first, second] = input().split(" ")

    if first == second:
        break

    first = int(first)
    second = int(second)

    if first > second:
        print("Decrescente")
        continue

    print("Crescente")

