package day6;
/*В классах Автомобиль и Мотоцикл реализуйте два метода:

  void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),

  int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
  и возвращает разницу между переданным годом и годом выпуска транспортного средства
  (возвращаться должно всегда положительное число).

  В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла,
  проверьте работу каждого метода.
*/

public class Task1 {
    public static void main(String[] args) {
        Motorbike newMoto = new Motorbike(2010, "blue", "Suzuki");
        newMoto.info();
        System.out.println(newMoto.yearDifference(2000));

        Car newCar = new Car();
        newCar.setYearsOld(2010);
        newCar.setColor("red");
        newCar.setModel("Jeep");
        newCar.info();
        System.out.println(newCar.yearDifference(2021));
    }
}
     class Motorbike {

        private int yearsOld;
        private String color;
        private String model;

        public Motorbike(int yearsOld, String color, String model) {
            this.yearsOld = yearsOld;
            this.color = color;
            this.model = model;
        }

        public int getYearsOld() {
            return yearsOld;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public void info() {
            System.out.println("Это мотоцикл");
        }

        public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearsOld);
        }
}

     class Car {
        private int yearsOld;
        private String color;
        private String model;

        public void setYearsOld(int yearsOld) {
            this.yearsOld = yearsOld;
        }

        public int getYearsOld() {
            return yearsOld;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public void info() {
            System.out.println("Это автомобиль");
        }

        public int yearDifference(int inputYear) {
            return Math.abs(inputYear - yearsOld);
            }
        }

