public class Aluno extends Pessoa {
  //Aluno é extendido de Pessoa, logo é uma subclasse dela e também chamada de "filha"
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula de " + nome + " foi cancelada");
    }
    
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
//Métodos getters e setters
    public String toString(){
        return "Aluno(a) " + nome + " , idade = " + idade + " anos , sexo = " + sexo;

    }
}
