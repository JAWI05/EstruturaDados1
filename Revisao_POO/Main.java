import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<String>ingredientes = new ArrayList<>();
        ingredientes.add("Queijo");
        ingredientes.add("Salada");
        List<String>opcionais = new ArrayList<>();
        opcionais.add("Adicionar Queijo extra");

        Produto produto = new Produto("Burgeur Ninja", 40.90f, Produto.categoria.PratoPrincipal, 5, ingredientes, opcionais);

        List<Produto>produtos = new ArrayList<>();
        produtos.add(produto);
    }
}
