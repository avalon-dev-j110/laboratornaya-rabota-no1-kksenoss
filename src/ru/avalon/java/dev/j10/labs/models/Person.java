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
    private String fullName;
    private Address address;
    private Passport passport;
    
        public Person(String name, String familia, String otch, String secName, Passport passport, Address address) { //конструктор с параметрами имя фам отч
        this.name = name;
        this.familia = familia;
        this.otch = otch;
        this.secName = secName;
        this.passport = passport;
        this.address = address;
        }
                  
        public Person(String name, String familia, Passport passport, Address address) { //конструктор с параметрами имя фам отч
        this.name = name;
        this.familia = familia;
        this.passport = passport;
        this.address = address;
        }   
         
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

                
                
        public String getfullName() {
        if (this.otch == null && this.secName == null ) {
            fullName = this.name + " " + this.familia;
           }
        else if (this.otch != null)
           fullName = this.familia + " " + this.name + " " + this.otch;
        else if (this.secName != null)
           fullName = name + " " + secName.charAt(0) + ". " + familia;
        return fullName;
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
    public Address getAddress() {
        return address;
        
}
    public void setAddress(Address address){
        this.address = address;
    }
    
    
    @Override
    public String toString (){
        return getfullName() + passport + address;}
}
   
