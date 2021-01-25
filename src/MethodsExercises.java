public class MethodsExercises {
    public static int add(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * add(base, exponent - 1);
    }

    public static void main(String[] args) {

    }
}
