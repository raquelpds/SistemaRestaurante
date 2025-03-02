package Model;

public class Mesa {
    private int id_mesa;
    private int numero;
    private int capacidade;
    private boolean ocupada;

    public Mesa(){
        //construtor vazio;
    }

    //construtor
    public Mesa(int capacidade, int id_mesa, int numero, boolean ocupada) {
        this.capacidade = capacidade;
        this.id_mesa = id_mesa;
        this.numero = numero;
        this.ocupada = ocupada;
    }

    //getters e setters


    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return ocupada;
    }

    public void setStatus(boolean status) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + (ocupada ? " (Ocupada)" : " (Livre)");
    }
}
