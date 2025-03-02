package Model;

public abstract class Usuario {
    protected int id;
    protected String nome;
    protected String senha;

    public Usuario(){
        //construtor
    }

    public Usuario(int id, String nome, String senha){
        this.id =id;
        this.nome = nome;
        this.senha = senha;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Métodos da Classe:

    //login
    //logout

    // Metodo abstrato que as classes filhas devem implementar
    public abstract void exibirInformacoes();

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome;
    }
}
