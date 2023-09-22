//TAREA 13 Busqueda en matriz
import java.util.Scanner;
public class tarea13 {
    public static void main(String[] args) {
        
        //inicializar variables
        // Contador de apariciones
        int count = 0;
        //Lectura de datos
        Scanner lec = new Scanner(System.in);
        // Creacion de la matriz FILAS Y COLUMNAS
        System.out.print("Ingrese el total de filas: ");
        int h = lec.nextInt();
        System.out.print("Ingrese el total de columnas: ");
        int w = lec.nextInt();
        int[][] A = new int[h][w];

        // ciclo de asignacion
        for (int i = 0 ; i < A.length; i++) {
            for (int j = 0 ; j < A[i].length; j++) {
                System.out.print("Ingrese el elemento: ");
                A[i][j] = lec.nextInt();
            }
        }

        //Ciclo de busqueda
        System.out.print("Ingrese el elemento que desea buscar en el vector: ");
        int b = lec.nextInt();
        for (int i = 0 ; i < A.length; i++) {
            for(int j = 0 ; j < A[i].length; j++) {
                if (A[i][j] == b) {
                    count = count +1;
                }
            }
        }
        //Verificar si el elemento se encuentra o no.
        if(count != 0){
            System.out.println("El elemento: "+ b + " si se encuentra y aparece " + count+" veces");
        }else{
            System.out.println("El elemento: "+ b + " no se encuentra en la matriz");
        }
        
        // Ciclo de impresion
        System.out.println("Matriz: ");
        for (int i = 0 ; i < A.length; i++) {
            System.out.print("{");
            for(int j = 0 ; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
                if (j < A[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < A.length - 1) {
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}

