import java.util.Arrays;

public class ArraysExercises {
    private static Object Person;


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // without arrays.toString you will only get the location of where it is saved ex:[I@5a39699c
        final int PERSON = 3;

        Person[] team = new Person[PERSON];
        Person kuwan = new Person("KUWAN");
        Person brandon = new Person("brandon");
        Person keith = new Person("Keith");

team[0]=kuwan;
        team[1]=brandon;
        team[2]=keith;

    }
}
