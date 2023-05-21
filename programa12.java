// calculadora simples usando switch. (thiago)

import java.util.Scanner;
public class programa12 {
    public static void main(String[] args){
        int num, num1, num2, calculo;
        Scanner reader = new Scanner(System.in);
        System.out.println("CALCULADORA EM JAVA");
        System.out.println("________________________");
        System.out.print("escolha a operação que deseja fazer: ");
        System.out.println("\n[1] Soma\n[2] Sublitação\n[3] Multiplicação\n[4] divisão");
        num = reader.nextInt();

        switch(num){
            case 1:
                System.out.print("digite o primerio numero: ");
                num1 = reader.nextInt();
                System.out.print("digite o segundo numero: ");
                num2 = reader.nextInt();
                calculo = num1 + num2;
                System.out.println("A soma dos valores é: "+calculo);
                break;
            case 2:
                System.out.print("digite o primerio numero: ");
                num1 = reader.nextInt();
                System.out.print("digite o segundo numero: ");
                num2 = reader.nextInt();
                calculo = num1 - num2;
                System.out.println("A sublitação dos valores é: "+calculo);
                break;
            case 3: 
                System.out.print("digite o primerio numero: ");
                num1 = reader.nextInt();
                System.out.print("digite o segundo numero: ");
                num2 = reader.nextInt();
                calculo = num1 * num2;
                System.out.println("A multiplicação dos valores é: "+calculo);
                break;
            default:
                System.out.print("digite o primerio numero: ");
                num1 = reader.nextInt();
                System.out.print("digite o segundo numero: ");
                num2 = reader.nextInt();
                calculo = num1 / num2;
                System.out.println("A divisão dos valores é: "+calculo);
            }
            reader.close();
        } 
    }
