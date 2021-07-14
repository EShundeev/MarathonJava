package day6;

import java.util.Random;

/*
Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать класс Student (Студент) с полем “Имя”.
Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости,
а также у преподавателя есть метод evaluate (оценить студента), принимающий в качестве аргумента студента,
и работающий следующим образом: внутри метода случайным образом генерируется число от 2 до 5,
затем в консоль выводится строка:
"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
в зависимости от значения случайно сгенерированного числа.

Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав студента в качестве аргумента метода.

 */
public class Task3 {
    public static void main(String[] args) {
    Teacher newTeach = new Teacher("Иванова Любовь Петровна", "Химия");
    Student newStud = new Student("Сидоров Иван Иванович");
    newTeach.evaluate(newStud);
    }
}

class Teacher{
    private String fio;
    private String subject;

    public Teacher(String fio, String subject){
        this.fio = fio;
        this.subject = subject;
    }
    public void evaluate(Student st){
        Random rand = new Random();
        int value = rand.nextInt(4)+2;

        String evaluetion = "";
        switch (value){
            case 2:
                evaluetion = "неудовлетворительно";
                break;
            case 3:
                evaluetion = "удовлетворительно";
                break;
            case 4:
                evaluetion = "хорошо";
                break;
            case 5:
                evaluetion = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.fio + " оценил студента с именем " + st.getStudFio() + " по предмету "+ this.subject + " на оценку "+evaluetion);
    }
}

class Student{
    private String studFio;

    public Student(String studFio){
        this.studFio = studFio;
    }
    public void setStudFio(String studFio){
        this.studFio = studFio;
    }
    public String getStudFio(){
        return studFio;
    }
}