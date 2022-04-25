package src;

public class ClienteBancario {
    private String nomeCliente;
    private int nif;

    public ClienteBancario(String nome) {
        this.nomeCliente = nome;
    }

    public ClienteBancario() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getNif() {
        return nif;
    }
       
}
