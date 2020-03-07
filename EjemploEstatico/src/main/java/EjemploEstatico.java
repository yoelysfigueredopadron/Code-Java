
public class EjemploEstatico {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Yoelys");
        System.out.println(persona1);
        
        Persona persona2 = new Persona("Isabel");
        System.out.println(persona2);
        
        Persona persona3 = new Persona("Jose");
        System.out.println(persona3);
        
        System.out.println("contadorPersonas: " + Persona.getContadorPersonas());
    }
}
