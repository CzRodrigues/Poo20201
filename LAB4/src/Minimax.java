import java.util.Random;
import java.util.Scanner;

public class Minimax {
    public static void main(String[] args) {
        int[][] valores = new int[3][3];
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int op = 0;
        
        for(int i = 0; i < valores.length; i++) {
            for(int j = 0; j < valores.length; j++) {
                valores[i][j] = r.nextInt(20);
                System.out.println(valores[i][j]);
            }
        }
        
        while(op != 3) {
            System.out.println("=====MENU=====\n");
            System.out.println("1- MINIMAX\n");
            System.out.println("2- MAXMINI\n");
            System.out.println("3- Sair\n");
            op = in.nextInt();
            switch(op) {
                case 1:
                    int maiorElem = 0;
                    int miniMax = 21;
                    int row = 0;
                    int miniMaxRow = 0;
                    int miniMaxColumn = 0;
                    for(int i = 0; i < valores.length; i++) {
                        for(int j = 0; j < valores.length; j++) {
                            if(valores[i][j] > maiorElem) {
                                maiorElem = valores[i][j];
                                row = i;
                            }
                        }
                    }
                    for(int j = 0; j < valores.length; j++) {
                        if(valores[row][j] < miniMax) {
                            miniMax = valores[row][j];
                            miniMaxRow = row + 1;
                            miniMaxColumn = j + 1;
                        }
                    }
                    System.out.println(String.format("O menor elemento da linha do maior elemento da matriz eh: %d\nSua coluna: %d\nSua linha: %d", miniMax, miniMaxColumn, miniMaxRow));
                    break;
                case 2:
                    int menorElem = 21;
                    int maxMini = 0;
                    int row1 = 0;
                    int maxMinirow = 0;
                    int maxMiniColumn = 0;
                    for(int i = 0; i < valores.length; i++) {
                        for (int j = 0; j < valores.length; j++) {
                            if(valores[i][j] < menorElem) {
                                menorElem = valores[i][j];
                                row1 = i;
                            }
                        }
                    }
                    for(int j = 0; j < valores.length; j++) {
                        if(valores[row1][j] > maxMini) {
                            maxMini = valores[row1][j];
                            maxMinirow = row1 + 1;
                            maxMiniColumn = j + 1;
                        }
                    }
                    System.out.println(String.format("O maior elemento da linha do menor elemento da matriz eh: %d\nSua coluna: %d\nSua linha: %d", maxMini, maxMiniColumn, maxMinirow));
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Por favor, digite uma opcao valida");
                    break;
                }
            }
            in.close();
        }
    }
