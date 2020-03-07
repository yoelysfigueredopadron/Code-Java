package com.mg.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;
    
    //Constructor con parámetros
    public Teclado(String tipoDispositivo, String marca){
        super(tipoDispositivo, marca);
        idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{N°" + idTeclado + super.toString();
    }

   
    
}
