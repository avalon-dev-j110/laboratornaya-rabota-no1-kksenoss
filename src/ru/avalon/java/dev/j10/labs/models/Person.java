package ru.avalon.java.dev.j10.labs.models;

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

    public String name;
    public String familia;
    public String otch;
    public String secName;
    
    /*public String shortSecName[];         Переменные для массива
    public String firstSumb;
    */
        public Person(String name, String familia, String otch, String secName) { //конструктор с параметрами( надо создать второй с уменьшенным количеством параметров?)
            this.name = name + " ";
            this.familia = familia + " ";
            this.otch = otch + " ";
            this.secName = secName.charAt(0) + ". ";
                                }
 
    public String getFullName1() {
        return name + familia + otch; 
    }
 
    public String getFullName2() {
        return name + secName +familia; 
    }

    public  String getFullName3() {
        return name +familia; 
    }                

/*  Вариант с переводжом строчного имени в массив, вывод 1 симв, вариант пока не рабочий
     
     public void toArrey() {
            char[] shortSecName = secName.toCharArray();
                            this.shortSecName =shortSecName;
                                   
                                   }
        public char firtSumb = shortSecName.substring(int 0);
        */
                   
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
    //------- создание перегруженного метода 
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