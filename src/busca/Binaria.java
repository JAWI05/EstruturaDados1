
public class Binaria {
    public static void main(String[] args){

        int[] list = new int[10];
        list[0] = 0;
        list[1] = 2;
        list[2] = 4;
        list[3] = 6;
        list[4] = 8;
        list[5] = 10;
        list[6] = 12;
        list[7] = 14;
        list[8] = 16;
        list[9] = 18;

        boolean encontra = true;
        int numero = 14;
        int i = (list.length)/2;

        while(encontra){
            if(list[i] > numero){
                i = (int)i/2;
            } else{
                i = (int)((i+ list.length)/2);
            }
            if(list[i] == numero){
                encontra = false;
            }
        }
        System.out.println("A posição do "+numero+" é "+(i+1));
    }
}
