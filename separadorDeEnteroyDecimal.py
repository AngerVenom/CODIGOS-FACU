x = float(input("Ingresa el valor: "))

# Divide a number (x) into integer and fraction
i = int(x) # Get integer
f = str((x*1e17 - i*1e17) / 1e17) # Get decimal

print(f"El valor fue {i} y su decimal es {f}")
