import java.util.*;

class Student {
    public int roll;
    public String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void getValue() {
        System.out.println("Roll NO: "+this.roll+" "+"Name: "+this.name);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student[] obj = new Student[5];
        
        obj[0] = new Student(12, "Rafiur Rahman");
        obj[1] = new Student(123, "Rezwan");
        obj[2] = new Student(1502034, "Xahid");
        obj[3] = new Student(34, "Rubel");
        obj[4] = new Student(87, "bapotar");

        for(int i = 0; i < obj.length; i++) {
            obj[i].getValue();
        }
     }
}
