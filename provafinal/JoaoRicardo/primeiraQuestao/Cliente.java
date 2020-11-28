package questao1;


/* 
 * Cliente é uma classe filha de funcionario que por sua vez e filha da classe abstrata pessoa,
 * dessa forma herdando todos os seus atributos e metos 
 * caso de herenca, alem disso ela ainda implementa a interface Acoes.
 * */
public class Cliente  extends Funcionario implements Acoes{
	
	
	public Cliente(String nome,int idade,String profissao,int salario){
	super(nome,idade,profissao,salario);
	}
	
	//aqui é feita a implementacao dos metodos da interface Acoe descrevendo o seu funcionamento.
	public void pagar() {
		System.out.print("o cliente pagou");
	}
	
   public void receber() {
	   System.out.print("o cliente recebeu o produto");
	  
   }
}
