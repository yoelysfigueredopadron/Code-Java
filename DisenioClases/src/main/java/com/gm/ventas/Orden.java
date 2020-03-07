package com.gm.ventas;

import java.util.Date;

public class Orden {
    private int idOrden;
    private Producto productos[];//Declaramos la variable arreglo
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private Date fechaOrden;

    public Orden(Date fechaOrden) {
        this.idOrden = ++contadorOrdenes;
        //Inicializamos el arreglo
        productos = new Producto[MAX_PRODUCTOS];
        this.fechaOrden = fechaOrden;
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < MAX_PRODUCTOS){
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de " + MAX_PRODUCTOS + " productos.");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i=0; i < this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();//total = total + producto.getprecio()
        }
        return total;
    }
    
    public void mostarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Fecha:" + this.fechaOrden);//fecha
        System.out.println("Total de la Orden: $" + String.format("%.2f", this.calcularTotal()));
        System.out.println("Productos de la Orden:");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(productos[i]);
        }
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }    
    
}
