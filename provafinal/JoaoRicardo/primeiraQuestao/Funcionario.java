package questao1;
//funcionario é uma subclasse de pessoa que por herenca herda todos os seus metodos e atributos;
public class Funcionario extends Pessoa {
	String profissao;
	int salario;
	    
	public Funcionario(String nome,int idade,String profissao,int salario) {
		super(nome,idade);
		this.salario=salario;
		this.profissao=profissao;
		
	}

	
	//encapsulamento.
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	

}
