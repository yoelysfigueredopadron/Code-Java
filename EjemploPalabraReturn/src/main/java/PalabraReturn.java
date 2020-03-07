
public class PalabraReturn {

    public static void main(String[] args) {
        int resultado = sumar(3,4);
        System.out.println("resultado = " + resultado);
        
        System.out.println();   //Imprime una linea para separar los resultados visualmente
        
        //Use de return condicionado
        int result = add(0,0);
        System.out.println("result = " + result);
    }

    public static int sumar(int arg1, int arg2) {
        return arg1 + arg2;
    }
    
    //Use de return condicionado
    /*Add es un método mediante el cual sumamos dos valores pasados por parametros y si ambos valores son iguales a cero
      imprimimos un mensaje por pantalla y la llamada al método devolverá el valor cero a la variable entera result
      mediante la palabra reservada return imprimiendo el valor en pantalla*/
    public static int add(int a, int b) {
        if(a == 0 && b == 0) {
            System.out.println("Puede proporcionar valores distintos de cero");
            return 0;
        }
        return a + b;
    }
}
