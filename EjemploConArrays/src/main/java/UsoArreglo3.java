
public class UsoArreglo3 {
    
    public static void main(String[] args) {
        //creamos una matriz para guardar 150 valores enteros creados aliatoriamente
        int[] matrizRandom = new int[150];
        
        /* Creamos valores aleatorios con el método random de la clase Math multiplicando el valor devuelto por 100 para
        obtener números aleatorios entre 1 y 100 luego utilizamos el método round para redondear el valor devuelto por
        (Math.random()*100) y finalmente hacemos la conversión del valor devuelto a entero mediante el conversor(int)
        para asignarlo en cada indice del Array matrizRandom. */
        
        for(int i = 0; i < matrizRandom.length; i++){
            matrizRandom[i] =(int)Math.round(Math.random()*100);
        }
        
        System.out.println("Mostramos la matriz de números aleatorios uno al lado de otro:");
        for(int a: matrizRandom){
            System.out.print(a + " ");
        }
    }
}
