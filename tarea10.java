//TAREA 10 Conversion de monedas
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class tarea10 {
    public static void main(String[] args) {
        //declaración de variables
        String pesos ="";
        int calc = 0;
        float result = 0;
        String formatted = "";
        DecimalFormat df = new DecimalFormat("#.##");//formato a 2 decimales
        String[] opciones = {
            "Dólar",
            "Euro",
            "Yen",
            "DolarHK", 
            "Cancelar"
        };  
        // equivalencias de 1 peso a:
        double Dolar = 0.056;
        double Euro = 0.051;
        double Yen = 7.59;
        double DolarHK = 0.44;

        // menu de opciones
        int choice = JOptionPane.showOptionDialog(
            null, // parent component
            "Escoje el método de conversión", // message
            "Convertidor de temperaturas", // title
            JOptionPane.DEFAULT_OPTION, // option type
            JOptionPane.QUESTION_MESSAGE, // message type
            null, // icon
            opciones, // options
            opciones[0] // default option
        );

        switch(choice){
            case 0:
                // Dólar
                pesos = JOptionPane.showInputDialog(null, "Escribe los pesos que quieres convertir: ");
                calc = Integer.parseInt(pesos);
                // calculo de la conversión
                result = (float) (calc*Dolar);
                // a 2 decimales
                formatted = df.format(result);
                JOptionPane.showMessageDialog(null, "La conversion de monedas es: " + formatted + " Dólares");
                break;
            case 1:
                // Euro
                pesos = JOptionPane.showInputDialog(null, "Escribe los pesos que quieres convertir: ");
                calc = Integer.parseInt(pesos);
                // calculo de la conversión
                result = (float) (calc*Euro);
                // a 2 decimales
                formatted = df.format(result);
                JOptionPane.showMessageDialog(null, "La conversion de monedas es: " + formatted + " Euros");
                break;
            case 2:
                // Yen
                pesos = JOptionPane.showInputDialog(null, "Escribe los pesos que quieres convertir: ");
                calc = Integer.parseInt(pesos);
                // calculo de la conversión
                result = (float) (calc*Yen);
                // a 2 decimales
                formatted = df.format(result);
                JOptionPane.showMessageDialog(null, "La conversion de monedas es: " + formatted + " Yenes japoneses");
                break;
            case 3:
                // Dólar HK
                pesos = JOptionPane.showInputDialog(null, "Escribe los pesos que quieres convertir: ");
                calc = Integer.parseInt(pesos);
                // calculo de la conversión
                result = (float) (calc*DolarHK);
                // a 2 decimales
                formatted = df.format(result);
                JOptionPane.showMessageDialog(null, "La conversion de monedas es: " + formatted + " Dolares de Hong Kong");
                break;
            case 4:
                // Cancelar
                System.out.println("Hasta luego.");
                break;
        }
        
        
    }
}
