package palabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //Modificar un atributo final, no es posible modificarlo
        //ClaseFinal.VAR_PRIMITIVO = 29;
        
        //Modificar la referencia de un atributo de tipo Object
        //ClaseFinal.VAR_PERSONA = new Persona(); //no es posible modificar una variable de tipo objeto final
        
        ClaseFinal.VAR_PERSONA.setNombre("Yoelys");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Raul");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
    }
}
