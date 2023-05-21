import java.util.Scanner;
public class programa11 {
    public static void main(String[] args){
        int tam, i;
        double nota, soma=0, media;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("digite a quantidade de notas que quer inserir: ");
            tam = reader.nextInt();

            for(i=1; i<=tam; i++){
                System.out.print(i+"º nota: ");
                nota = reader.nextDouble();
                soma += nota;
            }

            media = soma/tam;
            System.out.print("A media do aluno foi: ");
            System.out.print(String.format("%.2f", media));
        }
    }
}
