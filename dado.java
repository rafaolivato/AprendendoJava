public class dado {
    
    public static void main(String[] args) {
        int dado;
        System.out.println("______________Jogo de Dados______________");
        dado = (int) (Math.random() * 6 + 1);
        System.out.println("Dado: " + dado);
        if (dado == 1) {
            System.out.println("Agora é sua vez");
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
    }

    }
}
