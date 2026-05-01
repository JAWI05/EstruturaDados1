import java.util.ArrayList;
import java.util.List;
public class Pedido {
    protected List<Produto> produtos;
    protected Cliente cliente;
    protected String status;
    protected double valorTotal;
    protected String formaPagamento;

    public Pedido(List<Produto> produtos, Cliente cliente, String status, double valorTotal, String formaPagamento) {
        this.produtos = (produtos != null) ? produtos : new ArrayList<>();
        this.cliente = cliente;
        this.status = status;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public void calcularTotal(){
        valorTotal = 0;
        for(Produto produto:produtos){
            valorTotal = valorTotal + produto.preco;
        }
    }
    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }
    public void gerarResumo(){
        System.out.println("Resumo do pedido: ");
        for(Produto produto:produtos){
            System.out.println("Produto: "+produto.nome);
            System.out.println("Preço:"+produto.preco);
            System.out.println("Categoria: "+produto.categoriaProduto);
            System.out.println("Quantidade no estoque: "+produto.estoque);
            System.out.println("-------------------------------------------------,");
        }
        System.out.println("Total do pedido: "+valorTotal);
        System.out.println("Status: "+status);
        System.out.println("Método de pagamento: "+formaPagamento);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}