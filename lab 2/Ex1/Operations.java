package Ex1;

public class Operations {
    
    public static void main(String[] args){
        SayInf();
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 10;
        int nota4 = 9;

        int total = nota1 + nota2 + nota3 + nota4;
        
        int media  =  (total/4);

        System.out.println(media);

    }   


public static void SayInf(){
    System.out.println("Neste exemplo ultilizaremos as operações logicas para calcular a media de um aluno em uma escola");
    System.out.println("Valores: Nota1:7 Nota2:8 Nota3:10 Nota4:9");
    System.out.println("-------------------Calculo da Media-------------------------------");
    System.out.println("Total = Soma de todos os valores, divido pelo numero de valores no Total"); 
}

}