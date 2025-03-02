package Model;

public class Garcom extends Usuario{

    private String setor;

    public Garcom(){
        super();
    }

    public Garcom(int id, String nome, String senha, String setor){
        super();
        this.setor = setor;
    }

    //get e set
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //Metodos
    @Override
    public void exibirInformacoes() {
        System.out.println("Garçom: " + nome + ", Setor: " + setor);
    }
}
