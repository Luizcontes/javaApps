import src.ClienteBancario;
import src.ContaPoupanca;

public class Teste {
    
    public static void main (String[] args) {
        ClienteBancario banc = new ContaPoupanca("Luiz");

        banc.setNif(298909383);

        System.out.println("Cliente: " 
            + banc.getNomeCliente() 
            + " NIF: "
            + banc.getNif());
    }
}
