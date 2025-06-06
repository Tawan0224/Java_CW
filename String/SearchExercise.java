package Module2.String;

import java.util.Locale;
import java.util.Scanner;

public class SearchExercise {
    public static void main(String[] args) {
        String categories[] = {"Milk", "Matcha", "Thai", "Coffee", "Late", "Cappuccino","Cocoa", "Smoothie", "Mocha", "Juice", "Cocktail", "Soda"};
        Scanner reader = new Scanner(System.in);
        System.out.print("Taobin" + "\n" + "What do you want to drink today: ");
        String search = reader.nextLine();

        boolean found = false;
        for (String category : categories) {
            if (category.toLowerCase().startsWith(search)) {
                System.out.println(category);
                found = true;
            }
        }
        if (!found){
           System.out.println(" No drink found");
        }
    }
}
