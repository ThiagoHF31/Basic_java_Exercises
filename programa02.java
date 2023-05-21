import java.util.Scanner;

public class programa02 {
    public static void main(String[] args){
        // criação das variáveis
        String nome;
        int idade;
        char sexo;
        String profissao;
        double salario;

        // solicitação dos valores(ENTRADA)
        Scanner reader = new Scanner(System.in);
        System.out.println("digite os seus dados.");

        //solicitação do nome
        System.out.print("Nome: ");
        nome = reader.nextLine();           // Lê um texto


        // solicitação da idade
        System.out.print("Idade: ");
        reader = new Scanner(System.in);    //Reinicializando o objeto Scanner
        idade = reader.nextInt();
        

        // solicitação do sexo
        System.out.print("Sexo: ");
        reader = new Scanner(System.in);
        sexo = reader.next().charAt(0);         // Lê apenas a primeira letra de um texto

        // Solicitação da profissão
        System.out.print("Profissão: ");
        reader = new Scanner(System.in);
        profissao = reader.nextLine();

        // solicitação do salario
        System.out.print("Salário: ");
        reader = new Scanner(System.in);
        salario = reader.nextDouble();          // Lê um valor tipo double

        // exibição na tela(SAIDA)
        System.out.println("\nOla, "+nome+". Segue a baixo os seus dado.");
        System.out.println("idade: "+idade+ " anos");
        System.out.println("Sexo: "+sexo);
        System.out.println("Profissão: "+profissao);
        System.out.println("salario: R$ "+salario);
    }
}