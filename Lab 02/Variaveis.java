//Aluno: Lukas de Menezes Pereira

public class Variaveis {
    public static void main(String[] args) {

	//------------Nomeando variaveis------------

		int z;
		int nota;
		int CPF;
		int numeroTelefone;

	//------------Usando variaveis------------

		int valor;
		valor = 80;
		System.out.println(valor); // 80

		int valor2 = 300;
		System.out.println(valor2); // 300

		valor2 = valor; // valor2 recebe 80
		valor = 150; // valor recebe 150

		System.out.println(valor); // 150
		System.out.println(valor2); // 80

	//------------Tipos de dados------------
		//Inteiro:	
		byte tipoByte = 64;
		short tipoShort = 2345;
		int tipoInt = 567200000;
		long tipoLong = 6398000000000000L;

		//Ponto flutuante:
		float tipoFLoat = 32.5f;
		double tipoDouble = 0.000087d;

		//Carecteres:
		char tipoChar = 'C';

		//Booleano:
		boolean tipoBooleano = false;

	//------------Tipos Primitivos------------
		int x= 500;
		int y= x;
		x= 250;

		System.out.println(String.format("%s, %s", x, y)); // 250, 500

	//------------Operadores pré-fixados e pós-fixados------------
		//Pré-fixado:
		x = 10;
		System.out.println(--x); // 9
		System.out.println(x); //9

		//Pós-fixado:
		x= 10;
		System.out.println(x--); // 10
		System.out.println(x); // 9
	
	//------------Operadores de atribuição composta------------
		x = 100;
		x += 50;
		System.out.println(x); // 150

		z = 20;
		System.out.println(z); // 20
	
		x = 100;
		y = 10;
		z *= x / y; // 100 / 10 = 10 -> 20 * 10 = 200
		System.out.println(z); // 200
	}

}
