public class TiposDePrint {
    public static void main(String[] args){
       
        float nota = 8.4444f;
        String nome = "thiago";

        System.out.println("TIPOS DE PRINT");
        System.out.println();
        System.out.printf("A nota é: %.2f", nota);  //printa de forma formatada
        System.out.println();
        System.out.format("A nota de %s é %.2f", nome, nota);     //mesma coisa do printf so que escrito com format

        System.out.println("A nota é: "+nota);      //printa e pula de linha

        System.out.print("A nota é: "+nota);          // não pula de linha
        
        
    }
}