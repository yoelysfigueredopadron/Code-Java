package matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //1. Declaramos una matriz de tipo int
        int edades[][];
        //2. Instanciamos la matriz de tipo int
        edades = new int[3][2];
        //3. Instanciar los valores de la matriz edades
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        //4. Imprimir valores de la matriz edades
        System.out.println("Matriz de enteros(edades) en el indice [0][0]: " + edades[0][0]);
        System.out.println("Matriz de enteros(edades) en el indice [0][1]: " + edades[0][1]);
        System.out.println("Matriz de enteros(edades) en el indice [1][0]: " + edades[1][0]);
        System.out.println("Matriz de enteros(edades) en el indice [1][1]: " + edades[1][1]);
        System.out.println("Matriz de enteros(edades) en el indice [2][0]: " + edades[2][0]);
        System.out.println("Matriz de enteros(edades) en el indice [2][1]: " + edades[2][1]);
        
        //1. Declarar e instanciar una matriz de objetos de tipo persona
        Persona personas[][] = new Persona[3][3];
        
        //2. Inicializamos valores de la matriz persona
        personas[0][0] = new Persona("Yoelys");
        personas[0][1] = new Persona("Felicia A");
        personas[0][2] = new Persona("Isabel M");
        personas[1][0] = new Persona("Jose H");
        personas[1][1] = new Persona("Raul P");
        personas[1][2] = new Persona("Concepcion A");
        personas[2][0] = new Persona("Isabel H");
        personas[2][1] = new Persona("Jose T");
        personas[2][2] = new Persona("Angelita T");
        
        //linea para separar resultados visuales de matrices
        System.out.println();
        
        //3. Imprimimos valores de la matriz persona
        System.out.println("Matriz persona indice [0][0]: " + personas[0][0]);
        System.out.println("Matriz persona indice [0][1]: " + personas[0][1]);
        System.out.println("Matriz persona indice [0][2]: " + personas[0][2]);
        System.out.println("Matriz persona indice [1][0]: " + personas[1][0]);
        System.out.println("Matriz persona indice [1][1]: " + personas[1][1]);
        System.out.println("Matriz persona indice [1][2]: " + personas[1][2]);
        System.out.println("Matriz persona indice [2][0]: " + personas[2][0]);
        System.out.println("Matriz persona indice [2][1]: " + personas[2][1]);
        System.out.println("Matriz persona indice [2][2]: " + personas[2][2]);
        
        //Imprimir linea para separar resultados visuales en las matrices
        System.out.println();
        
        System.out.println("Mostramos la matriz en pantalla usando ciclos for anidados");
        for(int fila = 0; fila < personas.length; fila++){
            for(int columna = 0; columna < personas[fila].length; columna++){
                System.out.println("Matriz persona indice[" + fila + "][" + columna + "]: " + personas[fila][columna]);
            }        
        }
    }
}
