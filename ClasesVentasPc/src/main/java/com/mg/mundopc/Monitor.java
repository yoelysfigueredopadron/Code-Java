package com.mg.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    //Contructor vacío
    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }
    
    //Constructor con parámetros
    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }    

    @Override
    public String toString() {
        return "Monitor{N°" + idMonitor + ", Marca=" + marca + ", Tama\u00f1o=" + tamaño + '}';
    }
    
    

}
