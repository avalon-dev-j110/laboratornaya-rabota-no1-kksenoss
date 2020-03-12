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
    String paspSerNumber;
    String imia;
    String familia;
    String otchestvo;
    String secName;
    String bethday;
    String dataVid;
    String orgVid;
    // Создаем конструктор со всеми необходимыми параметрами
        Passport(String paspSerNumber,  String imia, String familia, String otchestvo, String secName, String bethday, String dataVid, String orgVid) {
            this.paspSerNumber = paspSerNumber;
            this.imia = imia;
             this.familia = familia;
              this.otchestvo = otchestvo;
               this.secName = secName;
                this.bethday = bethday;
                 this.dataVid = dataVid;
                  this.orgVid = orgVid;
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
