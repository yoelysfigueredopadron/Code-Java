
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada_ejemplo1 {

    public static void main(String[] args) {
        
        //Vamos a introducir información con la clase Scanner del paquete java.util
        Scanner introInfo = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor: ");
        String nombre_usuario = introInfo.nextLine();
        System.out.println("Introduce la edad, por favor: ");
        int edad = introInfo.nextInt();
        System.out.println("Hola " + nombre_usuario + ". En tu próximo cumpleaños tendrás " + (edad + 1) + " años. \n");
        
        //Ahora introducimos información con la clase JOptionPane
        String user_name = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
        String user_age  = JOptionPane.showInputDialog("Introduce la edad, por favor: ");
        System.out.println("Hola " + user_name + ". En tu próximo cumpleaños tendrás " + (Integer.parseInt(user_age) + 1) + " años.");

        //Una salida formateada para números decimales
        double x = 100000.0;
        System.out.print("\n x = 100000.0 \n");
        System.out.print("El resultado de x/3 = " + String.format("%.2f", x/3) +"\n");
        
        String number1 = JOptionPane.showInputDialog("Introduce un número para calcular su raíz cuadrada: ");
        Double number2 = Double.parseDouble(number1);
        System.out.print("\nLa raíz cuadrada de " + number2 + " es " + String.format("%.2f", Math.sqrt(number2)) + "\n");
    }

}
