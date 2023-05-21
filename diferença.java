import java.util.Scanner;
public class diferença {
    public static void main(String[] args){
        int a, b, c, d, resultado;
        Scanner reader = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        a = reader.nextInt();

        System.out.print("digite um numero inteiro: ");
        b = reader.nextInt();

        System.out.print("digite um numero inteiro: ");
        c = reader.nextInt();

        System.out.print("digite um numero inteiro: ");
        d = reader.nextInt();

        resultado = (a*b) - (c*d);

        System.out.print("A diferença é:"+resultado);
        reader.close();
    }
}
