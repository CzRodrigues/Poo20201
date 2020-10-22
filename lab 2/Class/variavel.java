package Class;
public class variavel {
/*
     Explaing how to use correctly variables 
*/
public static void main(String[]args){
        int variavel2;
        //System.out.println(variavel2);            Pops up = Error!
        variavel2=50;
        System.out.println(variavel2);              // Pops up = 50
        int outraVariavel=100;
        System.out.println(outraVariavel);          // Pops up = 100
        variavel2=outraVariavel;
        System.out.println(variavel2);              // Pops up = 100
        outraVariavel=200;
        System.out.println(outraVariavel);          // Pops up = 200
        System.out.println(variavel2);              // Pops up = 100
}   
}