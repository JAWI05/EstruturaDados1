public class Lista {
    public static void main(String[] args){
        int[] lista = new int[10];
        int i = 0;
        lista[0] = 5;
        lista[1] = 3;
        lista[2] = 6;
        lista[3] = 7;
        lista[4] = 14;
        lista[5] = 17;
        lista[6] = 21;

        int buscar = 14;

        while(i < 10){
            if(lista[i] == buscar){
                break;
            }
            i++;
        }
        System.out.println("O elemento "+buscar+" está na posição "+(i+1)+", no índice "+i);
    }
}
