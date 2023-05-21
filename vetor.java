import java.util.Scanner;
public class vetor {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Quantos numeros deseja analisar? ");
        int tam = reader.nextInt();

        int[] numeros = new int[tam];

        for(int i=0; i<tam; i++){
            System.out.print("digite seu numero: ");
            numeros[i] = reader.nextInt();
        }
       
        int maior = numeros[0];

        for(int i=0; i<tam; i++){

            if(numeros[i]>maior){
                maior = numeros[i];
            }
        }
        
        System.out.println("_____________________________");
        System.out.println("Os numeros digitados foram: ");

        for(int i=0; i<tam; i++){
            System.out.print("\033[35m"+numeros[i]+" ");
        }
        System.out.println("\n\033[0mO maior numero é: "+maior);
        reader.close();
    }
}
