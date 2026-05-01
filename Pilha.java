public class Pilha {
    protected int capacidade;
    protected int tamanho;
    protected int topo;
    protected int[] pilha;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.topo = -1;
        this.pilha = new int[capacidade];
    }

    public void Empilhar(int elemento){
        if(tamanho == capacidade){
            System.out.println("A pilha está cheia.");
        } else{
            topo++;
            tamanho++;
            pilha[topo] = elemento;
        }
    }

    public void Desempilhar(){
        if(tamanho == 0){
            System.out.println("A pilha está vazia.");
        } else {
            topo--;
            tamanho--;
        }
    }

    public void posicaoTopo(){
        if(tamanho == 0){
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A posição do topo é "+pilha[topo]);
        }
    }

    public void ExibirPilha(){
        if(tamanho == capacidade){
            System.out.println("A pilha está cheia.");
        } else {
            for(int i = 0; i < tamanho; i++){
                System.out.print(pilha[i]+"  ");
            }
        }
    }
}
