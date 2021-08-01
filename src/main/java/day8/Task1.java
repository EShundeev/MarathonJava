package day8;
/*
Создать строку, состоящую из чисел от 0 до 20000.
Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
 */

public class Task1 {
    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();
//
//        String string0_20000 = "";
//
//        for(int i = 0; i<=20000; i++){
//            string0_20000 += i + " ";
//        }
//        System.out.println(string0_20000);
//
//        long finishTime = System.currentTimeMillis();
//        long endTime = finishTime - startTime;
//
//        System.out.println("Время выполнения: " + endTime);

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb0_20000 = new StringBuilder("");

        for(int i = 0; i<=20000; i++){
            sb0_20000.append(i).append(" ");
        }
        System.out.println(sb0_20000.toString());
        long finishTime2 = System.currentTimeMillis();
        long endTime2 = finishTime2 - startTime2;

        System.out.println("Время выполнения: " + endTime2);
    }
}
