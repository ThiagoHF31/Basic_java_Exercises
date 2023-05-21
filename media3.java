import java.util.Scanner;
public class media3 {
    public static void main(String[] args){
        double n1, n2, n3, n4, peso, notaexame, mediaexame;

        Scanner reader = new Scanner(System.in);
        System.out.print("nota 1: ");
        n1 = reader.nextDouble();

        System.out.print("nota 2: ");
        n2 = reader.nextDouble();

        System.out.print("nota 3: ");
        n3 = reader.nextDouble();
        
        System.out.print("nota 4: ");
        n4 = reader.nextDouble();

        peso = (n1*0.2 + n2*0.3 + n3*0.4 + n4*0.1);

        System.out.println(String.format("%.2f", peso));

        if(peso>=7){
            System.out.println("Aluno aprovado!");
        }

        else if(peso >= 5 && peso<=6.9){
            System.out.println("Aluno em exame.");
            System.out.println("____________________");

            System.out.print("Nota do exame: ");
            //reader = new Scanner(System.in);
            notaexame = reader.nextDouble();

            mediaexame = (notaexame + peso)/2;

            if(mediaexame >= 5){
                System.out.println("Aluno aprovado no exame!");
            }
            else{
                System.out.println("Aluno reprovado em exame!");
            }
        }
        else{
            System.out.println("Aluno reprovado!");   
        }

        reader.close();
    }
    
}
