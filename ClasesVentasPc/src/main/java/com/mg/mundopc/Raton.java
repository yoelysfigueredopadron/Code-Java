package com.mg.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor con parámetros
    public Raton(String tipoDispositivo, String marca){
        super(tipoDispositivo, marca);
        this.idRaton = ++contadorRatones;        
    }

    @Override
    public String toString() {
        return "Raton{N°" + idRaton + super.toString();
    }

   
    
}
