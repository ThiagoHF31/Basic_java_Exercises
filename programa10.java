import java.util.Scanner;
public class programa10 {
    public static void main(String[] args){
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        num = reader.nextInt();

        while(num < 0){
            System.out.println("Numero negativo digite novamente! ");
            System.out.println("_______________________");
            System.out.print("\ndigite um numero inteiro: ");
            num = reader.nextInt();
        }
        System.out.print("Numero positivo digitado: "+num);
        reader.close();
    }
}
