newCalc = "1"

while newCalc =="1":
    grades =[]

    while len(grades) != 2:
        grade = float(input())

        if grade <0 or grade >10:
            print("nota invalida")
            continue

        grades.append(grade)

    print(f"media = {(grades[0] + grades[1])/2 :.2f}")
    # print()
    while True:
        print("novo calculo (1-sim 2-nao)")
        newCalc = input()    
        if newCalc == '1' or newCalc =='2':
            break
