public class jogoCartas {
    public static void main(String[] args) {
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] cartas = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        System.out.println("______________Jogo de Cartas______________");
        String naipe = naipes[(int) (Math.random() * 4)];
        String carta = cartas[(int) (Math.random() * 13)];
        System.out.println("Carta: " + carta + " de " + naipe);
    
    
    
    }
}
