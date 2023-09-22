//TAREA 15 Multiplicacion de matrices
import java.util.Scanner;
public class tarea15 {
    public static void main(String[] args) {
        
        //inicializar variables
        int num, h,w, h2, w2, c=0;
        //Lectura de datos
        Scanner lec = new Scanner(System.in);
        // Creacion de la matriz FILAS Y COLUMNAS
        System.out.println("**********DIMENSIONES DE LAS MATRICES**********");
        // Validar que las dimensiones ingresadas sean validas.
        do {
            System.out.print("Ingrese el total de filas: ");
            h = lec.nextInt();
        } while (h<=0);
        do {
            System.out.print("Ingrese el total de columnas: ");
            w = lec.nextInt();        
        } while (w<=0);

        // Creacion de la matriz
        // Matriz A
        int[][] A = new int[h][w];
        do {
            System.out.print("Ingrese el total de filas: ");
            h2 = lec.nextInt();
        } while (h2<=0);
        do {
            System.out.print("Ingrese el total de columnas: ");
            w2 = lec.nextInt();        
        } while (w2<=0);
        // Matriz B
        int[][] B = new int[h2][w2];
        // el número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz. 
        if(w==h2){
            // Matriz Resultante
            int[][] matrizResultado = new int[h][w2]; // la matriz resultante sera de igual dimension.
            // ciclo de asignacion MATRIZ A
            System.out.println("**********MATRIZ A**********");
            for (int i = 0 ; i < A.length; i++) {
                for (int j = 0 ; j < A[i].length; j++) {
                    // validar que el numero ingresado no sea negativo o sero
                    do {
                        System.out.print("Ingrese un número positivo para la posición [" + i + "],[" + j + "]: ");
                        num = lec.nextInt();
                    } while (num < 0);
                    A[i][j] = num;
                }
            }
            
            // Ciclo de impresion Matriz A
            System.out.println("Matriz A: ");
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
            // ciclo de asignacion MATRIZ B
            System.out.println("**********MATRIZ B**********");
            for (int i = 0 ; i < B.length; i++) {
                for (int j = 0 ; j < B[i].length; j++) {
                    // validar que el numero ingresado no sea negativo o sero
                    do {
                        System.out.print("Ingrese un número positivo para la posición [" + i + "],[" + j + "]: ");
                        num = lec.nextInt();
                    } while (num < 0);
                    B[i][j] = num;
                }
            }
            // Ciclo de impresion Matriz B
            System.out.println("Matriz B: ");
            for (int i = 0 ; i < B.length; i++) {
                System.out.print("{");
                for(int j = 0 ; j < B[i].length; j++) {
                    System.out.print(B[i][j] + " ");
                    if (j < B[i].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("}");
                if (i < B.length - 1) {
                    System.out.print(", ");
                }
                System.out.println();
            }
            //Ciclo de multiplicacion de matrices
            for (int i = 0 ; i < A.length; i++) {
                for(int j = 0 ; j < B[0].length; j++) {
                    for(int k = 0 ; k <A[0].length; k++) {
                        matrizResultado[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            //IMPRESION MATRIZ RESULTANTE
            System.out.println("Matriz Resultante: ");
            for(int i = 0 ; i < matrizResultado.length; i++) {
                System.out.print("{");
                for(int j = 0 ; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j] + " ");
                    if (j < matrizResultado[i].length - 1) {
                    System.out.print(", ");
                    }
                }
                System.out.print("}");
                if (i < matrizResultado.length - 1) {
                    System.out.print(", ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Las dimensiones ingresadas no son compatibles");
        } 
    }
}
