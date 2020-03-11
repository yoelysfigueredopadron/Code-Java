
public class UsoArreglo {
    
    public static void main(String[] args) {
        
        /*
        int[] arreglo1 = new int[5];
        arreglo1[0] = 78;
        arreglo1[1] = 96;
        arreglo1[2] = 36;
        arreglo1[3] = 3;
        arreglo1[4] = -20;
        
        //imprimos los valores del arreglo1 accediendo a su índice directamente
        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);
        */
        
        int arreglo1[] = {78, 96, 36, 3, -20, 4, 12, 24, 87, 54, 10, 64, 1, 21, 90};
        //recorremos el arreglo1 con un bucle for para imprimir su información
        for(int i = 0; i < arreglo1.length; i++){
            System.out.println("Valor del arreglo1[" + i + "]=" + arreglo1[i]);
        }
    }

    
}
