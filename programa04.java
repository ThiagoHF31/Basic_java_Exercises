import java.util.Scanner;
public class programa04 {
    public static void main(String[] args){

        float valor, desconto, valor_final;

        System.out.print("digite o valor do produto: ");
        Scanner reader = new Scanner(System.in);
        valor = reader.nextFloat();

        System.out.print("digite o desconto (em %): ");
        desconto = reader.nextFloat();

        //calculo do desconto
        valor_final = valor - (valor*(desconto/100));

        System.out.println("\nValor com desconto: R$ "+valor_final);
        reader.close();
    }
    
}
