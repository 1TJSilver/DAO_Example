package com.example.hw_8_3_1_1_dao.base;
/*id integer auto_increment primary key,
                             name char(254),
                             surname char(254),
                             age integer,
                             phone_number char(10)*/
public class Customer {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String phone_number;

    public Customer(int id, String name, String surname, int age, String phone_number){
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSurname() {
        return surname;
    }
}
