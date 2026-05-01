import java.util.List;
import java.util.ArrayList;
public class AplicativoRestaurante {
    private List<Produto>produtos;
    private List<Pedido> pedidos;
    private List<Funcionario> funcionarios;

    public void exibirMenu() {
        for (Produto produto:produtos) {
            System.out.println(produto.getNome() + " -------- " + produto.getPreco());
        }
    }
    public void processarPedido(Pedido pedido) {
        for (Produto produto : pedido.getProdutos()) {
            if (produto.getEstoque() == 0) {
                System.out.println("Produto indisponível: " + produto.getNome());
                return;
            }
        }
        pedido.calcularTotal();
        confirmarPagamento(pedido);
        pedidos.add(pedido);
    }
    public void confirmarPagamento(Pedido pedido){
        System.out.println("Status do Pedido: " + pedido.getStatus());
    }
    public void verificarStatusPedido(Pedido pedido){
        System.out.println("Status: "+pedido.getStatus());
    }
    public void gerenciarEstoque(Funcionario funcionario, Produto produto, int quantidade) {
        funcionario.atualizarEstoque(produto, quantidade);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
