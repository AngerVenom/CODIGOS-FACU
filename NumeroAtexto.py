# ingreso : 120.93 = salida : Ciento veinte con 93/100

numero = float(input("Ingresa el valor: "))
intNum = int(numero) # Get integer
f = str(((numero*1e17 - intNum*1e17) / 1e17)) # Get decimal

#formato sin 0. (cuando el numero ingresado no contiene decimales)
if(f.startswith('0.')):
    f = f.replace('0.', '')

def NumToWords(intNum):
    words = ''
    
    unidades = ['','uno','dos','tres','cuatro','cinco','seis','siete','ocho','nueve',]

    decenas = ['','dieci','veinti','treinta y ','cuarenta y ','cincuenta y ','sesenta y ','setenta y ','ochenta y ','noventa y ']

    centenas = ('','ciento','doscientos','trescientos','cuatroscientos','quinientos','seiscientos','setecientos','ochocientos','novecientos')

    #Convert
    intNum = '0' * (3 - len(str(intNum))) + str(intNum)  #9 = 009  640 = 640

    #convertiendo cada digito
    unidad = int(intNum[-1]) # 9
    decena = int(intNum[-2]) # 7
    centena = int(intNum[-3]) # 3

    #mix     
    words = '{} {}{}'.format(centenas[centena], decenas[decena], unidades[unidad]).strip()

    # , 11 , 12 , 13 , 14  y 15
   
    words = words.replace('dieciuno', 'once') #11
    words = words.replace('diecidos', 'doce') #12
    words = words.replace('diecitres', 'trece') #13
    words = words.replace('diecicuatro', 'catorce') #14
    words = words.replace('diecicinco', 'quince') #15
    
    if(words.endswith('dieci')):
        words = words.replace('dieci', 'diez')
    if(words.endswith('veinti')):
        words = words.replace('veinti', 'veinte')
    elif(words.endswith(' y')):
        words = words[:-2]

    return words.capitalize()

#output
if(f.startswith('0')):
    #salida sin decimal
    print(NumToWords(intNum))
else:
    round(f)
    print(NumToWords(intNum), f"con {f}/100")
