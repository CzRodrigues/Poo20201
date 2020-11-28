package questao3;

import java.util.ArrayList;
import java.util.Collections;

public class Produto implements Comparable<Produto> {
    private final String nome;
    private int preco;

    
    public Produto(int preco, String nome) {
    	this.nome=nome;
    	this.preco=preco;
    }
    //funcao que cordena todo o funcioanamento da lista
    
   public void go() {
	   //instanciamento dos objetos a serem inseridos na lista
	   //para o estudo sao fixados os produtos porem pode ser feito um parametro de imput para tipos Produto
	   Produto produto2=new Produto("Carne",20);
	   Produto produto3=new Produto("Arroz",15);
	   Produto produto4=new Produto("Feijao",10);
	   //criancao da lista
	   ArrayList<Produto> compras = new ArrayList<>();
	    //adicao dos objetos na lista 
	   compras.add(produto2);
	   compras.add(produto3);
	   compras.add(produto4);
	   compras.toString();
	   //metodo que organiza a lista em funcao do preço
	  Collections.sort(compras);
	   System.out.println(compras); 
	   
   }
    
    //Overrride do metodo compareTo que serve para estabelecer oq sera usado como parametro para organizar a lista
    @Override public int compareTo(Produto outroProduto) {
    if(this.preco > outroProduto.getPreco()) {
    	return -1;	
    }if(this.preco< outroProduto.getPreco()){
        return 1;    	
    }
    return 0;
    }
    public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Produto(String nome,int preco){
        this.nome = nome;
        this.preco =preco;
    }

    public String getNome(){
        return nome;
    }

    
    }

