package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String args[]) {
        
        System.out.println("тестовый вывод");

        Person ivanov = new Person("Ivan", "Ivanov", "Ivanovich", "K"); //созд оъекта с 1 методом
        String fullDataIvanov = ivanov.getFullName1();
        
        Person smith = new Person("John", "Edvard", "Smith ", "T"); //созд оъекта с 1 методом
        String fullDataSmith = smith.getFullName1();  
        
        Person john = new Person("John" , "Doe", " ", "J"); //созд оъекта с 2 методом
        String fullDataDoe = john.getFullName2();
            
        System.out.println(fullDataIvanov);
        System.out.println(fullDataSmith);
        System.out.println(fullDataDoe);
        
        Address men = new Address("Russia", "Moscow", "Lenina", "9", "4" , "111222");
        String fullAddress = men.getFullAddress();
        
        
        System.out.println(fullAddress);
        
        //создать метод - возвр имя + адрес
        
        
        
        //System.out.println(name);
// test1//
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
