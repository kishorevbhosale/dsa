package corejava;

import java.util.Objects;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Student))
            return false;
        Student s = (Student) obj;
        boolean name = (this.name == null && s.name == null)
                || (this.name != null && this.name.equals(s.name));
        return this.age == s.age && name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class EqualHashCodeDemo {
    public static void main(String[] args) {
        Student s = new Student("sb",27);
        Student k = new Student("sb",27);
        System.out.println(s.equals(k));
        System.out.println(s.hashCode());
    }
}
