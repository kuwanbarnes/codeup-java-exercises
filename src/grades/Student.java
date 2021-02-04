package grades;

import java.util.ArrayList;

public class Student {
    private String name;
private ArrayList<Integer> grades;
    public int total=0;






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
//            for (Integer grade : grades) {
//                total = total + grade;
//            }
            for(int i=0; i<grades.size(); i++){
                total = total + grades.get(i);
            }
            return (float) (total/grades.size());

        }

    public static void main(String[] args) {
Student mygrades = new Student("kuwan");
        mygrades.addGrade(80);
        mygrades.addGrade(90);
        mygrades.addGrade(60);
        mygrades.addGrade(0);
        System.out.println(mygrades.getAverage());
        System.out.println(mygrades.getName());

    }
}
