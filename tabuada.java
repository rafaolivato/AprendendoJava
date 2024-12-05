import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int numero;
        System.out.println("______________Tabuada______________");
        System.out.println("Digite um número: ");
        Scanner Teclado = new Scanner(System.in);
        numero = Teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        Teclado.close();
    }
}
