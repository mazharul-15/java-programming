import java.util.*;

class StudentInfo {

    private int id;
    //private String name;
    //private float gpa;

    public void setValue(int id) {
        this.id = id;
        ///this.name = name;
        //this.gpa = gpa;
    }

    public void getValue() {
        //System.out.print(this.id +" "+ this.name +" "+ this.gpa +"\n");
        System.out.println(this.id);
    }
}

public class BasicPractice {
    
    // main function
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int studentId;
        String studentName;
        float studentGPA;

        StudentInfo[] obj = new StudentInfo[4];

        /// set value to the object
        for(int i = 0; i < obj.length; i++) {
            studentId = scn.nextInt();
            //studentName = scn.nextLine();
            //studentGPA = scn.nextFloat();

            obj[i] = new StudentInfo();
            //obj[i].setValue(studentId, studentName, studentGPA);
            obj[i].setValue(studentId);
        }

        // get value for every object
        for(int i = 0; i < obj.length; i++) {
            obj[i].getValue();
        }

        scn.close();
    }
}
