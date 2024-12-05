import java.text.DecimalFormat;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        
        double peso, altura, imc;
        
        Scanner Teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        System.out.println("______________Calculo de IMC______________");

        System.out.println("Digite: Peso ");
        peso = Teclado.nextDouble();

        System.out.println("Digite: Altura ");
        altura = Teclado.nextDouble();

        imc=   peso / (altura * altura);
        System.out.println("IMC: " + formatador.format(imc));

       
        Teclado.close();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

     

    }
}
