public class UsoArreglo4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];//Creación de una matiz bidimensional
        
        matriz[0][0] = 12; 
        matriz[0][1] = 125; 
        matriz[0][2] = 1; 
        matriz[0][3] = 2; 
        matriz[0][4] = 712; 
        
        matriz[1][0] = 92; 
        matriz[1][1] = 47; 
        matriz[1][2] = 32; 
        matriz[1][3] = 35; 
        matriz[1][4] = 6;
        
        matriz[2][0] = 100; 
        matriz[2][1] = 17; 
        matriz[2][2] = 86; 
        matriz[2][3] = 46; 
        matriz[2][4] = 5;
        
        matriz[3][0] = 94; 
        matriz[3][1] = 73; 
        matriz[3][2] = 64; 
        matriz[3][3] = 81; 
        matriz[3][4] = 16;
        
        //ejemplo de como acceder a una matriz bidimensional
        //System.out.println("El valor almacenado en la matriz[1][3]: " + matriz[1][3]);
        
        //creamos dos bucles for anidados para recorrer la matriz bidimensional
        for(int i = 0; i < matriz.length; i++){
            System.out.println();
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Matriz[" + i +"]" + "["+ j +"]: " + matriz[i][j]);
            }
        }
    }
    
}
