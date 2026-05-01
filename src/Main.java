//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Pilha1 =");
        Pilha1 pilha1 = new Pilha1(15);
        pilha1.empilhar(1);
        pilha1.empilhar(3);
        pilha1.empilhar(5);
        pilha1.empilhar(7);
        pilha1.empilhar(9);
        pilha1.empilhar(11);
        pilha1.empilhar(13);
        pilha1.empilhar(15);
        pilha1.empilhar(17);
        pilha1.empilhar(19);

        pilha1.exibirPilha();

        pilha1.desempilhar();
        pilha1.desempilhar();

        pilha1.exibirPilha();

        pilha1.empilhar(21);
        pilha1.empilhar(23);

        pilha1.exibirPilha();

        System.out.println();
        System.out.println("Pilha2 =");
        Pilha1 pilha2 = new Pilha1(15);
        pilha2.empilhar(10);
        pilha2.empilhar(20);
        pilha2.empilhar(30);
        pilha2.empilhar(40);
        pilha2.empilhar(50);
        pilha2.empilhar(60);
        pilha2.empilhar(70);
        pilha2.empilhar(80);
        pilha2.empilhar(90);
        pilha2.empilhar(100);

        pilha2.exibirPilha();

        pilha2.desempilhar();
        pilha2.desempilhar();
        pilha2.desempilhar();

        pilha2.exibirPilha();

        pilha2.empilhar(110);
        pilha2.empilhar(120);

        pilha2.exibirPilha();

        System.out.println();
        System.out.println("Pilha3 = ");
        Pilha1 pilha3 = new Pilha1(15);
        pilha3.empilhar(2);
        pilha3.empilhar(4);
        pilha3.empilhar(6);
        pilha3.empilhar(8);
        pilha3.empilhar(10);
        pilha3.empilhar(12);
        pilha3.empilhar(14);
        pilha3.empilhar(16);
        pilha3.empilhar(18);
        pilha3.empilhar(20);

        pilha3.exibirPilha();

        pilha3.desempilhar();

        pilha3.exibirPilha();

        pilha3.empilhar(22);
        pilha3.empilhar(24);

        pilha3.exibirPilha();

        System.out.println();
        System.out.println("Pilha4 = ");
        Pilha1 pilha4 = new Pilha1(15);
        pilha4.empilhar(5);
        pilha4.empilhar(10);
        pilha4.empilhar(15);
        pilha4.empilhar(20);
        pilha4.empilhar(25);
        pilha4.empilhar(30);
        pilha4.empilhar(35);
        pilha4.empilhar(40);
        pilha4.empilhar(45);
        pilha4.empilhar(50);

        pilha4.exibirPilha();
        pilha4.Topo();

        pilha4.desempilhar();
        pilha4.desempilhar();

        pilha4.empilhar(55);
        pilha4.empilhar(60);

        pilha4.exibirPilha();

        System.out.println();
        System.out.println("Fila1 = ");
        Fila1 fila1 = new Fila1(15);
        fila1.enfileirar(1);
        fila1.enfileirar(3);
        fila1.enfileirar(5);
        fila1.enfileirar(7);
        fila1.enfileirar(9);
        fila1.enfileirar(11);
        fila1.enfileirar(13);
        fila1.enfileirar(15);
        fila1.enfileirar(17);
        fila1.enfileirar(19);

        fila1.Exibirfila();

        fila1.desenfileirar();
        fila1.desenfileirar();

        fila1.Exibirfila();

        fila1.enfileirar(21);

        fila1.Exibirfila();

        System.out.println();
        System.out.println("Fila2 = ");
        Fila1 fila2 = new Fila1(15);
        fila2.enfileirar(10);
        fila2.enfileirar(20);
        fila2.enfileirar(30);
        fila2.enfileirar(40);
        fila2.enfileirar(50);
        fila2.enfileirar(60);
        fila2.enfileirar(70);
        fila2.enfileirar(80);
        fila2.enfileirar(90);
        fila2.enfileirar(100);

        fila2.Exibirfila();

        fila2.desenfileirar();
        fila2.desenfileirar();
        fila2.desenfileirar();

        fila2.Exibirfila();

        fila2.enfileirar(110);
        fila2.enfileirar(120);

        fila2.Exibirfila();

        System.out.println();
        System.out.println("Fila3 = ");
        Fila1 fila3 = new Fila1(15);
        fila3.enfileirar(2);
        fila3.enfileirar(4);
        fila3.enfileirar(6);
        fila3.enfileirar(8);
        fila3.enfileirar(10);
        fila3.enfileirar(12);
        fila3.enfileirar(14);
        fila3.enfileirar(16);
        fila3.enfileirar(18);
        fila3.enfileirar(20);

        fila3.Exibirfila();

        fila3.desenfileirar();

        fila3.Exibirfila();

        fila3.enfileirar(22);

        fila3.Exibirfila();

        fila3.exibirPrimeiro();
        fila3.exibirUltimo();

        System.out.println();
        System.out.println("Fila4 = ");
        Fila1 fila4 = new Fila1(15);
        fila4.enfileirar(5);
        fila4.enfileirar(10);
        fila4.enfileirar(15);
        fila4.enfileirar(20);
        fila4.enfileirar(25);
        fila4.enfileirar(30);
        fila4.enfileirar(35);
        fila4.enfileirar(40);
        fila4.enfileirar(45);
        fila4.enfileirar(50);

        fila4.exibirPrimeiro();

        fila4.Exibirfila();

        fila4.desenfileirar();
        fila4.desenfileirar();

        fila4.Exibirfila();

        fila4.enfileirar(55);
        fila4.enfileirar(60);

        fila4.Exibirfila();
     }
}
