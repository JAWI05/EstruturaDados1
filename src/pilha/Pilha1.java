public class Pilha1 {
    protected int capacidade;
    protected int tamanho;
    protected int topo;
    protected int[] pilha;

    public Pilha1(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.topo = -1;
        this.pilha = new int[capacidade];
    }

    public void empilhar(int elemento){
        if(tamanho == capacidade){
            System.out.println("A pilha está cheia.");
        } else{
            topo++;
            tamanho++;
            pilha[topo] = elemento;
        }
    }

    public void desempilhar(){
        if(tamanho == 0){
            System.out.println("A fila está vazia.");
        } else{
            int elemento = pilha[topo];
            tamanho--;
            topo--;
            System.out.println("O elemento "+elemento+" foi removido.");
        }
    }

    public void exibirPilha(){
        if(tamanho == 0){
            System.out.println("A pilha está vazia.");
        } else{
            for(int i = 0; i <= topo; i++){
                System.out.print(pilha[i]+"  ");
            }
            System.out.println();
        }
    }

    public void Topo(){
        int pri = pilha[topo];
        System.out.println("O topo da pilha é "+pri);
    }
}
