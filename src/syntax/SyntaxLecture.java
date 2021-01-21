package syntax;

public class SyntaxLecture {

    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
        //var number =7;
        //let number =7;
        //int number =7; // = is just assignment in Java
        int number;
        // keyboard shortcut for formatting code is CMD option L
        // Assignment expressions
        number = 7;

        // Any use of ++ or --
        //pre-increment
        --number; // this wil be decremented 1 before
        System.out.println("The numbers value after pre-decrementing is " + number);
        number++; // this wil be incremented after its evaluated
        System.out.println("The numbers value after post-incrementing is " + number);

        System.out.println("Pre-decrementing number " + number + " = " + --number);
        System.out.println("Post-incrementing number " + number + " = " + number++);
        System.out.println("Now,the number = " + number);
        // Method invocations
        Math.random(); // call the random method, from the math class

        //assign random number to variable
        //number =Math.random();
        double randomNumber = Math.random();
        // Object creation expressions

        // ================== COMMENTS (s-4)
        /*
         *
         *
         *
         */
        /*hey*/
//        see JavaDocTest in docs package

        // ================== DATA TYPES (s-5, 6, 7)

        // use the smallest type needed for the job

        // primitive types...

        byte age = 125;

        System.out.println("Adding one to the byte(125):" + ++age);
        System.out.println("Adding one to the byte(125):" + ++age);
        System.out.println("Adding one to the byte(125):" + ++age);
//            age =200;
//        System.out.println(age);
        short minimumAnnualSalary = 32765;
        System.out.println("Adding one to the short(32765):" + ++minimumAnnualSalary);
        System.out.println("Adding one to the short(32766):" + ++minimumAnnualSalary);
        System.out.println("Adding one to the short(32767):" + ++minimumAnnualSalary);
        int distanceToSaturn = 1200000000;
        long numberOfHumanCells = 3000000000L; // L needed for compiler
        //access something at index 1 of a database, using long
        // books[1L]

        System.out.println(numberOfHumanCells);
        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
        System.out.println(lengthOfBacteriaInInches);
        double widthOfAtomInMeters = .00000000001;
        char seatingSection = 'M'; // must wrap in single quotes
//        boolean everythingIsAwesome = false;
//        everythingIsAwesome = true;
//        !everythingIsAwesome;// this would invert everythingIsAwesome
//        if(false){
//            System.out.println("everything is awesome!");
//        }
//        if(!everythingIsAwesome){
//            System.out.println("everything is   Not awesome!");
//        }

        // strings (not a primitive type)
//reference type data refers to location in memory
        String thisIsAString = "Hello";
        String anotherString = "Hello";
        if (thisIsAString == anotherString) {
            System.out.println("the two are equal");
        }
        if (thisIsAString == "Hello") {
            System.out.println("the two are equal comparing");
        }
        if (thisIsAString.equals("Hello")) {

        }
        System.out.println("We have a match");

//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello\nWorld");
        System.out.println("Hello");
        System.out.println("World");

        System.out.println("Hello, \"groovy\" World");
        char someLetter = 'Y';
        System.out.println(someLetter);
        //if you system out, and the console shows a result of ~@4325345
        //create string system out first char
        String myName = "Kuwan";
        System.out.println(myName.charAt(0));
        System.out.println(myName.charAt(1));
        System.out.println(myName.charAt(2));
        System.out.println(myName.charAt(3));
        System.out.println(myName.charAt(4));
        System.out.println(myName.offsetByCodePoints(0, 3));
        System.out.println(myName);
        // ================== VARIABLES (s-8)

        // declaration separate from initialization
        int favNumber;//declared the variable
        favNumber = 42;
        // declaration and initialization
        int myFaveNumber = 42;

        // ================== IDENTIFIERS AND KEYWORDS (s-9)
        //String if ="kuwan"; if is a reserved word
        // see curriculum


        // ================== CONSTANTS (s-10)

        // see curriculum
        final double CIV_MAX_DOLLARS = 2147483647;
        //TRY TO CHANGE
        //CIV_MAX_DOLLARS=3; cant change final variable
        // ================== EXPRESSIONS (s-11)

        // basically the same as JS
int firstValue =97;
int secondValue = 99;
int sumofValues = firstValue + secondValue;
int deltaValues = firstValue - secondValue;
int product = firstValue * secondValue;
int quotient = firstValue / secondValue;

        // ================== OPERATORS (s-12)

        // basically the same as JS
int reverseNumber = -72;
int oppositeDay = -reverseNumber;
int bePositive = +reverseNumber;
        System.out.println(oppositeDay);

        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT implied that it will work with no problem
        short x =8;
        int y = x;


        // EXPLICIT
        int civDollars = 20999998;
        byte civSandwich = (byte) civDollars;
        System.out.println("Making a nice civSandwich: " + civSandwich);

        // implicit casting - less to more precise (widening)

                 float num1 = 2.22F;
                 double num2 = num1;
        System.out.println(num2);
        // explicit casting - more to less explicit casting (narrowing)

                 double num3 = 3.1;
                 float num4 = (float) num3;
//
                System.out.println(num4);

    }

}