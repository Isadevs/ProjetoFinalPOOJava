public class Sande extends Produto {
    private String tipoSande; // mista, fiambre, queijo
    private String produtor;

    public Sande(String nome, double preco, String referencia, String validade, String tipoSande, String produtor) {
        super(nome, preco, referencia, validade);
        this.tipoSande = tipoSande;
        this.produtor = produtor;
    }

    @Override
    public String getInfo() {
        return "Sande [nome=" + nome + ", tipoSande=" + tipoSande + ", produtor=" + produtor + ", preco=" + preco + "]";
    }
}
