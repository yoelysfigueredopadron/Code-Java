
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Yoelys", 5000, false);
        
//        System.out.println("nombre persona: " + persona.getNombre());
//        System.out.println("sueldo persona: " + persona.getSueldo());
//        System.out.println("persona borrar?  " + persona.isEliminado());
        
        System.out.println("persona: " + persona);
        
        persona.setNombre("Jose");
        persona.setSueldo(3000);
        persona.setEliminado(true);
        //persona.nombre = "Isabel";
//        System.out.println("nombre persona: " + persona.getNombre());
//        System.out.println("sueldo persona: " + persona.getSueldo());
//        System.out.println("persona borrar?  " + persona.isEliminado()); 
        
        System.out.println("persona: " + persona);
    }

}
