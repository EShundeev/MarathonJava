package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] array = new int[100];


        for (int i = 0; i< array.length; i++){
            array[i]= rand.nextInt(10000);
        }

        int maxSumm = 0;
        int index = 0;
        for (int i = 0; i<array.length - 2; i++){
            int sum = 0;
            for (int j = i; j < i + 3; j++){
                sum+=array[j];
            }
            if (sum>maxSumm){
                maxSumm=sum;
                index = i;
            }
        }
        System.out.println(maxSumm);
        System.out.println(index);
    }
}
