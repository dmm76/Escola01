public class Pessoa {
    private String nome;
    private int idade;

    //getter para nome
    public String getNome(){
        return nome;
    }

    //setter para nome
    public void setNome(String nome){
        this.nome = nome;
    }

    //getter para idade
    public int getIdade(){
        return idade;
    }

    //setter para idade
    public void setidade(int idade){
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: "+ nome + ", Idade: " + idade);
    }
}

