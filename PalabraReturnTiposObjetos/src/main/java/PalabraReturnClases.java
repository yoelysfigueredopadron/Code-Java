
public class PalabraReturnClases {

    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        System.out.println("El resultado de llamar el metodo sumar: " + s.sumar());
    }

    private static Suma creaObjetoSuma() {
        Suma suma = new Suma(10, 5);
        return suma;
    }
}

class Suma {
        int a, b;    //Atributos de la clase

        public Suma(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
       public int sumar() {
           return this.a +this.b;
       } 
    }
