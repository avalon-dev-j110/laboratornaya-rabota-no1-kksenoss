package ru.avalon.java.dev.j10.labs.commons;
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address {
    public String country;
    public String city;
    public String street;
    public String building;
    public String room;
    public String indeks;
    
         public Address(String country, String city, String street, String building, String room, String indeks) {
             this.country = country + "/";
             this.city = city + "/";
             this.street = street + "/";
             this.building = building + "/";
             this.room = room + "/";
             this.indeks = indeks + "/";
             
                         
         }
         public String getFullAddress() {                  // возвращает полный адрес
                return country + city + street + building + room + indeks;
         }
          public String getFullAddress2() {                  // возвращает полный адрес
                return country + city + street + building + room + indeks;
         }
          public String getFullAddress3() {                  // возвращает полный адрес
                return country + city + street + building + room + indeks;
         }
}