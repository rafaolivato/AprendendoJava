
import java.util.Scanner;

public class alcoolGas {
    public static void main(String[] args) {
        double alcool, gasolina;
        
        Scanner Teclado = new Scanner(System.in);
        
        
        System.out.println("______________Alcool ou Gasolina______________");

        System.out.println("Digite: Preço do álcool ");
        alcool = Teclado.nextDouble();
        
        System.out.println("Digite: Preço da gasolina ");

        gasolina = Teclado.nextDouble();
       
        if (alcool < 0.7 * gasolina) {
            System.out.println("Abasteça com álcool");
        } else {
            System.out.println("Abasteça com gasolina");
        }
        Teclado.close();
    }
}
