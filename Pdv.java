import java.text.DecimalFormat;
import java.util.Scanner;

public class Pdv {
    
    public static void main(String[] args) {
        
        double total, desconto, totalDesconto, valorPago, troco;

        Scanner Teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        System.out.println("______________Caixa PDV______________");
        System.out.println("Digite o valor total da compra: ");
        total = Teclado.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        desconto = Teclado.nextDouble();
        System.out.println("Total: " + formatador.format(total));
        totalDesconto = total - ((total * desconto) / 100);
        System.out.println("Total com desconto: " + formatador.format(totalDesconto));

        System.out.println("Digite o valor pago: ");
        valorPago = Teclado.nextDouble();

        troco = valorPago - totalDesconto;
    
        System.out.println("Troco: " + formatador.format(troco));

        Teclado.close();
    }   
}
