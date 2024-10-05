lines = int(input())

coelhos = 0
sapos = 0
ratos = 0

for i in range(lines):
    data = input().split(" ")
    numberOfSubjects =  int(data[0])

    if data[1] == "C":
        coelhos += numberOfSubjects
    if data[1] == "S":
        sapos += numberOfSubjects
    if data[1] == "R":
        ratos += numberOfSubjects

totalCobaias = coelhos + ratos +sapos

print(f"Total: {totalCobaias} cobaias")
print(f"Total de coelhos: {coelhos}")
print(f"Total de ratos: {ratos}")
print(f"Total de sapos: {sapos}")
print(f"Percentual de coelhos: {(coelhos/totalCobaias)* 100 :.2f} %")
print(f"Percentual de ratos: {(ratos/totalCobaias)* 100 :.2f} %")
print(f"Percentual de sapos: {(sapos/totalCobaias)* 100 :.2f} %")
