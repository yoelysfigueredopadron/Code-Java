/*
 Con esta clase podemos calcular el volumen de un objeto o figura geometrica cumpliendo con los requisitos de tener
 3 atributos (ancho, alto, profundidad)
 */

public class CalcularVolumen {
    
    //Atributos de la clase
    private int ancho;
    private int alto;
    private int profundidad;
    
    //Construtor vacío
    public CalcularVolumen(){
    
    }
    
    //Construtor con parámetros
    public CalcularVolumen(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundidad;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "El volumen calculado del objeto con un " + "ancho=" + ancho + ", un alto=" + alto + " y una profundidad=" + profundidad + " es = ";
    }
    
    
    
    
    
}
