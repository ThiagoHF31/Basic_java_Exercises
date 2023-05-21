import java.util.Scanner;
public class programa14 {
    public static void main(String[] args) {
        double media = 0;

        Scanner reader = new Scanner(System.in);
        System.out.print("Digite quantas temperaturas deseja analisar: ");
        int tam = reader.nextInt();

        double[] temperatura = new double [tam];   // inicializando um array

        for(int i=0; i<tam; i++){
            System.out.println("Digite a "+(i+1)+"º temperatura: ");
            temperatura[i]=reader.nextDouble();
        }

        for(int i=0; i<tam; i++){
            media += temperatura[i];
        }
        media /= tam;
        System.out.println("\nA média das temperaturas é : "+media);
        reader.close();
    }
}
