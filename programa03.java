import java.util.Scanner;

public class programa03 {
    public static void main(String[] args){
        //declaração das variaveis
        float n1, n2, n3, n4, media;
        
        //Recebendo as notas
        Scanner reader = new Scanner(System.in);
        System.out.print("nota 1: ");
        n1 = reader.nextFloat();

        //reader = new Scanner(System.in);
        System.out.print("nota 2: ");
        n2 = reader.nextFloat();

       //reader = new Scanner(System.in);
        System.out.print("nota 3: ");
        n3 = reader.nextFloat();

        //reader = new Scanner(System.in);
        System.out.print("nota 4: ");
        n4 = reader.nextFloat();

        //Calcular a media
        media = (n1 + n2+ n3 + n4)/4;
        
        //Exibe a media
        System.out.println("\nA média do aluno é: "+media);
        reader.close();
    }
}
