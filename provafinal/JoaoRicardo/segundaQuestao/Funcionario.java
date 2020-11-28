package questao2;
//herenca
public class Funcionario extends Pessoa {
	String profissao;
	int salario;
	  //herenca do construtor
	public Funcionario(String nome,int idade,String profissao,int salario) {
		super(nome,idade);
		this.salario=salario;
		this.profissao=profissao;	
		
	}

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
