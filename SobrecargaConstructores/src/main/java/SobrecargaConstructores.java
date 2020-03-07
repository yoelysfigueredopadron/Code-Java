
public class SobrecargaConstructores {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Yoelys", 37);
        System.out.println("persona1 = " + persona1);
        
        Empleado empleado1 = new Empleado("Isabel", 30, 7000);
        System.out.println("empleado1 = " + empleado1);
    }
}
