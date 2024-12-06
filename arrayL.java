import java.util.ArrayList;

public class arrayL {
    public static void main(String[] args) {
        ArrayList<String> contatos =new ArrayList<>();
        contatos.add("Rafael");
        contatos.add("9999-9999");
        contatos.add("rafael@gmail.com");
        contatos.add("Ana Maria");
        contatos.add("8888-8888");
        contatos.add("ana@gmail.com");

        System.out.println("Tamanho do ArrayList: " + contatos.size());
        System.out.println("Primeiro contato: " + contatos.get(0));
        System.out.println(contatos);
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i));
        }
    }
}
