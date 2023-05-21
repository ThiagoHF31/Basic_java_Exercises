import java.util.Scanner;
import java.util.Arrays;
public class CalculadoraInteligente {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int diminuir=0;
        double Soma = 0, Mutipli=1, Dividir=0;
        System.out.println();
        System.out.println("____________________________________");
        System.out.println();
        System.out.println("Bem Vindo a Calculadora Do Thiago!");
        System.out.println();
        System.out.println("____________________________________");
        System.out.println();


        int sair = 1;
        while(sair != 0){
            System.out.println("digite o numero de uma das operações abaixo:");
            System.out.println("[1] Somar\n[2] diminuir\n[3] Multiplicar\n[4] Dividir\n[5] Potência\n[6] Raiz Quadrada\n[7] Resto da divisão");
            int opc = reader.nextInt();
            System.out.println();


            if(opc == 1){
                // CRIA O VETOR DO TAMANHO DESEJADO
                System.out.print("digite quantos numeros você deseja usar: ");
                int tam = reader.nextInt();
                int [] Vetor = new int[tam];
                
                //COLOCA OS VALORES DENTRO DO VETOR
                for(int i=0; i<tam; i++){
                    System.out.print((i+1)+"º número: ");
                    Vetor[i]=reader.nextInt();
                }
                System.out.println("____________________________________");
                System.out.println();

                //FAZ A OPERAÇÃO DESEJADA
                for(int i=0; i<tam; i++){
                    Soma += Vetor[i];
                }
                
                System.out.println("A soma dos numeros digitados é: "+Soma);

                //ZERA O VETOR PRA RECEBER NOVOS VALORES

                Soma=0;
                Arrays.fill(Vetor, 0);
                System.out.println(Vetor.length);            

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();

            }

            else if(opc == 2){
                //CRIA O VETOR NO TAMANHO DIGITADO
                System.out.print("digite quantos numeros você deseja usar: ");
                int tam = reader.nextInt();
                int [] Vetor = new int[tam];

                // COLOCAR VALORES DENTRO DO VETOR
                System.out.print("1º número: ");
                int num1 = reader.nextInt();

                for(int i=1; i<tam; i++){
                    System.out.print((i+1)+"º número: ");
                    Vetor[i]=reader.nextInt();
                }
                System.out.println("____________________________________");
                System.out.println();

                // FAZ A OPERAÇÃO DESEJADA E EXIBE NA TELA
                diminuir = num1;
                for(int i=1; i<tam; i++){
                    diminuir -= Vetor[i];
                }
                System.out.println("A Sublitação dos numeros vale: "+diminuir);
                System.out.println();

                // RESETA AS VARIAVEIS E VETORES
                Arrays.fill(Vetor, 0);
                num1=0;
                diminuir=0;

                // CONDIÇÃO DE SAIDA DO LAÇO
                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }

            else if(opc == 3){
                //CRIA O VETOR NO TAMANHO DIGITADO 
                System.out.print("digite quantos numeros você deseja usar: ");
                int tam = reader.nextInt();
                int [] Vetor = new int[tam];

                // COLOCA OS VALORES NO VETOR
                for(int i=0; i<tam; i++){
                    System.out.print((i+1)+"º número: ");
                    Vetor[i]=reader.nextInt();
                }
                System.out.println("____________________________________");
                System.out.println();

                // FAZ A OPERAÇÃO DIGITADA
                for(int i=0; i<tam; i++){
                    Mutipli *= Vetor[i]; 
                }
                System.out.println("A multiplicação dos numeros vale: "+Mutipli);
                System.out.println();

                //  ZERA AS VARIAVEIS
                Arrays.fill(Vetor, 0);
                Mutipli = 0;

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }

            else if(opc==4){
                //CRIA UM VETOR DO TAMANHO DESEJADO
                System.out.print("digite quantos numeros você deseja usar: ");
                int tam = reader.nextInt();
                int [] Vetor = new int[tam];

                // ATRIBUI VALOR AO VETOR
                System.out.print("1º número: ");
                int num2 = reader.nextInt();

                for(int i=1; i<tam; i++){
                    System.out.print((i+1)+"º número: ");
                    Vetor[i]=reader.nextInt();
                }
                System.out.println("____________________________________");
                System.out.println();

                //FAZ A OPERÇÃO DESEJADA
                Dividir = num2;
                for(int i=1; i<tam;i++){
                    Dividir /= Vetor[i];
                }
                System.out.println("A divisão dos números vale: "+Dividir);
                System.out.println();

                //ZERA AS VARIAVEIS 
                Arrays.fill(Vetor, 0);
                num2 = 0;
                Dividir = 0;

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }
            else if(opc == 5){
                System.out.println("____________________________________");
                System.out.print("Digite a base: ");
                double base = reader.nextDouble();
                System.out.print("Digite a potência: ");
                int pote = reader.nextInt();

                // CACULA A POTENCIA E EXIBE
                double Resutaldo = Math.pow(base, pote);
                System.out.println("O Resultado é: "+Resutaldo);
                System.out.println();

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }
            else if(opc == 6){
                System.out.println("____________________________________");
                System.out.print("Digite o numero para analisar a raiz: ");
                double raiz = reader.nextDouble();

                //CALCULA A RAIZ QUADRADA E EXIBE
                double resultado = Math.sqrt(raiz);
                System.out.println("A raiz quadrada é: "+resultado);
                System.out.println();

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }
            else if(opc == 7){
                System.out.print("1º número: ");
                float n1 = reader.nextFloat();
                System.out.print("2º número: ");
                float n2 = reader.nextFloat();

                //CALCULA O RESTO DA DIVISÃO E EXIBE
                float resto = n1%n2;
                System.out.println("O resto da divisão é: "+resto);
                System.out.println();

                System.out.println("deseja continuar? [1] Continua [0] Sair");
                sair = reader.nextInt();
            }
        }
        reader.close();
    }
}
