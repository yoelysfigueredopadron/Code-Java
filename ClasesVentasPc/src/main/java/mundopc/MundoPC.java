package mundopc;

import com.mg.mundopc.*;
import java.util.Date;

public class MundoPC {
    
    public static void main(String[] args) {
        //información de las PCs
    Monitor Monitor1 = new Monitor("Samsung", 22);
    Teclado teclado1 = new Teclado("usb", "teclado SOUL");
    Raton raton1 = new Raton("usb", "SOUL");
    Computadora computadora1 = new Computadora("Computadora Lenovo", Monitor1, teclado1, raton1, 24500);
    
    Monitor monitor2 = new Monitor("Toshiba", 17);
    Teclado teclado2 = new Teclado("bluetooth", "Toshiba");
    Raton raton2 = new Raton("bluetooth", "Toshiba");
    Computadora computadora2 = new Computadora("Computadora Toshiba", monitor2, teclado2, raton2, 32600);
    
    Monitor monitor3 = new Monitor("Dell", 17);
    Teclado teclado3 = new Teclado("bluetooth", "Dell");
    Raton raton3 = new Raton("bluetooth", "Dell");
    Computadora computadora3 = new Computadora("Computadora Dell", monitor3, teclado3, raton3, 52200);
    
    //Creamos la orden
    Orden orden1 = new Orden(new Date());
    
    //Agregamos las computadoras a la orden
    orden1.agregarComputadora(computadora1);
    orden1.agregarComputadora(computadora2);
    orden1.agregarComputadora(computadora3);
    
    //Imprimimos la Orden
    orden1.ImprimirOrden();
    }
    
}
