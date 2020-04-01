package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.models.Person;
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

    private String nombPasp;
    private Person person;
    private String dataRogd;
    private String dataVid;
    private String organVid;
    
        public Passport(String nombPasp, Person person, String dataRogd, 
                String dataVid, String organVid) {
            
            this.nombPasp = nombPasp;
            this.person = person;
            this.dataRogd = dataRogd;
            this.dataVid = dataVid;
            this.organVid = organVid;
        }
                    
      
    public String getNombPasp() {
        return nombPasp;
    }
    public void setNombPasp(String nombPasp) {
        this.nombPasp = nombPasp;
    }
    public String getDataRogd() {
        return dataRogd;
    }
    public void setDataRogd(String DataRogd) {
        this.dataRogd = dataRogd;
    }
    public String getDataVid() {
        return dataVid;
    }
    public void setDataVid(String dataVid) {
        this.dataVid = dataVid;
    } 
    public String getOrganVid() {
        return organVid;
    }
    public void setOrganVid(String organVid) {
        this.organVid = organVid;
    }
    @Override
    public String toString() {
        return "Номер паспорта " + getNombPasp() + "Дата рождения " 
                + getDataRogd() + 
                "Выдан " + getDataVid() + getOrganVid();
    }
}

    //--------------------------------------------------------- 
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

