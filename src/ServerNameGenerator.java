import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"attractive","bald","beautiful", "chubby",
            "clean", "dazzling", "drab", "elegant", "fancy","fit"};
    private static String[] nouns= {"time","year","people","way","day","man","thing",
            "woman","life","child"};

    public static void main(String[] args) {
//String noun =get
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(11);
        System.out.println(" random adjective is : " + adjectives[randInt]);
        System.out.println( " random noun is : " + nouns[randInt]);
        System.out.println("Here is your server name:\n" +adjectives[randInt]+"-"+nouns[randInt]);
    }
//
}
