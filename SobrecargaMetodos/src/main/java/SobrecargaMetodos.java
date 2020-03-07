
public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println("Resultado1 = " + Operaciones.sumar(3, 6));
        System.out.println();
        System.out.println("Resultado2 = " + Operaciones.sumar(8.0, 5));
        System.out.println();
        System.out.println("Resultado3 = " + Operaciones.sumar(3, 5L));//5L es un tipo de dato (long de 64 bit)
        System.out.println();
        System.out.println("Resultado4 = " + Operaciones.sumar(3F, 'A'));
    }
}
