import java.util.ArrayList;
import java.util.List;
public class Funcionario {
    protected String nome;
    protected String cargo;
    private enum permissao{
        ATUALIZAR_ESTOQUE, MUDAR_STATUS_PEDIDO, GERAR_RELATORIO
    }
    protected permissao permissoes;
    protected List<Pedido> pedidos;

    public Funcionario(String nome, String cargo, permissao permissoes, List<Pedido> pedidos) {
        this.nome = nome;
        this.cargo = cargo;
        this.permissoes = permissoes;
        this.pedidos = pedidos;
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        if (permissoes == permissao.ATUALIZAR_ESTOQUE) {
            produto.setEstoque(quantidade);
        }
    }
    public void mudarStatusPedido(Pedido pedido, String novoStatus){
        if (permissoes == permissao.MUDAR_STATUS_PEDIDO) {
            pedido.atualizarStatus(novoStatus);
        }
    }
    public void gerarRelatorio(){
        if (permissoes == permissao.GERAR_RELATORIO) {
            for(Pedido pedido:pedidos){
                pedido.gerarResumo();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public permissao getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(permissao permissoes) {
        this.permissoes = permissoes;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}