import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite um numero maior ou igual a 0 para calcular o fibonacci ou menor que 0 para sair: ");
        int num;
        
        while((num = reader.nextInt()) >= 0){
            int anterior = 0;
            int proximo = 1;
            int soma = 0;
            for(int i=0; i<num; i++){
                soma = anterior + proximo;
                System.out.println((i+1)+"º Fibonacci =>"+anterior+" + "+proximo+" = "+soma);
                anterior = proximo;
                proximo = soma;
            }
            System.out.println("\033[32mFibonacci de "+num+": "+anterior+"\033[0m");
            System.out.print("Digite um numero maior ou igual a 0 para calcular o fibonacci ou menor que 0 para sair: ");
        }
        reader.close();
    }
}
