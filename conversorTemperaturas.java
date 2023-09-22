//TAREA 9 Conversion de temperaturas
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class tarea09 {
    public static void main(String[] args) {
        //Declaración de variables
        DecimalFormat df = new DecimalFormat("#.##");//formato a 2 decimales
        // Opciones de conversión
        String[] opciones = {
            "°C -> °F",
            "°F -> °C",
            "Cancelar"
        };
        // menu de opciones
        int choice = JOptionPane.showOptionDialog(
            null, // parent component
            "Escoje el método de conversión", // message
            "Convertidor de temperaturas", // title
            JOptionPane.YES_NO_CANCEL_OPTION, // option type
            JOptionPane.QUESTION_MESSAGE, // message type
            null, // icon
            opciones, // options
            opciones[0] // default option
        );
        
        if (choice == JOptionPane.YES_OPTION) {
            //  °C -> °F
            String temp = JOptionPane.showInputDialog(null, "Escribe la temperatura en centigrados: ");
            int calc = Integer.parseInt(temp);
            // calculo de la conversión
            float result = (float) (calc * 1.8) + 32;
            // a 2 decimales
            String formatted = df.format(result);
            JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + formatted + "°F");
        } else if (choice == JOptionPane.NO_OPTION) {
            // °F -> °C
            String temp = JOptionPane.showInputDialog(null, "Escribe la temperatura en Fahrenheit: ");
            int calc = Integer.parseInt(temp);
            // calculo de la conversión
            float result = (float) ((calc - 32) *0.5555555555555556);
            // a 2 decimales
            String formatted = df.format(result);
            JOptionPane.showMessageDialog(null, "La temperatura en Celsius es: " + formatted + "°C");
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            // Cancel
            System.out.println("Operacion cancelada.");
        }
    }
}
