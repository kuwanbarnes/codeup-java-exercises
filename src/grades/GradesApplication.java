package grades;

import java.util.HashMap;
import java.util.Scanner;

public  class GradesApplication {
    public static void main(String[] args) {


        Student newStudent = new Student("kuwan");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.addGrade(60);
        newStudent.addGrade(100);
//        System.out.println(newStudent.getAverage());
//        System.out.println(newStudent.getName());
//        System.out.println(newStudent.grades);


        Student newStudent1 = new Student("james");
        newStudent1.addGrade(89);
        newStudent1.addGrade(90);
        newStudent1.addGrade(69);
        newStudent1.addGrade(70);
//        System.out.println(newStudent.getAverage());
//        System.out.println(newStudent.getName());
//        System.out.println(newStudent1);

        Student newStudent2 = new Student("josh");
        newStudent2.addGrade(80);
        newStudent2.addGrade(90);
        newStudent2.addGrade(60);
        newStudent2.addGrade(90);
//        System.out.println(newStudent.getAverage());
  //      System.out.println(newStudent.getName());
//

        HashMap<String, Student> usernames = new HashMap<>();

        usernames.put("kuwan@gmail.com", newStudent);
        usernames.put("james@gmail.com", newStudent1);
        usernames.put("john@gmail.com", newStudent2);

//        System.out.println(usernames.keySet());
//        System.out.println(usernames.size()("kuwan@gmail.com"));
 //       System.out.println(newStudent.getGrades());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        do {
            System.out.println("Here are the GitHub usernames of our students: \n" + usernames.keySet());
            System.out.println("enter the username of your choice:");
            String studentUsername = scanner.nextLine().trim();
            if (usernames.get(studentUsername) == null) {
                System.out.println("Did not match any student");
            } else {
                System.out.printf("Name: %s - Github Username: %s\n", usernames.get(studentUsername).getName(), studentUsername);
                System.out.printf("Current Average: %.2f\n", usernames.get(studentUsername).getAverage());
                System.out.printf("Would you like to see another student ? type \"no\" to exit\n");
                studentUsername = scanner.nextLine();
                if (studentUsername.equalsIgnoreCase("no")) {
                    break;
                }
//            System.out.println(usernames.get(studentUsername).getGrades());
            }
        }
            while (true) ;
        System.out.println("Goodbye, and have a wonderful day!");

    }
}