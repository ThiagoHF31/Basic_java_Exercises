import java.util.Scanner;
public class programa13 {
    public static void main(String[] args){
        // declaração das variaveis
        char sinal;
        double oper1, oper2, resultado=0;

        // obetenção dos valores (ENTRADA)
        Scanner reader = new Scanner(System.in);
        System.out.println("Operadores: ");
        System.out.println("\n[ + ] \n[ - ] \n[ * ] \n[ / ]");
        System.out.println("digite o caracter da operação: ");
        sinal = reader.next().charAt(0);  // obtem apenas o primeiro caracter

        //validação da entrada
        while(sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/'){
            System.out.println("Operador invalido! Digite novamente: ");
            System.out.println("\n[ + ] \n[ - ] \n[ * ] \n[ / ]");
            System.out.println("digite o caracter da operação: ");
            sinal = reader.next().charAt(0);
        }

        System.out.println("Digite o operando 1: ");
        oper1 = reader.nextDouble();
        System.out.println("Digite o operando 2: ");
        oper2 = reader.nextDouble();

        while(sinal == '/' && oper2 == 0){  //tentativa de divisão por zero
            System.out.println("\nDIVISÃO POR ZERO!");
            System.out.println("Digite o operando 2 novamente: ");
            oper2 = reader.nextDouble();
        }

        //calculo da operação(PROCESSAMENO)
        switch(sinal){
            case '+':
                resultado = oper1 + oper2;
                break;
            case '-':    
                resultado = oper1 - oper2;
                break;
            case '*':
                resultado = oper1 * oper2;
                break;
            case '/':
                resultado = oper1 / oper2;
                break;
        }

        // exibição do resultado(SAIDA)
        System.out.println("\n"+oper1+" "+sinal+" "+oper2+" = "+resultado);
        reader.close();
    }
}