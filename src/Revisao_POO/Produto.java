import java.util.ArrayList;
import java.util.List;
public class Produto {
    protected String nome;
    protected float preco;
    protected categoria categoriaProduto;
    public enum categoria{
        Entrada, PratoPrincipal, Bebida, Sobremesa
    }
    protected int estoque;
    protected List<String> ingredientes;
    protected List<String> opcionais;

    public Produto(String nome, float preco, categoria categoriaProduto, int estoque, List<String> ingredientes, List<String> opcionais) {
        this.nome = nome;
        this.preco = preco;
        this.categoriaProduto = categoriaProduto;
        this.estoque = estoque;
        this.ingredientes = (opcionais != null) ? opcionais : new ArrayList<>();
        this.opcionais = (opcionais != null) ? opcionais : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }
}
