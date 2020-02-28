
public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        
        //Imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        //Imprimimos el resultado de la suma
        System.out.println("\nResultados de la suma: " + objeto1.sumar());
        
         //Imprimimos el resultado de la resta
        System.out.println("\nResultados de la resta: " + objeto1.restar());
        
        //Imprimimos el resultado de la multiplicación
        System.out.println("\nResultados de la multiplicación: " + objeto1.multiplicar());
        
        //Imprimimos el resultado de la división
        System.out.println("\nResultados de la división: " + objeto1.dividir());
        
    }
}
