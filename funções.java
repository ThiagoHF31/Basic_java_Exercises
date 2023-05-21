public class funções {

    //FUNÇÃO QUE NÃO RETORNA VALOR
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: "+s);
    }

    //FUNÇÃO QUE RETORNA VALOR 
        static int Subli(int a, int b){
            int su = a - b;
            return su;
        }

        // FUNÇÃO QUE FAZ UM CONTADOR
        static String contador(int a, int f){
            String s = "";
            for (int i = 0; i <= f; i++) {
                s += i + " ";
            }
            return s;
        }

        
    public static void main(String [] args){
        //chamada da soma
        soma(5, 2);

        //chamada da sublitação
        int menos = Subli(8, 6);
        System.out.println("A sublitação vale: "+menos);

        //chamada do contador
        System.out.println(contador(1, 5));

    }
}
