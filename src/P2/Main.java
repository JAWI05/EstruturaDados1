//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista_CadastroAlunos lista = new Lista_CadastroAlunos();
        System.out.println("------Sistema de Cadastro de alunos------");

        lista.CadastrarAluno("Julia", 42817, 8);
        lista.CadastrarAluno("João", 42999, 9);
        lista.CadastrarAluno("André", 50234, 7.2);

        lista.ExibirLista();

        lista.QuantidadeAlunos();
        System.out.println();

        lista.RemoverAluno(42999);

        lista.ExibirLista();
        System.out.println();

        lista.BuscarAluno(42817);

        lista.Verificar_ListaVazia();

        lista.QuantidadeAlunos();

        System.out.println();

        System.out.println("------Fila de Atendimento de lojas------");

        Fila_AtendimentoLoja fila = new Fila_AtendimentoLoja();
        fila.Enfileirar(1234, "Mateus", "12:45");
        fila.Enfileirar(1245, "Kaio", "13:00");
        fila.Enfileirar(1245, "Joao", "13:00");

        fila.ExibirFila();

        fila.Desenfileirar();

        fila.ExibirFila();
        System.out.println();

        fila.AdicionarCliente_Especifico(1, 3424, "Livia", "13:20");

        fila.ExibirFila();

        fila.AdicionarCliente_Especifico(2, 1124, "Luisa", "13:05");

        fila.ExibirFila();

        fila.AdicionarCliente_Especifico(3, 1124, "Pedro", "13:10");

        fila.ExibirFila();
        System.out.println();

        fila.RemoverCliente_especifico(4);

        fila.ExibirFila();

        fila.ProximoCliente();
        System.out.println();

        fila.Verificar_FilaVazia();
        fila.ExibirFila();
        fila.Quantidade_Clientes();
        System.out.println();

        System.out.println("------Histórico de Busca------");

        Pilha_HistoricoDeBusca pilha = new Pilha_HistoricoDeBusca();

        pilha.Adicionar_Pesquisa("Receita de bolo de cenoura.");
        pilha.Adicionar_Pesquisa("Curso básico de inglês");
        pilha.Adicionar_Pesquisa("Vídeo de gatinhos 2025");
        pilha.Adicionar_Pesquisa("gmail.com");
        pilha.Adicionar_Pesquisa("https://www.netflix.com");
        pilha.Adicionar_Pesquisa("Algebra Relacional");
        pilha.Adicionar_Pesquisa("Transformada de Laplace");

        pilha.Exibir_HistoricoDePesquisa();

        System.out.println();
        pilha.Remover_Pesquisa();

        System.out.println();
        pilha.Exibir_HistoricoDePesquisa();
        pilha.Verificar_HistoricoVazio();

        System.out.println();
        pilha.Mostrar_PesquisaAnterior();
        pilha.Remover_PesquisaEspecificaPorTermo("gatinhos");

        System.out.println();
        pilha.Exibir_HistoricoDePesquisa();
        System.out.println();

        pilha.Remover_PesquisaEspecificaNome("Algebra Relacional");
        pilha.Exibir_HistoricoDePesquisa();
    }
}
