package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lista compras = new Lista();

        menu(compras);
        
    }

    private static void menu(Lista compras){
        int opcao = 0;
        Scanner i = new Scanner(System.in);

        do{
            System.out.println("\n ------------MENU------------");
            System.out.println("-1- Adicionar Item a lista");
            System.out.println("-2- Ordenar lista alfabeticamente");
            System.out.println("-3- Exibir lista");
            System.out.println("-0- Sair");
            System.out.println("----------------------------\n");

            System.out.println("Informe a opcao desejada: ");
            opcao = i.nextInt();
            switch(opcao){
                case 1:
                    compras.adcProd();
                    break;
                case 2:
                    compras.ordemAlfab();
                    break;
                case 3:
                    compras.exibirLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao Inválida");
                    break;
            }
        }while (opcao != 0);
    }
}