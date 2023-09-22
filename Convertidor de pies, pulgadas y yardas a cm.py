#Convertir pies, pulgadas y yardas a centimetros

num = int(input("\n 1: Pies a cm \n 2: Pulgadas a cm \n 3: Yardas a cm \nIngresa al convertidor que deseas ingresar: "))

def pies():
    pies = int(input("Pies: "))
    convert = pies * 30.48
    print(f"la conversion de {pies} pies a cm es de: {convert} cm")
def pulgadas():
    pulgadas = int(input("Pulgadas: "))
    convert = pulgadas * 2.54
    print(f"la conversion de {pulgadas} pulgadas a cm es de: {convert} cm")
def yardas():
    yardas = int(input("Yardas: "))
    convert = yardas * 91.44
    print(f"la conversion de {yardas} yardas a cm es de: {convert} cm")

if(num == 1):
    pies()
elif(num == 2):
    pulgadas()
elif(num == 3):
     yardas()
