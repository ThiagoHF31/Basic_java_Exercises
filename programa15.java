import java.util.Scanner;
class programa15{
    //função criada para calcular o volume
    public static double calculaVolume(double r){
        double v = (4*Math.PI*Math.pow(r,3)) / 3;
        return v;
    }

    //começo do codigo 
    public static void main(String[] args){

    //declaração das variáveis
    double raio, volume;

    //solicitação dos valores
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite o raio da esfera (em metros): ");
    raio = reader.nextDouble();

    //cálculo do volume
    volume =calculaVolume(raio);    //invocação da função

    //(saida)
    String valorFormatado = String.format("%.2f", volume);
    System.out.println("\nVolume da esfera = "+valorFormatado);
    reader.close();
    }
}
    

