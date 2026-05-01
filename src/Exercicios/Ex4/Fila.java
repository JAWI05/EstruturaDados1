public class Fila {
    protected int capacidade;
    protected int tamanho;
    protected int primeiro;
    protected int ultimo;
    protected int[] fila;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.primeiro = 0;
        this.ultimo = -1;
        this.fila = new int[capacidade];
    }

    public void Enfileirar(int elemento){
        if(tamanho == capacidade){
            System.out.println("A fila está cheia.");
        } else{
            tamanho++;
            ultimo = (ultimo+1) % capacidade;
            fila[ultimo] = elemento;
        }
    }

    public void Desfileirar(){
        if(tamanho == 0){
            System.out.println("A lista está vazia.");
        } else{
            tamanho--;
            primeiro = (primeiro+1) % capacidade;
        }
    }

    public void posicaoPrimeiro(){
        if(tamanho == 0){
            System.out.println("A fila está vazia.");
        } else{
            System.out.println("O primeiro elemento é "+fila[primeiro]);
        }
    }

    public void posicaoUltimo(){
        if(tamanho == 0){
            System.out.println("A fila está vazia");
        } else{
            System.out.println("O ultimo elemento é "+fila[ultimo]);
        }
    }

    public void ExibirFila(){
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
        } else{
            for(int i = 0; i < tamanho; i++){
                System.out.print(fila[primeiro+i % capacidade]+"  ");
            }
        }
        System.out.println();
    }
}
