package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private String name;
    private String familia;
    private String otch;
    private String secName; 
    private Address address;
    private Passport passport;
    
        public Person(String name, String familia, String otch, Passport passport, Address address) { //конструктор с параметрами имя фам отч
        this.name = name;
        this.familia = familia;
        this.otch = otch;
        this.passport = passport;
        this.address = address;
        }
        
        public Person(String name, String familia, String secName, Passport passport, Address address) { //конструктор с параметрами имя фам отч
        this.name = name;
        this.familia = familia;
        this.secName = otch;
        this.passport = passport;
        this.address = address;
        }
        
        public Person(String name, String familia, Passport passport, Address registration) { //конструктор с параметрами имя фам отч
        this.name = name;
        this.familia = familia;
        this.passport = passport;
        this.address = address;
        }               
    public String getFullName1() {
        return name + familia + otch; 
    }
 
    public String getFullName2() {
        return name + secName.charAt(0)+ '.' + familia; 
    }

    public  String getFullName3() {
        return name +familia; 
    }                


      /**
     * Возврвщает полное имя человека.
     * <p>
     *+   Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     *+  Если у человека нет Отчества, но есть второе имя, то 
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     *-  Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    // ------------------------ВЫПОЛНЕНО----------------
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        //return null;
    

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
    return null;
}
}