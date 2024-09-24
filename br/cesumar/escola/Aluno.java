public class Aluno extends Pessoa {
    private String turma;

    //getters and setter for turma
    public void setTurma(String turma){
        this.turma = turma;
    }

    public String getTurma(){
        return this.turma;
    }

    @Override
    public void apresentar(){
        System.out.println("Aluno: " + getNome() + ", Idade: "+ getIdade() + ", Turma: " + getTurma());
    }
}
