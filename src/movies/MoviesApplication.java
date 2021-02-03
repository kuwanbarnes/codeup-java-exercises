package movies;

import util.Input;


public class MoviesApplication {

    //
    public static void main(String[] args) {
//use the input class to grab a choice
        Input userInput = new Input();


        int userChoice = 0;
        Movie[] allMovies = MoviesArray.findAll();
        do {
            userChoice = userInput.getInt("What would you like to do?\n" +
                            "\n" +
                            "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n" +
                            "4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category\n" +
                            "6 - view movies in the musical category\n"+
                             "\n" +
                            "Enter your choice: ");
            switch (userChoice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    showMovies(userChoice, allMovies);
                case 0:
                    break;
                default:
                    //covers anthing else
                    System.out.println("that was not a valid choice");
            }
            System.out.println(userChoice);
        } while (userChoice != 0);
        System.out.println("thank you for playing!");
    }

    public static void showMovies(int category, Movie[] allMovies) {
        //find what cat was chosen and list movies
        //"2 - animated category\n" +
        //"3 - drama category\n" +
        //"4 - horror category\n" +
        //"5 - scifi cat
        String categoryName = "";
        for (Movie thisMovie : allMovies) {
            switch (category) {
                case 1://"all"
                    System.out.println(thisMovie.getName());
                    break;
                case 2:
                    System.out.print(thisMovie.getCategory().equals("animated") ? thisMovie.getName() + "\n" : "");
                    break;
                case 3:
                    System.out.print(thisMovie.getCategory().equals("drama") ? thisMovie.getName() + "\n" : "");
                    break;
                case 4:
                    System.out.print(thisMovie.getCategory().equals("horror") ? thisMovie.getName() + "\n" : "");
                    break;
                case 5:
                    System.out.print(thisMovie.getCategory().equals("scifi") ? thisMovie.getName() + "\n" : "");
                    break;
                case 6:
                    System.out.print(thisMovie.getCategory().equals("musical") ? thisMovie.getName() + "\n" : "");

            }

        }
    }
}
