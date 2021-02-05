package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Student {
    private String name;
private ArrayList<Integer> grades;


    public ArrayList getGrades() {
        return this.grades;
    }




    public Student(String name) {
        this.grades =new ArrayList<>();
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addGrade(int grade) {


        grades.add(grade);

    }
        public  double getAverage(){
             double total=0;
//            for (Integer grade : grades) {
//                total = total + grade;
//            }
            for(int i=0; i<grades.size(); i++){
                total += this.grades.get(i);
            }
            return (total/this.grades.size());

        }


    public static void main(String[] args) {
Student newStudent = new Student("kuwan");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.addGrade(60);
        newStudent.addGrade(0);
//        System.out.println(newStudent.getAverage());
//        System.out.println(newStudent.getName());
//        System.out.println(newStudent.grades);


        Student newStudent1 = new Student("james");
        newStudent.addGrade(89);
        newStudent.addGrade(90);
        newStudent.addGrade(69);
        newStudent.addGrade(70);
//        System.out.println(newStudent.getAverage());
//        System.out.println(newStudent.getName());
//        System.out.println(newStudent.grades);

        Student newStudent2 = new Student("josh");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.addGrade(60);
        newStudent.addGrade(90);
        System.out.println(newStudent.getAverage());
        System.out.println(newStudent.getName());
        System.out.println(newStudent.grades);

//        HashMap<String, Student> usernames = new HashMap<>();
//        usernames.put("kuwan@gmail.com",newStudent);
//        usernames.put("james@gmail.com",newStudent1);
//        usernames.put("john@gmail.com",newStudent2);
//        System.out.println(usernames.get("kuwan@gmail.com"));
//        String[] keys = usernames.keySet();
//        for(String key: usernames.keySet()){
//            Student thisStudent = usernames.get(key);
////            System.out.println(thisStudent.getName());
//        }
//        System.out.println(usernames.keySet());
//        System.out.println(keys);


    }
}
