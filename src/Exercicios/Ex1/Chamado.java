public class Chamado {
    int numero;
    String nome_cliente;
    String problema;
    String horario_abert;
    Chamado proximo;

    public Chamado(int numero, String nome_cliente, String problema, String horario_abert) {
        this.numero = numero;
        this.nome_cliente = nome_cliente;
        this.problema = problema;
        this.horario_abert = horario_abert;
        this.proximo = null;
    }
}
