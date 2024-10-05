i = 0 
j = 1
tmp = 0

while(i<=2):
    for x in range(3):
        print(f"I={(i)} J={(j + x)}")

    tmp += 1
    i = .2 * tmp
    j = 1 + i

