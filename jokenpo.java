import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
        int jogador1, computador;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("______________Jokenpo______________");
        System.out.println("Digite: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        System.out.println("Jogador 1: ");
        System.out.println("Computador: ");
        
        jogador1 = Teclado.nextInt();
        switch (jogador1) {
            case 1:
                System.out.println("Pedra -sua escolha");
                break;
            case 2:
                System.out.println("Papel - sua escolha");
                break;
            case 3:
                System.out.println("Tesoura - sua escolha");
                break;
            
        
            default:
            System.out.println("Opção inválida");

                break;
        }

        computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Pedra - computador selecionou");
                break;
            case 2:
                System.out.println("Papel - computador selecionou");
                break;
            case 3:
                System.out.println("Tesoura - computador selecionou");
                break;

        
        }
        Teclado.close();

        if (jogador1 == computador) {
            System.out.println("Empate");
        } else if (jogador1 == 1 && computador == 3 || jogador1 == 2 && computador == 1 || jogador1 == 3 && computador == 2) {
            System.out.println("Jogador 1 venceu");
        } else {
            System.out.println("Computador venceu");
        }
    }
}
