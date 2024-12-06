public class dado {
    
    public static void main(String[] args) {
        int dado;
        System.out.println("______________Jogo de Dados______________");
        dado = (int) (Math.random() * 6 + 1);
        System.out.println("Dado: " + dado);
        if (dado == 1) {
            System.out.println("Agora é sua vez Tirei o azar grande -.1.-");
        } else if (dado == 2) {
            System.out.println("Pule 2 casas");
        } else if (dado == 3) {
            System.out.println("Pule 3 casas");
        } else if (dado == 4) {
            System.out.println("Pule 4 casas");
        } else if (dado == 5) {
            System.out.println("Pule 5 casas");
        } else {
            System.out.println("Pule 6 casas"); 
        System.out.println("Fim de jogo");
        System.out.println("Obrigado por jogar");
        System.out.println("Quer jogar novamente s/n? ");
        
    }

    }
}
