
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1: " + persona1.obtenerNombre());
        
        Persona persona2 = persona1;
        System.out.println("persona2: " + persona2.obtenerNombre());
        
        persona1 = null;
        if (persona1 != null)
            System.out.println("persona1: " + persona1.obtenerNombre());
        else
            System.out.println("La variable persona1 no apunta a ningún objeto.");
        
        persona2 = null;
        
        System.gc();//garbage collector solo planifica la llamada, la maquina virtual de java se encarga cuando este disponible el momento
    }
}

class Persona{//clase
    String nombre;

    Persona(String nombre) {//construtor
        this.nombre = nombre;
    }
        
    public String obtenerNombre() {//método obtener nombre
        return this.nombre;
    }
    
    
}
