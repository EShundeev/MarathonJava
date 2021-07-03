package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrays = new int[12][8];

        Random rand = new Random();

        for(int i = 0; i< arrays.length; i++){
            for(int j = 0; j<arrays[i].length; j++){
                arrays[i][j] = rand.nextInt(50);
            }
        }

        int maxValue = 0;
        int index = 0;
        for (int i = 0; i< arrays.length; i++){
            int sum = 0;
            for (int j = 0; j<arrays[i].length; j++){
                sum += arrays[i][j];
            }
            if(sum>=maxValue){
                maxValue = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
