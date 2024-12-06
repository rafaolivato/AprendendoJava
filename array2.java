public class array2 {
    public static void main(String[] args) {
        String[][] agenda={{"Rafael","9999-9999","farmaceutico"},
        {"Ana Maria","8888-8888","medica"},
        {"Joao","7777-7777","engenheiro"}};
        
        System.out.println("Nome: "+agenda[0][0]);

        System.out.println("Telefone: "+agenda[0][1]);

        //percorre os indices do array2

        for(int i=0;i<agenda.length;i++){
            for(int j=0;j<agenda[i].length;j++){
                System.out.println(agenda[i][j]);
            }
        }

    }
}
