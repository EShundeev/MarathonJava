package day4;
// С клавиатуры вводится число n - размер массива.
// Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
// Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//         а) Длине массива
//         б) Количестве чисел больше 8
//         в) Количестве чисел равных 1
//         г) Количестве четных чисел
//         д) Количестве нечетных чисел
//         е) Сумме всех элементов массива
//
//         Пример:
//         Введено число 10. Сгенерирован следующий массив:
//         [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//         Информация о массиве:
//         Длина массива: 10
//         Количество чисел больше 8: 1
//         Количество чисел равных 1: 0
//         Количество четных чисел: 6
//         Количество нечетных чисел: 4
//         Сумма всех элементов массива: 46

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = scanner.nextInt();
        int [] arrays = new int [n];

        for(int i = 0; i<arrays.length; i++){
            arrays [i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arrays));

        int num = 0;
        for(int i = 0; i< arrays.length; i++){
            if (arrays[i]>8){
                num++;
            }
        }
        System.out.println("количество чисел больше восьми: " + num);

        int num2 = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i]<1){
                num2++;
            }
        }
        System.out.println("Количество чисел равных одному: " + num2);

        int num3 = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i]%2==0){
                num3++;
            }
        }
        System.out.println("Количество четных чисел: " + num3);

        int num4 = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i]%2!=0){
                num4++;
            }
        }
        System.out.println("Количество нечетных чисел: " + num4);

        int sum = 0;
        for(int i = 0; i < arrays.length; i++){
            sum = sum + i;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
