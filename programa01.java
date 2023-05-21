import java.util.Scanner;
public class programa01{
    
    public static void main(String[] args){

        System.out.println("Digite o seu nome: "); // comando de saida padrão do java!
        String user; // local que armazena um nome

        try (Scanner reader = new Scanner(System.in)) {
            user = reader.nextLine();           // entrada padrão. captura oqeu foi digitado pelo usuario no teclado
        }
        System.out.println("ola, " + user + ". Seja Bem-vindo");

    }
}