public class Escola {
 public static void main(String[] args){
    Aluno aluno = new Aluno();
    aluno.setNome("Douglas Marcelo");
    aluno.setidade(48);
    aluno.setTurma("Engenharia de Software");

    Professor professor = new Professor();
    professor.setNome(" PAULO ROBERTO RIBEIRO DE MACEDO");
    professor.setidade(38);
    professor.setDisciplina("Programação Orientada à Objetos");

    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Carlos Drummont");
    funcionario.setidade(69);
    funcionario.setCargo("Diretor Tutor");

    aluno.apresentar();
    professor.apresentar();
    funcionario.apresentar();

 }
}
