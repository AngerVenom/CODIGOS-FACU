#include <iostream>
#include <cstdlib>
using namespace std;
int main(int argc, char** argv) {
	int numMaestros, sueldos, nivel;
    float sueldo, increment, newSueldo;
    cout<<endl;
    cout<<"Salarios de maestros\n";
    do{
        cout<<"Ingresa el numero de Maestros: ";
        cin>>numMaestros;
    }while(numMaestros <= 0);
    sueldos = 1;
   float array[sueldos];
   cout<<"************************************"<<endl;
    for(int i =1; i<=numMaestros;i++)
    {
        do{
            cout<<"Maestro: "<<i<<endl;
            sueldo = 0.0;
            for(int j=1; j<=sueldos; j++){
            	array[j] = 0.0; // default value;
                do{
                    do
                    {
                        cout<<"Ingresa el nivel del maestro "<<": " ;
	                    cin>>nivel;
                    } while (nivel<=0 || nivel>4);
                    
                    do{
	                    cout<<"Ingresa el sueldo "<<": " ;
	                    cin>>sueldo;
                    }while(sueldo <=0);
                    array[j] = sueldo;
	                j = j + 1;
                }while(j <= sueldos);  
            }
            
            for(int j = 1; j<=sueldos; j++){
                cout<<"El nivel y sueldo registrado es: "<<endl;
                do
                {
                    cout<<"Nivel "<<nivel <<": "<<"$"<< array[j]<<endl;
                    j = j + 1; 
                } while (j <= sueldos);  
            }
            switch (nivel)
            {
                case 1:
                {
                    increment = sueldo*.035;
                    newSueldo = sueldo + increment;
                    break;
                }
                case 2:
                {
                    increment = sueldo*.041;
                    newSueldo = sueldo + increment;
                    break;
                }
                case 3:
                {
                    increment = sueldo*.048;
                    newSueldo = sueldo + increment;
                    break;
                }
                case 4:
                {
                    increment = sueldo*.053;
                    newSueldo = sueldo + increment;
                    break;
                }
            }
            cout<<"El nivel del maestro es: "<<nivel<<" Por lo tanto el sueldo del maestro es: "<<"$"<<newSueldo<<endl;
            cout<<"************************************"<<endl;
            i = i + 1;   
        }while(i <= numMaestros);   
    }
	system("PAUSE");
	return 0;
}
