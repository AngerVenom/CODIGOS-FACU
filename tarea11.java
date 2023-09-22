//TAREA 11 Serie A
import java.util.Scanner;
public class tarea11 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int numero = 1, n;
        System.out.print("Ingrese el total de numeros: ");
        n = lec.nextInt();
        for(int i = 0; i < n; i++) {
            numero = (int) Math.pow(i+1, 2*i+1);
            System.out.print(numero+",");
        }
    }
}
