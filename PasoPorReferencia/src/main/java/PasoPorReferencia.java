
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Yoelys");
        
        System.out.println("Valor de nombre: " + persona.obtenerNombre());
        
        modificarPersona(persona);
        
        System.out.println("Valor de nombre modificado: " + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Jose");
    }
}
 