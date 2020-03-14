package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    public String dataPasp;
    public String name;
    public String familia;
    public String otch;
    public String secName;
    public String dataVid;
    public String organVid;
    
        public Passport(String dataPasp, String name, String familia, String otch, String secName, String dataVid, String organVid) {
            
            this.dataPasp = dataPasp;
            this.name = name;
            this.familia = familia;
            this.otch = otch;
            this.secName = secName;
            this.dataVid = dataVid;
            this.organVid = organVid;
            
                
                }
             public String getFullInfo() {
                 return dataPasp + name + familia + otch + secName + dataVid + organVid;
             }
             public String getName() {
                        return name;  
        }
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
