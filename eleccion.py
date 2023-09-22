#Candidatos
candidatos = [1, 2 , 3 , 4 ,5]
#Contador
cont = [0]*len(candidatos) # 1, 2 ,3 ,4 ,5
#Voto
voto = int(input("Ingrese el numero de candidato por el que desea votar: "))
#Salida del programa voto 0
while voto!= 0:
    if voto in candidatos:
        position = candidatos.index(voto)
        cont[position] +=1 #Contando voto
    else: 
        print("El voto ingresado no es valido.")
    #Voto
    voto = int(input("Ingrese el numero de candidato por el que desea votar: "))
#Conteo
votoC1 = cont[0] #cuenta los votos de la posicion 0 que en este caso es el candidato 1
votoC2 = cont[1] 
votoC3 = cont[2] 
votoC4 = cont[3] 
votoC5 = cont[4] 

print(f"Los votos que obtuvo el candidato 1 son: {votoC1} ")
print(f"Los votos que obtuvo el candidato 2 son: {votoC2} ")
print(f"Los votos que obtuvo el candidato 3 son: {votoC3} ")
print(f"Los votos que obtuvo el candidato 4 son: {votoC4} ")
print(f"Los votos que obtuvo el candidato 5 son: {votoC5} ")
"""# Cantidad de votos 
cantVoto = sum(cont)
# ganador
MaxVoto = max(cont)""" 
