
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;//apunta a un objeto del tipo persona
        System.out.println("impresión del operador this dentro de la clase persona: " + this);//this apunta a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//This contiene una referencia al objeto persona
    }
}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("Impresión del argumento persona: " + p);//valor del objeto persona
        System.out.println("Impresión del objeto actual (this): " + this);//this apunta a un objeto del tipo imprimir en este momento
    }
}
