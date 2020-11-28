public class Professor extends Funcionario {
    //Professor também juntamente como Diretor é uma subclasse de uma sublasse
    //nesse caso é uma sublasse da subclasse Funcionario, e é "neta" e folha também
    private String materia;
    private int salario;

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public void aumentoSalario(int aum){
        this.salario +=aum ;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
//métodos getters e setters

    public String toString(){
        return "Professor(a) " + nome + " de " + materia + " , idade = " + idade + " anos , sexo = " + sexo + ", salario = " + salario;

    }
}
