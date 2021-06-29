package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        for(int i = 0; i < 5; i++){
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();

        if (value2 == 0){
            System.out.println("Деление на 0");
            continue;
        }
        result=value1/value2;
            System.out.println(result);
        }
    }
}
