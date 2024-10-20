public class Chocolate extends Produto {
    private String tipoCacau; // negro, branco ou leite
    private String marca;

    public Chocolate(String nome, double preco, String referencia, String validade, String tipoCacau, String marca) {
        super(nome, preco, referencia, validade);
        this.tipoCacau = tipoCacau;
        this.marca = marca;
    }

    @Override
    public String getInfo() {
        return "Chocolate [nome=" + nome + ", tipoCacau=" + tipoCacau + ", marca=" + marca + ", preco=" + preco + "]";
    }
}
