public class Main {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setIdade(19);
        a1.setSexo("Masculino");
        System.out.println(a1.toString());

        Aluno a2 = new Aluno();
        a2.setNome("Cezar");
        a2.setIdade(20);
        a2.setSexo("Masculino");
        System.out.println(a2.toString());

        Aluno a3 = new Aluno();
        a3.setNome("Julia");
        a3.setIdade(17);
        a3.setSexo("Feminino");
        System.out.println(a3.toString());

        Diretor d1 = new Diretor();
        d1.setNome("Vidigal");
        d1.setIdade(28);
        d1.setSexo("Masculino");
        System.out.println(d1.toString());

        Professor p1 = new Professor();
        p1.setNome("Rebeca");
        p1.setIdade(27);
        p1.setSexo("Feminino");
        p1.setMateria("Geografia");
        p1.setSalario(2000);
        System.out.println(p1.toString());

        Professor p2 = new Professor();
        p2.setNome("Lukas");
        p2.setIdade(29);
        p2.setSexo("Masculino");
        p2.setMateria("Matematica");
        p2.setSalario(2600);
        System.out.println(p2.toString());

        d1.demitirFuncionario("Rebeca");
        p2.aumentoSalario(900);
        a3.cancelarMatricula();
        System.out.println(d1.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(p2.toString());
        //Override em toString()



    }
}
