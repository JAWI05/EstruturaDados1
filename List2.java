import java.util.List;
import java.util.ArrayList;
public class List2 {
    public static void main(String[] args){
        int[] list = new int[7];
        boolean encontrar = false;
        int indice = 0;
        int i = 0;
        list[0] = 1;
        list[1] = 4;
        list[2] = 7;
        list[3] = 10;
        list[4] = 13;
        list[5] = 16;
        list[6] = 19;

        while(indice<7 && !encontrar){
            if(list[indice] == 10){
                // remove elemento 10
                list[indice] = 0;
                encontrar = true;
            }
            indice++;
        }

        encontrar = false;
        while(i<7 && !encontrar){
            if(list[i] == 10){
                encontrar = true;
            }
            i++;
        }

        if(!encontrar){
            System.out.println("O elemento 10 não está na lista.");
        } else{
            System.out.println("O elemento 10 está na lista.");
        }
    }
}
