/*
    Vamos a instanciar la clase CalcularVolumen creando objetos de la misma
 */
public class PruebaVolumen {

    public static void main(String[] args) {
        //Llamamos al construtor con parametros para crear el objeto1
        CalcularVolumen objeto1 = new CalcularVolumen(3, 2, 6);        
        
        //Imprimimos el valor del volumen calculado para el objeto1 utilizando el método calcularVolumen
        System.out.println("El volumen del objeto1 es: " + objeto1.calcularVolumen());

        //Llamamos al constructor vacío para crear el objeto2
        CalcularVolumen objeto2 = new CalcularVolumen();
        
        //Asignamos valores diferentes para los atributos de la clase CalcularVolumen en el objeto2
        objeto2.setAncho(4);
        objeto2.setAlto(5);
        objeto2.setProfundidad(6);
        
        //Creamos la variable resultado para asignarle el calculo del volumen del objeto2
        int resultado = objeto2.calcularVolumen();
        
        //Imprimimos una linea vacía para separar el resultado en pantalla
        System.out.println("");
        
        //Imprimimos el valor del volumen calculado para el objeto2
        System.out.println(objeto2 + "" + resultado);
        
    }

}
