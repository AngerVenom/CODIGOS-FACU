//TAREA 12 Busqueda en vector
import java.util.Scanner;
public class tarea12 {
    public static void main(String[] args) {
        
        //inicializar variables
        int count = 0;
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingrese el total de elementos: ");
        int n = lec.nextInt();
        int[] A = new int[n];
        // ciclo de asignacion
        for (int i = 0 ; i < A.length; i++) {
            System.out.print("Ingrese el elemento: ");
            A[i] = lec.nextInt();
        }
        //Ciclo de busqueda
        System.out.print("Ingrese el elemento que desea buscar en el vector: ");
        int b = lec.nextInt();
        for (int i = 0 ; i < A.length; i++) {
            if (A[i] == b) {
                count = count +1;
            }
        }
        if(count != 0){
            System.out.println("El elemento: "+ b + " si se encuentra y aparece " + count+" veces");
        }else{
            System.out.println("El elemento: "+ b + " no se encuentra en el vector");
        }
        
        // Ciclo de impresion
        System.out.print("[");
        for (int i = 0 ; i < A.length; i++) {
            System.out.print(A[i]+",");
        }
        System.out.print("]");
    }
}
    