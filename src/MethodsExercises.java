public class MethodsExercises {
    public static int addNumber(int num1, int num2) {


        return num1 +num2;

        }
    public static int subtractNumber(int num1, int num2) {


        return num1 - num2;

    }
    public static int multiplyNumber(int num1, int num2) {


        return num1 * num2;

    }
    public static int divideNumber(int num1, int num2) {


        return num1 / num2;

    }
    public static int modulusNumber(int num1, int num2) {


        return num1 % num2;

    }
    public static void main(String[] args) {
        System.out.println(addNumber(6,2));
        System.out.println(subtractNumber(6,2));
        System.out.println(multiplyNumber(6,2));
        System.out.println(divideNumber(6,2));
        System.out.println(modulusNumber(6,4));
    }
    }