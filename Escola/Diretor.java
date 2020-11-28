public class Diretor extends Funcionario {
    //Diretor é extendido de Funcionario , que é uma subclasse de Pessoa, 
    //então Diretor é uma subclasse da subclasse ("neta"), e é chamado de folha da herança também.
    //Classe pobre pois tem os mesmos atributos de sua "Mãe"
    public void demitirFuncionario(String nome){
        System.out.println("O funcionário" + getNome() + " foi demitido pelo diretor");
    }

    public String toString(){
        return "Diretor(a) " + nome + " , idade = " + idade + " anos , sexo = " + sexo;

    }
}
