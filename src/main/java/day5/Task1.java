package day5;
/*
Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */

public class Task1 {
    public static void main(String[] args) {
    Car newCar = new Car();
    newCar.setYearsOld(2015);
    newCar.setColor("Black");
    newCar.setModel("BMW");
        System.out.println(newCar.getYearsOld() + ", " + newCar.getColor() + ", " + newCar.getModel());
    }
}
class Car{
    private int yearsOld;
    private String color;
    private String model;

    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public int getYearsOld(){
        return yearsOld;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

}