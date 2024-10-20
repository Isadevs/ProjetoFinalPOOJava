public class Refrigerante extends Produto {
    private String tipo; // normal ou sem açúcar
    private String marca;

    public Refrigerante(String nome, double preco, String referencia, String validade, String tipo, String marca) {
        super(nome, preco, referencia, validade);
        this.tipo = tipo;
        this.marca = marca;
    }

    @Override
    public String getInfo() {
        return "Refrigerante [nome=" + nome + ", tipo=" + tipo + ", marca=" + marca + ", preco=" + preco + "]";
    }
}
