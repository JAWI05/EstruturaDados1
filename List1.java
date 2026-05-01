import java.util.List;
import java.util.ArrayList;
public class List1 {
    public static void main(String[] args){
        int i = 0;
        int numero = 10;
        boolean encontrar = false;
        int[] list = new int[7];
        list[0] = 8;
        list[1] = 12;
        list[2] = 5;
        list[3] = 7;
        list[4] = 14;
        list[5] = 19;
        list[6] = 21;

        while(i<7 && !encontrar){
            if(list[i] == numero){
                encontrar = true;
                System.out.println("A posição do número "+numero+" é "+(i+1));
            }
            i++;
        }

        if(!encontrar){
            System.out.println("O número "+numero+" não está na lista.");
        }
    }
}
