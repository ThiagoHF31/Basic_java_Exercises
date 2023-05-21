import java.util.Scanner;

public class programa07{
    public static void main(String[] args){
        double calorias;

        System.out.print("Quantas qualorias você ingere por dia? ");
        Scanner reader = new Scanner(System.in);
        calorias = reader.nextDouble();

        if(calorias>=1200 && calorias<=1900){
            System.out.println("Está dentro da faixa!");
        }
        else{
            System.out.println("Está fora da faixa segura!");
        }
        reader.close();
    }
}