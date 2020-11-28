/*
    Aqui chamamos a class que vai ser extendida da classe Abstrato, vale resaltar que a Class Abstrata necessita dessa public class para funcionar
    Pois, os metodos devem ser sobrescritos

*/
public class Classes extends Abstrato {
    
    public Classes(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Saindo som");
    }

    @Override
    public void pedindoComida() {
        System.out.println("Estou com fome!");

    }


    
}
