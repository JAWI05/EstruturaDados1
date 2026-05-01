//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------  Sistema de chamados  --------");
        System.out.println();
        Fila_Sistema_Chamado fila = new Fila_Sistema_Chamado();

        fila.Adicionar_Chamado(1234, "Maria", "A temperatura está acima do normal.", "10:45");
        fila.Adicionar_Chamado(1908, "Mateus", "Os computadores não estão conectando.", "13:40");
        fila.Adicionar_Chamado(8907, "Livia", "Sistema Travado.", "14:45");

        fila.Exibir_fila();

        System.out.println();
        fila.Atender_Chamado();

        fila.Quant_Chamados();

        fila.Consultar_primeiro();

        fila.Fila_Vazia();

        System.out.println();
        System.out.println("--------  Histórico de Navegações  --------");
        System.out.println();
        Pilha_Navegacao_App pilha = new Pilha_Navegacao_App();

        pilha.Adicionar_Pagina("Inicio da jornada.");
        pilha.Adicionar_Pagina("Melhores encantamentos Minecraft");
        pilha.Adicionar_Pagina("Escova para gatos");
        pilha.Adicionar_Pagina("termo");
        pilha.Adicionar_Pagina("Quebra-cabeças");

        pilha.Historico_Navegacao();

        System.out.println();
        pilha.Pagina_Anterior();

        pilha.Remover_Atual();

        System.out.println();

        pilha.Historico_Navegacao();

        System.out.println();
        pilha.Verificar_Hist_vazio();
    }
}
