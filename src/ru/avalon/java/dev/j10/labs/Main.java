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
        
        
        Address registration1 = new Address("РосСия", "СПб", "Непокоренных", "4", "201", "123456");
        Passport passportDate1 = new Passport("122545", "20.01.1990", "11.12.1997", "УФМС Росии");
        Person ivanov = new Person("Ivanov", "Ivan", "Ivanovich", null, passportDate1, registration1);
        
        System.out.println(ivanov); 
        
        System.out.println(ivanov.getfullName());
        
        System.out.println(registration1);
        
        System.out.println(passportDate1);
        
        System.out.println("----------------------------------------------------");
        
        Address registration2 = new Address("США", "Вашингтон", "strrt", "3", "241", "12312321");
        Passport passportDate2 = new Passport("654654", "12.12.90", "11.12.1998", "USA gov");
        Person smith = new Person("John", "Smith", null , "Edward", passportDate2, registration2);
        
        System.out.println(smith); 
        
        System.out.println(smith.getfullName());
        
        System.out.println(registration2);
        
        System.out.println(passportDate2);
        
        System.out.println("----------------------------------------------------");
              
        Address registration3 = new Address("СтранаХ", "ГородХ", "УлицаХ", "ЗданиеХ", "помещениеХ", "ИндексХ");
        Passport passportDate3 = new Passport("хххххх", "нн.нн.нннн", "нн.нн.нннн", "УФМС СтраныХ");
        Person doe = new Person("John", "Doe", null, null, passportDate3, registration3);
        
        System.out.println(doe); 
        
        System.out.println(doe.getfullName());
        
        System.out.println(registration3);
        
        System.out.println(passportDate3);
        
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
