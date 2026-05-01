import java.util.ArrayList;
import java.util.List;
public class List3 {
    public static void main(String[] args){
        int[] lista = new int[10];
        boolean encontrar = false;
        int i = 0;
        lista[0] = 2;
        lista[1] = 5;
        lista[2] = 8;
        lista[3] = 11;
        lista[4] = 14;
        lista[5] = 17;
        lista[6] = 20;

        lista[7] = 23;

        while(i<10 && !encontrar){
            if(lista[i] == 23){
                encontrar = true;
            }
            i++;
        }
        System.out.println("O numero 23 está na posição "+i);

        int ind = 0;
        encontrar = false;
        while(ind<10 && !encontrar){
            if(lista[ind] == 8){
                encontrar = true;
            }
            ind++;
        }
        System.out.println("O numero 8 está na posição "+ind);

    }
}
