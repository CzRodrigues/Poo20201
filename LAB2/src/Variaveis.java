public class Variaveis {
    public static void main(String[] args) {
        // Inicialização das variáveis
        byte num1 = -24;
        short num2 = -122;
        int num3 = -18351;
        int num4 = 1359;
        long num5 = 18100000000000L;
        
        float num6 = 10.5f;
        float num7 = 5.25f;
        double num8 = 0.0000000001d;

        char letra1 = 'H';
        char letra2 = 'E';
        char letra3 = '\u0059';

        boolean booleano = true;

        // Primeiro print de seus valores tipo "int", "float", "char" e "boolean"
        System.out.println(String.format("%s %s %s %s %s", num1, num2, num3, num4, num5));
        System.out.println(String.format("%s %s %s", num6, num7, num8));
        System.out.println(String.format("%s%s%s", letra1, letra2, letra3));
        System.out.println(booleano);
        
        // Operadores aritméticos 
        int soma = num3 + num4;
        int multiplicacao = num3 * num4;
        float divisao = num6 / num7;
        System.out.println(String.format("Soma: %s \nMultiplicacao: %s \nDivisao: %s", soma, multiplicacao, divisao));

        // Operadores de atribuição composta
        num3 -= num4;
        num6 *= num7;
        System.out.println(String.format("%s %s", num3, num6));

        //Pré-soma e pós-soma
        System.out.println(++soma); // -16991
        System.out.println(soma); // -16991

        System.out.println(divisao--); // 2
        System.out.println(divisao); // 1

        
        








    }
}
