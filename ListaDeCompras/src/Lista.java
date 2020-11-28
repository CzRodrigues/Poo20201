package src;
import java.util.*;

public class Lista {
    private List<String> compras = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public Lista(){

    }

    public List<String> getLista(){
        return this.compras;
    }

    public void adcProd (){
        System.out.println("Produto que deseja inserir: ");
        String novoProduto = s.nextLine();
        if(verificarProduto(novoProduto))
            System.out.println("Produto repetido!\n");
        else
            this.compras.add(novoProduto);
    }

    public boolean verificarProduto(String produto){
        return this.compras.contains(produto);
    }

    public void ordemAlfab(){
        Collections.sort(this.compras);
    }

    public void exibirLista(){
        System.out.println("Lista de Compras:");
        for (int i = 0; i < this.compras.size(); i++){
            System.out.println(this.compras.get(i));
        }
    }
}
