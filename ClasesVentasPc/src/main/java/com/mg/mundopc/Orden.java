package com.mg.mundopc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final int maxComputadoras = 20;
    private final Date fechaOrden;
    private final SimpleDateFormat formatoFecha;
    
    //Constructor vacío
    public Orden(Date fecha){
        this.idOrden = ++contadorOrdenes;
        this.fechaOrden = fecha;
        this.formatoFecha = new SimpleDateFormat("EEE dd MMMMM yyyy HH:mm:ss") ;
        computadoras = new Computadora[maxComputadoras];
    }
        
    public void agregarComputadora(Computadora computadora){
        if( this.contadorComputadoras < maxComputadoras){
            computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el máximo de " + maxComputadoras + " productos.");
        }
    }
    
    public double calcularPrecioTotal(){
        double total = 0;//variable donde acumulamos la suma total de la orden de computadoras
        for(int i = 0; i < this.contadorComputadoras; i++){
            Computadora sumaComputadoras = computadoras[i];
            total += sumaComputadoras.getPrecio();
        }
        return total;
    }
    
    public void ImprimirOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println(formatoFecha.format(fechaOrden));//fecha y hora de la orden
        System.out.println("Cantidad de computadoras:" + contadorComputadoras);
        System.out.println("Total de la Orden: $" + String.format("%.2f", this.calcularPrecioTotal())); 
        System.out.println("Detalles de la orden:");
        for(int i = 0; i < this.contadorComputadoras; ++i){
            System.out.println(computadoras[i]);
        }
    }
}
