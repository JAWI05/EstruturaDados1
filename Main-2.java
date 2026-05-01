//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Fila = ");
        Fila fila1 = new Fila(6);
        fila1.Enfileirar(1);
        fila1.Enfileirar(3);
        fila1.Enfileirar(5);
        fila1.Enfileirar(7);
        fila1.Enfileirar(9);

        fila1.Desfileirar();

        fila1.Enfileirar(11);

        fila1.posicaoPrimeiro();
        fila1.posicaoUltimo();

        fila1.ExibirFila();

        System.out.println();
        System.out.println("Pilha = ");
        Pilha pilha1 = new Pilha(6);
        pilha1.Empilhar(1);
        pilha1.Empilhar(3);
        pilha1.Empilhar(5);
        pilha1.Empilhar(7);
        pilha1.Empilhar(9);

        pilha1.Desempilhar();

        pilha1.Empilhar(11);

        pilha1.posicaoTopo();

        pilha1.ExibirPilha();
    }
}