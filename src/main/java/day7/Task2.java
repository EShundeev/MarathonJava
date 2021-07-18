package day7;

import java.util.Random;

/*
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

и следующие методы:
run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от количества игроков на поле.
Если игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.

Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет генерировать случайные числа.
Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные числа от 90 до 100. Вызвать метод info().
При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.

*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.

 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randStaminaValue = random.nextInt(11 + 1) + 90;

        Player player1 = new Player(randStaminaValue);
        Player player2 = new Player(randStaminaValue);
        Player player3 = new Player(randStaminaValue);

        Player.info();

        Player player4 = new Player(randStaminaValue);
        Player player5 = new Player(randStaminaValue);
        Player player6 = new Player(randStaminaValue);

        Player.info();

        Player player7 = new Player(randStaminaValue);

        Player.info();

        for(int i = 0; i<101; i++){
            player3.run();
        }
        Player.info();
    }
}
class Player{
    private int stamina;
    private final static int  MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayers<6){
            countPlayers++;
        }
    }

    public int getStamina(){
        return this.stamina;
    }
    public int getCountPlayers(){
        return countPlayers;
    }
     public void run(){
        if(stamina == 0){
            return;
        }
         stamina--;

        if(stamina == 0){
            countPlayers--;
        }
     }

    public static void info(){
        int point;
        if(countPlayers<6){
            point = 6-countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + point + " свободных мест");
        }
        else{
            System.out.println("На поле нет свободных мест");
        }
    }
}