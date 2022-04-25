import src.ClienteBancario;

public class Teste {
    
    public static void main (String[] args) {
        ClienteBancario banc = new ClienteBancario("Luiz");

        banc.setNif(298909383);

        System.out.println("Cliente: " 
            + banc.getNomeCliente() 
            + " NIF: "
            + banc.getNif());
    }
}
