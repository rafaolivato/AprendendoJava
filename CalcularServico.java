import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularServico {
    
    public static void main(String[] args) {
        double hora, remuneracao, custo,cargaHoraria;

        Scanner Teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");  

        System.out.println("______________Calculo de Serviço______________");

        System.out.println("Digite: Remuneração pretendida ");
        remuneracao = Teclado.nextDouble(); 

        System.out.println("Digite: custo operacional mensal ");
        custo = Teclado.nextDouble();

        System.out.println("Digite: Carga horária mensal ");
        cargaHoraria = Teclado.nextDouble();

        hora =(remuneracao + (remuneracao *0.3) +custo +(remuneracao) *0.2)/cargaHoraria;
        
        System.out.println("Valor da hora: " + formatador.format(hora));
    
        Teclado.close();
    }
}
