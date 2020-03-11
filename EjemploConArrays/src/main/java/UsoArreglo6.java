
public class UsoArreglo6 {
    /* Calcular tabla de intereses
    
    Vamos a realizar un programa que calcula el crecimiento del capital acumulado sobre los intereses anuales de una cuenta bancaria
    tomando como parámetros a medir diferentes tasas de intereses sobre la misma cuenta en el mismo período de tiempo
    
    -(saldo inicial de $10000.00)
    -período de tiempo anual
    -tasas de interes(10%, 11%, 12%, 13%, 14%)
    
                        10%           11%             12%             13%             14%             15%
  capital ->       $ 10.000,00 	 $ 10.000,00 	 $ 10.000,00 	 $ 10.000,00 	 $ 10.000,00 	 $ 10.000,00 
    2013  ->       $ 11.000,00 	 $ 11.100,00 	 $ 11.200,00 	 $ 11.300,00 	 $ 11.400,00 	 $ 11.500,00 
    2014  ->       $ 12.100,00 	 $ 12.321,00 	 $ 12.544,00 	 $ 12.769,00 	 $ 12.996,00 	 $ 13.225,00 
    2015  ->       $ 13.310,00 	 $ 13.676,31 	 $ 14.049,28 	 $ 14.428,97 	 $ 14.815,44 	 $ 15.208,75 
    2016  ->       $ 14.641,00 	 $ 15.180,70 	 $ 15.735,19 	 $ 16.304,74 	 $ 16.889,60 	 $ 17.490,06 

    */
    public static void main(String[] args) {
        double acumulado;//capital acumulado
        double interes = 0.10;//10% de interes
        
        double[][] saldo = new double[6][5];
        
        for(int i = 0; i < saldo.length; i++){
            saldo[i][0] = 10000;//En la segunda dimesión del array bidimensional 'saldo' siempre asignamo el valor $10000
            acumulado = 10000;
            //j=1 porque la segunda dimensión que recorre este bucle for en el índice [i] ejemplo([0,0][1,0][2,0][3,0][4,0][5,0]) siempre se le asignara el valor $10000
            for(int j = 1; j < saldo[i].length; j++){
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j]=acumulado;//se comienza a guardar el acumulado apartir del indice saldo[0][1]
            }
            interes = interes + 0.01;//aumentamos el interes a un 0.11% que es lo mismo que el 11% y asi aumentamos 0.01 en cada ciclo para aumenter el interes 
        }
        
        //dos bucles for anidados para mostrar los valores calculados del arreglo 'saldo' 
        /* Las variables enteras contadoras mFila(mostrar fila) y mColumna(mostrar Columna) son usadas como índices de 'saldo' para mostrar el
           valor del calculo de la variable acumulado */
        for(int mFila = 0; mFila < saldo.length; mFila++){
            System.out.println();
            for(int mColumna = 0; mColumna < saldo[mFila].length; mColumna++ ){
                
                System.out.print("$");
                System.out.printf("%1.2f", saldo[mFila][mColumna]);
                System.out.print(" | ");
            }
        }
    }
}
