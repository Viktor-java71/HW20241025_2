/*
Создайте класс Student (String name, List<Integer> rates) имя, лист оценок. Ваша задача создать массив
Student и отсортировать его по среднеарифметическоиу значению оценок.
(Напомню, что бы получить среднеарифметическое значение оценок студента, нужно сумму всех оценок поделить на их количество)
 */


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Jack", List.of(9,5,3,7,6,9)),
                new Student("John", List.of(9,9,10)),
                new Student("Nina", List.of(10,9,10,9,10,9)),
                new Student("Sergey", List.of(4,5,5,4,7,3,2,4))
        };

        print(students);
        Arrays.sort(students);
        System.out.println("---------------------------------------");
        print(students);
        System.out.println("------------------------------------");
        students[0].addRate(10);
        print(students);

    }

    public static void print(Student[] students){
        for (Student student:students){
            System.out.println(student);
        }
    }
}
