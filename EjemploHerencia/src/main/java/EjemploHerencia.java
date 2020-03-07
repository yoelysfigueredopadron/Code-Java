
import java.util.Date;


public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Yoelys", 5000);
        empleado1.setEdad(37);
        empleado1.setGenero('M');
        empleado1.setDireccion("Av. La Plata 1000");
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Meli");
        System.out.println(cliente1);
    }
}
