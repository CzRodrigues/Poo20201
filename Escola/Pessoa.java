abstract class Pessoa{
    //Aqui se inicia uma classe abstrata na qual 
    //vai servir como "Mãe" das outras classes pela herança
    protected String nome;
    protected int idade;
    protected String sexo;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

//métodos getters e setters
}