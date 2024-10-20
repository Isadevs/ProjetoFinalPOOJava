import java.io.Serializable;

public abstract class Produto implements Serializable {
    protected String nome;
    protected double preco;
    protected String referencia;
    protected String validade;

    public Produto(String nome, double preco, String referencia, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.referencia = referencia;
        this.validade = validade;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public abstract String getInfo();
}
