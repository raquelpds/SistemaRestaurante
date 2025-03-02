package Model;

public class Administrador extends Usuario {

   private String cargo;

   //chamar o construtor da classe mãe:
    public Administrador(){
        super();
    }

    public Administrador(int id, String nome,String senha, String cargo){
        super(id,nome,senha);
        this.cargo = cargo;
    }

    //get e set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    @Override
    public void exibirInformacoes() {
        System.out.println("Administrador: " + nome + ", Cargo: " + cargo);
    }
}
