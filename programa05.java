import java.util.Scanner;

public class programa05 {
    public static void main(String[] args){
        double n1, n2, media, trabalho;
        
        System.out.println("Bem vindo ao calculador de nota!");

        System.out.print("Digite a nota Prova 1: ");
        Scanner reader = new Scanner(System.in);
        n1 = reader.nextDouble();

        System.out.print("Digite nota Prova 2: ");
        //reader = new Scanner(System.in);
        n2 = reader.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        //reader = new Scanner(System.in);
        trabalho = reader.nextDouble();

        //calculo da media e condições de aprovação
        media = (n1*0.3)+(n2*0.5)+(trabalho*0.2);
        System.out.println("____________________________________ ");
        System.out.println("Média do aluno foi de: "+media);
        System.out.println("Situação: ");

        if(media >= 6){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
        reader.close();
    }  
}
