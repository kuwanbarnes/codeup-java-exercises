public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!");
        System.out.println("GO THE FUCK AWAY!");
        int myFavoriteNumber = 30;
        String myString = "What is your favorite number?";
        double myNumber = 3.14;

        int x = 5;
//
        System.out.println("my number" + myNumber);
        System.out.println(x++);// will add 1 after the number is printed out
        System.out.println(x);//prints number +1
        System.out.println(myString);
//        System.out.println(++x); // will add to x
//        System.out.println(x);// will print ++x
        //int class cant use the reserved word :class
//String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:21)
//        int three = (int) "three";
//java: incompatible types: java.lang.String cannot be converted to int


        int a = 4;
        a = a + 5;
        int c =4+5;
        System.out.println(a);
        System.out.println(c);

        int b = 3;
        int y = 4;
        y = y * b;
        int w=3*4;
        System.out.println(y);
        System.out.println(w);

        int s = 10;
        int d = 2;
        s = s / d;
        d = d - s;
int q = 10 / 2;
int z = 2000000 - 10;
        System.out.println("start: "+ s);
        System.out.println(d);
        System.out.println(q);
        System.out.println(++z);
    }
}
