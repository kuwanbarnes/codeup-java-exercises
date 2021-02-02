import java.util.Arrays;

public class ArraysExercises {
    private static Object Person;


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // without arrays.toString you will only get the location of where it is saved ex:[I@5a39699c
        int people = 3;

        Person[] team = new Person[people];
        Person kuwan = new Person("KUWAN");
        Person brandon = new Person("brandon");
        Person keith = new Person("Keith");
        Person person4 = new Person("keykey");

        Person[] people1 = {kuwan, brandon, keith};
        Person[] updatedPeople = addPerson(people1, person4);
        System.out.println(Arrays.toString(addPerson(people1, person4)));
//        team[0] = kuwan;
//        team[1] = brandon;
//        team[2] = keith;


        for (Person singlePerson : updatedPeople) {
            System.out.println(singlePerson.getName());
        }
    }

    public static Person[] addPerson(Person[] people1, Person newPerson) {
//        Person[] editPeople = new Person[people1.length + 1];
        Person[] editPeople = Arrays.copyOf(people1,people1.length + 1);
//        for (int i = 0; i < people1.length; i++) {
//            editPeople[i] = people1[i];
//        }
        editPeople[editPeople.length - 1] = newPerson;
        return editPeople;
    }

}

