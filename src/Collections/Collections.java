package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts); // [light, medium, medium, dark]
        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result=roasts.contains("dark");
        System.out.println(result ? "contains dark!" : "doesnt not contain dark");
        result = roasts.contains("espresso");
        System.out.println(result ? "contains espresso!" : "doesnt not contain espresso");
        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println("the last index of medium is: " + index);
        // 4. Check if the array list is empty
        if(roasts.isEmpty()){// true means list is empty, false means its full
            System.out.println("the roast list is empty");
        }else{
            System.out.println("the roast is not empty");
        }
        System.out.println(roasts.isEmpty() ? " 01 list empty" : " 01 list is not empty");
        // 5. Assign the array list an empty ArrayList object, and then check if empty
        roasts = new ArrayList<>();
        System.out.println(roasts.isEmpty() ? "02 list empty" : " 02 list is not empty");

        // 6. Remove the espresso roast
        roasts.add("light");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("espresso");
        System.out.println("roast looks like" + roasts);
        roasts.remove("espresso");
        System.out.println("roast now looks like" + roasts);

//        remove all lights
boolean keepgoing =true;
        while(keepgoing) {


            if (roasts.contains("light")) {
                roasts.remove("light");
            }else{
                keepgoing=false;
            }
        }
        System.out.println("after light removal "+roasts);
        // 7. Remove the element at index 2
roasts.remove(2);
        System.out.println("after removing index 2 "+ roasts);
        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();
        //put some data in the hashmap
        usernames.put("Casey","firdaynext");
        usernames.put("Daniel","danielfryar");
        usernames.put("Ferna","fmdendoza");
        System.out.println(usernames);
        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Casey","firdaynext");
        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Daniel", "danielfryar");
        usernames.putIfAbsent("Casey", "XpenguinX");
        System.out.println(usernames);


        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?

        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        usernames.replace("Daniel","danielfryardev");
        System.out.println(usernames);
        String danielVaule = usernames.get("Daniel");
        usernames.remove("Daniel");
        usernames.put("Daniel fryar", danielVaule);


        // 8. Use the .clez r() method to clear the map
        usernames.clear();
        System.out.println(usernames.isEmpty() ? "hashmap empty" : "hashmap not empty");
        // 9. Use the .isEmpty() method to verify that it was cleared

    }
}





