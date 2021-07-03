package day4;

import java.util.Arrays;
import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

 */
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];

        for (int i = 0; i< array.length; i++){
            array[i]= rand.nextInt(10000);
        }


        int maxValue = 0;
        for (int element:array) {
            if (element>maxValue){
            maxValue = element;
        }
        }
        System.out.println("Наибольший элемент массива: " + maxValue);

        int minValue = 10000;
        for(int element:array){
            if(element<minValue){
                minValue = element;
            }
        }
        System.out.println("Наименьший элемент массива: " + minValue);

        int num0 = 0;
        for(int element:array){
            if(element%10==0){
                num0++;
            }
        }
        System.out.println("Количество элементов, оканчивающихся н 0: " + num0);

        int sum = 0;
        for (int element:array){
            if(element%10==0){
                sum += element;
            }
        }
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sum);
    }
}
