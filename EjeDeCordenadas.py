num = int(input("Ingresa el número: "));

if((num > 0) and(num < 90)):
   print("primer cuadrante");
elif((num > 90) and (num < 180)):
   print("segundo cuadrante");
elif((num > 180) and (num < 270)):
   print("tercer cuadrante");
elif((num > 270) and (num < 360)):
   print("cuarto cuadrante");
elif((num < 0) and (num > 360)):
   print("excede");
