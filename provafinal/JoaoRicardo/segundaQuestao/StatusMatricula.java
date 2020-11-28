package questao2;

public class StatusMatricula {
	private boolean aprovada;

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(int idade) {
		if (idade >= 3) {
			this.aprovada = true;
			System.out.println("Matricula aprovada");
		}else {
			System.out.print("Idade insuficiente para matricula");
		}

	}

}
