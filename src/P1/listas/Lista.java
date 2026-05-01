public class Lista {
    public static void main(String[] args){
        int i = 0;
        boolean encontrar = true;
        int[] list = new int[20];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        list[6] = 7;
        list[7] = 8;
        list[8] = 9;
        list[9] = 10;
        list[10] = 11;
        list[11] = 12;
        list[12] = 13;
        list[13] = 14;
        list[14] = 15;
        list[15] = 16;
        list[16] = 17;
        list[17] = 18;
        list[18] = 19;
        list[19] = 20;

        while(i<20 && encontrar){
            if(list[i] == 2){
                encontrar = false;
                System.out.println("A posição do número 2 é "+(i+1));
            }
            i++;
        }

    }
}
