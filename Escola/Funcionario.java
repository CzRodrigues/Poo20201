public class Funcionario extends Pessoa {
    //Funcionario é extendido de Pessoa, logo é sua subclasse e "filha"
    protected int salario;

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    //métodos getters e setters
}
