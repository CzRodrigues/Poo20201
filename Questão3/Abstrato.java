
/*
    Podemos escrever que as classes abstratas servem como modelos para outras classes que viram a herdar dessa mesma class, entretanto
    é necessario criar uma classe mais especializada herdando dela e instanciando nessa nova classes
*/
abstract class Abstrato {

    private String nome;
    public abstract void emitirSom();
    public abstract void pedindoComida();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
