public class Funcionario extends Pessoa{
    private String cargo;

    //getters and setter cargo
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    @Override

    public void apresentar(){
        System.out.println("Funcionario: "+getNome() + ", Idade: "+ getIdade() + ", Cargo: " + getCargo());
    }
}
