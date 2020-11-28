package questao2;

import java.util.Random;
//por meio da palavra reservada implements se faz o registro que a classe deve implementar os metodos previstos na interface
public class Caixa implements Pagamento{
	private int preco;
	private int troco;
	//encapsulamento
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getTroco() {
		return troco;
	}
	public void setTroco(int troco) {
		this.troco = troco;
	}
	public int getQtdRecebido() {
		return qtdRecebido;
	}
	public void setQtdRecebido(int qtdRecebido) {
		this.qtdRecebido = qtdRecebido;
	}
	private int qtdRecebido;
	Random random = new Random();
	//implementacao da interface
	public void preco() {
		System.out.println("o preco para maiores de 5 é 100 ");
		System.out.println("o preco para menores  de 5 é 75 ");
	}
	//exemplo de overload do metodo mudando apenas suas assinaturas
	public int preco(Aluno a) {
		if(a.getIdade()>5) {
			preco=100;
			return preco;
		}else if((a.getIdade()>3)&&(a.getIdade()<5)) {
			preco=75;
			return preco;
		}
		return preco;	
	}
	//implementacao da interface
	public void pagar(Aluno a) {
	preco=this.preco(a);
	qtdRecebido= random.nextInt(1000);
	System.out.println("o preco é "+preco);
	System.out.println("o cliente pagou "+qtdRecebido);
	System.out.println("o troco foi "+(qtdRecebido - preco));
	}

}
