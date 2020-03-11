
public class UsoArreglo5 {

    public static void main(String[] args) {
        int[][] matriz = {
            {10, 13, 15, 16, 19},
            {24, 21, 29, 27, 26},
            {41, 49, 43, 48, 40},
            {64, 63, 68, 60, 67}
        };
        
        /*for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print( matriz[i][j] + " ");
            }
        }*/
        
        for(int[] fila : matriz){
            System.out.println();
            for(int columnaFila : fila){
                System.out.print(columnaFila + " ");
            }
        }
    }
}
