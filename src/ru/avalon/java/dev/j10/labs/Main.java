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

        Person ivanov = new Person("Ivan", "Ivanov", "Ivanovich", "ch"); //созд оъекта с 1 методом И Ф О -ввод лишний переменных, надо откорр
        String fullDataIvanov = ivanov.getFullName1();
        
        Person smith = new Person("John", "Edvard", "Smith ", "Kent"); //созд оъекта с 2 методом И 2И Ф -ввод лишний переменных, надо откорр
        String fullDataSmith = smith.getFullName2();  
        
        Person john = new Person("John" , "Doe", "Jack", "Iasasdh"); //тестовый
        String fullNameDoe = john.getFullName2();
        
        Person sara = new Person("Sara" , "Black", "Ivsaddiasch", "Iasdasdwvich"); //созд оъекта с 3 методом И Ф -ввод лишний переменных, надо откорр
        String fullDataSara = sara.getFullName3();
        
                    
        System.out.println(fullDataIvanov);
        System.out.println(fullDataSmith);
        
        System.out.println(fullNameDoe);
        System.out.println(fullDataSara);
        
        Address ivanovAddress = new Address("Russia", "Moscow", "Lenina", "9", "4" , "111222");
        String fullAddress = ivanovAddress.getFullAddress();
        
        Address smithAddress = new Address("USA", "NY", "Bush str", "7", "4" , "65464654");
        String fullAddress2 = smithAddress.getFullAddress2();
        
        Address saraAddress = new Address("country", "city", "street", "building", "nomber" , "indecs");
        String fullAddress3 = saraAddress.getFullAddress3();
        
        
        System.out.println(fullDataIvanov + fullAddress);
        System.out.println(fullDataSmith + fullAddress2);
        System.out.println(fullDataSara + fullAddress3);
      
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

    private static void getFullAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
