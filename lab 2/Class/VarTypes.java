package Class;
public class VarTypes {
    
    /*
        Types of Variables:
        byte -- Side:8 --- Min side: -128 --- Max side: 128  Format:0
        byte -- Side:8 --- Min side: -32768 --- Max side: 32768  Format: 0
        byte -- Side:8 --- Min side: -2147483648 --- Max side: 128  Format: 0
        byte -- Side:8 --- Min side: -9223372036854775807 --- Max side: 9223372036854775807  Format: OL
    */

    /*
        Types of Floating Variables:
        float -- Side:32 --- Min side: 1,4 x 10^-45 --- Max side: 3.4 x 10^38  Format:0.Of
        double -- Side:64 --- Min side: 4,9 x 10^-324 --- Max side: 1,7 x 10^308  Format: O.O or O.Od
    */

    public static void main(String[] args){
        byte numeroDeLetrasDoIngles=26;
        short pesEmUmaMilha=5283;
        int milhasParaSol=92960000;
        long dividaNacional=18100000000000L;
        float milhasEmUmaMaratona=26.2f;
        double larguraAtomoEmMetros=0.0000000001d;

        System.out.println(larguraAtomoEmMetros);
        System.out.println(milhasEmUmaMaratona);
        System.out.println(dividaNacional);
        System.out.println(milhasParaSol);
        System.out.println(pesEmUmaMilha);
        System.out.println(numeroDeLetrasDoIngles);
    }

}
