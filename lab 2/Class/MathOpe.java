package Class;
public class MathOpe {
    /*
        Operations Math:
        +  = addition
        -  = subtraction
        *  = multiplication
        /  = division
        %  = module
    */
    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 20;
        int valorC = 5;
        int valorD = 8;

        int resultado = valorA + valorB + valorC + valorD;  // 10+20+5+8
        int resultado2 = valorA + (valorC - (valorB / valorA));
        System.out.println(resultado);
        System.out.println(resultado2);
 }
}
