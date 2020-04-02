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
    private String country;
    private String city;
    private String street;
    private String building;
    private String room;
    private String indeks;
    
         public Address(String country, String city, String street, String building, String room, String indeks) {
             this.country = country;
             this.city = city;
             this.street = street;
             this.building = building;
             this.room = room;
             this.indeks = indeks;
                                
         }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;     
    }     
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }        
     public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }        
     public String getIndeks() {
        return indeks;
    }
    public void setindeks(String indeks) {
        this.indeks = indeks;
    }        
    @Override
          public String toString (){
             return " Cтрана " + getCountry() +  " Город " + getCity() + " Улица " 
                     + getStreet() + " Здание " + getBuilding() + " Помещение " + getRoom() + " Индекс " + getIndeks();
    }     
        
}