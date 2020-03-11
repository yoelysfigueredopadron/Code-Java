import javax.swing.JOptionPane;

public class UsoArreglo2 {

    public static void main(String[] args) {
        
        String[] paises = new String[8];
        
        for(int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduzca país" + (i+1));
        }
        
        /*paises[0] = "Argentina";
        paises[1] = "Cuba";
        paises[2] = "España";
        paises[3] = "Canada";
        paises[4] = "EE.UU";
        paises[5] = "Rusia";
        paises[6] = "Venezuela";
        paises[7] = "Ecuador";*/
        
        //String[] paises = {"Argentina", "Cuba", "España", "Canada", "EE.UU", "Rusia", "Venezuela", "Ecuador"};
        
        /*for(int i = 0; i < paises.length; i++){
            System.out.println("País" + (i+1) + ". " + paises[i]);
        }*/
        
        for(String i: paises){
            System.out.println("País: " + i);
        }
    }
}
