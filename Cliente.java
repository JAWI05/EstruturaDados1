import java.util.ArrayList;
import java.util.List;
public class Cliente {
    protected String nome;
    protected String contato;
    protected String endereco;
    protected List<Pedido>pedidos;

    public Cliente(String nome, String contato, String endereco, List<Pedido> pedidos) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void visualizarHistorico(){
        for(Pedido pedido:pedidos){
            pedido.gerarResumo();
        }
    }
    public void atualizarDados(String contato, String endereco) {
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
