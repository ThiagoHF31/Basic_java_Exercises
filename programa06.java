import java.util.Scanner;
public class programa06 {
    public static void main(String[] args){
        //declaração de variaveis
        int idade, par;

        //ENTRADA
        System.out.print("Digite sua idade: ");
        try (Scanner reader = new Scanner(System.in)) {
            idade = reader.nextInt();
        }
        
        //PROCESSAMENTO E SAIDA
        if(idade>=18){
            System.out.println("Maior de idade!");
        }
        else{
            System.out.println("Menor de idade!");
        }

        par = idade%2;
        if(par==0){
            System.out.println("Sua idade é par");
        }
        else{
            System.out.println("Sua idade é impar!");
        }
    }     
}