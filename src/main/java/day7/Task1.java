package day7;
/*
В классе Самолет реализовать статический метод compareAirplanes,
который в качестве аргументов принимает два объекта класса Airplane (два самолета)
и выводит сообщение в консоль о том, какой из самолетов длиннее.

 */
public class Task1 {
    public static void main(String[] args) {
    Airplane air11 = new Airplane("Boing", 2010, 30, 10000, 0);
    Airplane air22 = new Airplane("Sesna", 2020, 250, 5000, 0);
    Airplane.compareAirplanes(air11,air22);
    }

    static class Airplane {
        private String producer;
        private int year;
        private int length;
        private int weight;
        private int fuel;

        public Airplane(String producer, int year, int length, int weight, int fuel){
            this.producer = producer;
            this.year = year;
            this.length = length;
            this.weight = weight;
            this.fuel = 0;
        }
        public static void  compareAirplanes(Airplane air1, Airplane air2){
            if(air1.getLength()>air2.getLength()){
                System.out.println("Первый самолет длиннее");
            }
            else if (air1.getLength()<air2.getLength()){
                System.out.println("Второй самолет длиннее ");}

            else{
                System.out.println("Длины самолетов равны");
            }

        }

        public void setProducer(String producer){
            this.producer = producer;
        }
        public void setYear(int year){
            this.year = year;
        }
        public void setLength(int length){
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setWeight(int weight){
            this.weight = weight;
        }
        public void setFuel(int fuel){
            this.fuel = fuel;
        }
        public int getFuel(){
            return fuel;
        }

        public void info(){
            System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
        }

        public void fillUp(int n){
            fuel+=n;
        }
    }
}