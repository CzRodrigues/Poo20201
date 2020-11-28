package questao2;

import java.util.Random;
//aqui tem um exemplo de herenca em que o aluno herda os atributos de pessoa por meio da palavra reservada "extends"
public class Aluno extends Pessoa{
	private int matricula;
	private boolean matriculado;
	private Random random =new Random();
	//instanciamento de um objeto da classe StatusMatricula para agração;
	private StatusMatricula status;
	/*  
	 * O encapsulamento para essa classe funciona de maneira diferente pois ele manipula os metodos getter e setter 
	 * para terem um funcionamento especifico no codigo.
	 * */

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula() {
		this.matricula = random.nextInt(100);
	}



	public boolean isMatriculado() {
		return matriculado;
	}


    /* agrecação de classes
     * instanciando um objeto da classe statusmatricula 
     * e usando ele dentro da classe aluno para verificar
     * se a matricula esta aprovada.
     * conhecido como agregação.
     * 
     * */
	public void setMatriculado() {
		status.setAprovada(this.idade);
		this.matriculado = true;
	}




	public Aluno(int idade,String nome) {
		super(nome,idade);
		
		
		
	}

	
	
	
}
