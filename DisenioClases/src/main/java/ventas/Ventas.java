package ventas;

import com.gm.ventas.*;
import java.util.Date;

public class Ventas {
    public static void main(String[] args) {
        //Crear varios objetos de tipo producto
        Producto producto1  = new Producto("Aceite Girasol 900 cc", 80);
        Producto producto2  = new Producto("Acondicionador Común 930 cc", 98);
        Producto producto3  = new Producto("Amargo Botella 1,5 lts", 55);
        Producto producto4  = new Producto("Arroz Fino 1 kg", 50);
        Producto producto5  = new Producto("Arroz integral Tipo corto 1 kg", 82);
        Producto producto6  = new Producto("Detergente Común 750 cc", 47);
        Producto producto7  = new Producto("Dulce de Leche Pote 400 grs", 69);
        Producto producto8  = new Producto("Fajitas Bolsa 6 unidades", 48);
        Producto producto9  = new Producto("Fideo Sopero 500 grs", 38);
        Producto producto10 = new Producto("Fideo Tirabuzón 500 grs", 36);
        
        //Creamos un objeto de tipo Orden
        Orden orden1 = new Orden(new Date());
        
        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        
        //Imprimir la orden
        orden1.mostarOrden();
        
        //Creamos varios objetos de tipo producto para una segunda orden
        Producto producElect1  = new Producto("Notebook EXO SMART E18 Intel Atom", 18.999);
        Producto producElect2  = new Producto("Monitor LED EXO 23,8 \" HD24 FHD", 12.999);
        Producto producElect3  = new Producto("Extensor de Señal TP LINK Wi-Fi RE200", 2.599);
        Producto producElect4  = new Producto("Notebook EXO Smart Xs3 Intel Core i3", 37.999);
        Producto producElect5  = new Producto("Auriculares Bluetooth Panasonic RP-NJ300BE-W Blanco", 3.249);
        Producto producElect6  = new Producto("Cartucho HP 664 Negro F6V29AL Original", 999);
        Producto producElect7  = new Producto("Notebook EXO Smart E24 Intel Celeron", 26.999);
        Producto producElect8  = new Producto("Pendrive Kingston 16 GB 2.0 DTSE9 (L) Plata", 499);
        Producto producElect9  = new Producto("Adaptador WiFi ac adicional PLC DEVOLO 1200+ Wifi Single", 9.399);
        Producto producElect10 = new Producto("GOD OF WAR PS4", 3.649);
        
        //Separamos las ordenes en pantalla mediante una linea en blanco
        System.out.println();
        
        //Creamos un segundo objeto de tipo Orden
        Orden orden2 = new Orden(new Date());
        
        orden2.agregarProducto(producElect1);
        orden2.agregarProducto(producElect2);
        orden2.agregarProducto(producElect3);
        orden2.agregarProducto(producElect4);
        orden2.agregarProducto(producElect5);
        orden2.agregarProducto(producElect6);
        orden2.agregarProducto(producElect7);
        orden2.agregarProducto(producElect8);
        orden2.agregarProducto(producElect9);
        orden2.agregarProducto(producElect10);
        
        //Imprimir la orden
        orden2.mostarOrden();
        
    }
}
