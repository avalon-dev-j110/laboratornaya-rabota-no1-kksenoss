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

        
        
        Person ivanov = new Person("Ivan", "Ivanov", "Ivanovich"); //созд оъекта с 1 методом И Ф О -ввод лишний переменных, надо откорр
        String nameIvanov = ivanov.getFullName1();
        
        Person smith = new Person("John", "Smith", "Edvard"); //созд оъекта с 2 методом И 2И Ф -ввод лишний переменных, надо откорр
        String nameSmith = smith.getFullName2();  
        
        Person john = new Person("John" , "Doe"); //тестовый
        String nameDoe = john.getFullName3();
        
            
                    
        System.out.println(nameIvanov);
        System.out.println(nameSmith);
        System.out.println(nameDoe);
                
        Address ivanovAddress = new Address("Russia", "Moscow", "Lenina", "9", "4" , "111222");
        String fullAddress = ivanovAddress.getFullAddress();
        
        Address smithAddress = new Address("USA", "NY", "Bush str", "7", "4" , "65464654");
        String fullAddress2 = smithAddress.getFullAddress();
        
        Address doeAddress = new Address("country", "city", "street", "building", "nomber" , "indecs");
        String fullAddress3 = doeAddress.getFullAddress();
        
        
        System.out.println(nameIvanov + "зарегистрирован " + fullAddress);
        System.out.println(nameSmith + "зарегистрирован " + fullAddress2);
        System.out.println(nameDoe + "зарегистрирован " + fullAddress3);
      
        //создать метод - возвр имя + адрес
        
        
        
        //System.out.println(name);
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *------------------------ВЫПОЛНЕНО----------------
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
        ------------------------ВЫПОЛНЕНО----------------
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *------------------------ВЫПОЛНЕНО----------------
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *------------------------ВЫПОЛНЕНО----------------
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *------------------------ВЫПОЛНЕНО----------------
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
        ------------------------ВЫПОЛНЕНО----------------
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }

   
}
