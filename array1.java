public class array1 {
    public static void main(String[] args) {
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("Tamanho do Array: " + carros.length);
        System.out.println("Primeiro carro: " + carros[0]);
        System.out.println("Último carro: " + carros[carros.length - 1]);
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

    }
}
