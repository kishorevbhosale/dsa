package corejava;

import java.lang.reflect.Field;
import java.util.List;

class Person{
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class ReflectionApiDemo {
    public static void main(String[] args) {
        Object person = new Person("sb", 25, "Pune");
        Field[] fields = person.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

    }
}
