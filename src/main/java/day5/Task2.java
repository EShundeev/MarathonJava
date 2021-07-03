package day5;
/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.

 */

public class Task2 {
    public static void main(String[] args) {
    Motorbike newMoto = new Motorbike(2010, "red", "Ducati");
        System.out.println(newMoto.getYearsOld() + ", " + newMoto.getColor() + ", " + newMoto.getModel());
    }
}
class Motorbike{
    private int yearsOld;
    private String color;
    private String model;

    public Motorbike(int yearsOld, String color, String model){
        this.yearsOld = yearsOld;
        this.color = color;
        this.model = model;
    }
    public int getYearsOld(){
        return yearsOld;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}