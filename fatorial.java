import java.util.Scanner;
public class fatorial{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("digite um numero que queira o fatorial [ou um mum menor que 0 para sair]:  ");
        int num;
        while((num = reader.nextInt()) >= 0){
            int prod = 1;
            if(num == 0 || num == 1){
                System.out.println("Fatorial de "+num+": "+prod);
            }
            else{
                for(int i =2; i<=num;i++){
                    prod *= i;
                }
                System.out.println("Fatorial de "+num+": "+prod);
            }
            System.out.print("digite um numero que queira o fatorial [ou um mum menor que 0 para sair]:  ");
        }
        reader.close();
    }
}