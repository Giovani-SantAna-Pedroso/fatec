amout_of_operations = int(input())

while amout_of_operations != 0:
    amout_of_operations -=1
    nums = [int(x) for x in input().split(" ")]

    if nums[1] == 0:
        print("divisao impossivel")
        continue

    print(f"{nums[0]/nums[1]}")
