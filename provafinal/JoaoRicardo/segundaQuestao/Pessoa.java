package questao2;
//classe abstrata que nao pode ser instanciada
public abstract class Pessoa {
	protected String nome;
	protected int idade;

    public Pessoa(String nome,int idade) {
    	this.idade=idade;
    	this.nome=nome;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
    











}