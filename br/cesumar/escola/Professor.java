public class Professor extends Pessoa{
    private String disciplina;

    //getters and setter from disciplina

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    @Override

    public void apresentar(){
        System.out.println("Professor: "+ getNome() + ", Idade: "+ getIdade() + ", Disciplina: "+ getDisciplina() );
    }
}   
