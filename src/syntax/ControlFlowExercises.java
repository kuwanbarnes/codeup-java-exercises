package syntax;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO:Create an integer variable i with a value of 5.
        int i = 5;
        //TODO:Create a while loop that runs so long as i is less than or equal to 15
        while (i <= 15) {
            System.out.println("current value of i : " + i);
            i++;
        }
        //TODO:Each loop iteration, output the current value of i, then increment i by one.

//TODO:Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int number = 100;
//        do {
//            System.out.println((number -= 5) + " ");} while (number>=-9);
//
//        int number1 = 0;
//        do {System.out.println((number1 += 2));} while (number1<=99);

        double number2 = 2;
        do {
            System.out.printf("%.0f%n",number2);number2 = Math.pow(number2,2);
        } while (number2<1000000);



//TODO:Alter your loop to count backwards by 5's from 100 to -10.
//TODO:Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
    }
}
