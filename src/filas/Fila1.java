public class Fila1 {
    protected int capacidade;
    protected int tamanho;
    protected int primeiro;
    protected int ultimo;
    protected int[] fila;

    public Fila1(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.primeiro = 0;
        this.ultimo = -1;
        this.fila = new int[capacidade];
    }

    public void enfileirar(int elemento){
        if(tamanho == capacidade){
            System.out.println("A fila está cheia");
        } else{
            tamanho++;
            ultimo = (ultimo+1) % capacidade;
            fila[ultimo] = elemento;
        }
    }

    public void desenfileirar(){
        if(tamanho == 0){
            System.out.println("A fila está vazia.");
        } else{
            tamanho--;
            primeiro = (primeiro+1) % capacidade;
        }
    }

    public void Exibirfila(){
        if(tamanho == 0){
            System.out.println("A fila está vazia.");
        } else{
            for(int i = 0; i < tamanho; i++){
                System.out.print(fila[primeiro+i]+"  ");
            }
            System.out.println();
        }
    }

    public void exibirPrimeiro(){
        System.out.println("O primeiro elemento da fila é "+fila[primeiro]);
    }

    public void exibirUltimo(){
        System.out.println("O ultimo elemento é "+fila[ultimo]);
    }
}
