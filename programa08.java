import java.util.Scanner;
public class programa08 {
    public static void main(String[] args){
        double valor;

        System.out.print("Valor do produto: ");
        Scanner reader = new Scanner(System.in);
        valor = reader.nextDouble();

        valor -= (valor *0.12); 
        System.out.println("O valor com desconto é: R$"+valor);
        reader.close();
    }
}
