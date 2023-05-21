
public class OperadorTernario{
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 3;
        int r = (n1>n2)?0:1;        // depois da "?" e como se fosse o if, se a primeira opção estiver certa vai aparecer o primerio resultado se não ":"  o segundo
        System.out.println(r);
    
        int num1 = 5;
        int num2 = 3;
        int num3 = 2;
        boolean R;
        R = (num1 > num2 || num2 > num3) ? true: false;
        System.out.println(R);

    }
}