package array;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "rollNo = " + rollNo + ", name = " + name;
    }
}

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student(1, "Ram");
        students[1] = new Student(2, "Sham");

        for (Student student : students) {
            System.out.println(student);
        }
    }

}