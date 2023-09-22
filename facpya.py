# Importa la libreria que permite trabajar con expresiones regulares
import re
# Declara las variables a utilizar, con el tipo correcto.

peso = ""
patron = "999.99|"
# Inicia un ciclo infinito, para preguntar los kilogramos de peso de la persona.
while True:
  # Pregunta el dato (str)
  peso = str(input("Ingresa tu peso en kilogramos: "))
  # Valida que no se omita. Si no se cumple, vuelve a preguntar, despues 
  # de enviar el mensaje de error especifico.
  if(peso == ""):
    print("El peso es obligatorio :)")
    peso = str(input("Ingresa tu peso en kilogramos: "))
  # Valida que tenga un patron 999.99. Si no cumple, vuelve a preguntar,
  # despues de enviar el mensaje de error especifico.
  pattern = re.match(patron, peso, flags=0)
  if(pattern == None):
    print("El patron no coincide.")
    peso = str(input("Ingresa tu peso en kilogramos: "))
  # Si el dato cumple con el patron, convierte el valor a su equivalente
  # flotante, y guardalo en una variable.
  if(pattern != None):
    flt = float(peso)
    #print(flt)
  # Valida que el valor convertido esta entre 0 y 150. Si no cumple, vuelve
  # a preguntar, despues de enviar el mensaje de error especifico.
    if flt >= 0 and flt <= 150:
  # Si todo esta bien, sal del ciclo infinito.
      break
# Realiza el calculo de litros correspondientes al peso, y guarda el resultado}
# en una variable.
ml = 35 * flt
litros = ml / 1000 
# Informa el resultado, usando F-String
print(f"La cantidad de litros que debes ingerir al dia es de: {litros} lt")

