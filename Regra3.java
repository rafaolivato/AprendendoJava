
import java.util.Scanner;
import java.text.DecimalFormat;

public class Regra3 {

    public static void main(String[] args) {
        
        double x, y, valor;

        Scanner Teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Regra de 3");
        System.out.println("x% de y = valor");
        System.out.println("Digite o valor de x: ");
        x = Teclado.nextDouble();
        System.out.println("Digite o valor de y: ");
        y = Teclado.nextDouble();

        valor = (x * y) / 100;
        System.out.println( x + "% de " + y + " = " + formatador.format(valor));
        Teclado.close();

    }
}

