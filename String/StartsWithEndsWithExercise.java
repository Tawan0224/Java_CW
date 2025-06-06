package Module2.String;

import java.util.Scanner;

public class StartsWithEndsWithExercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String gender = reader.nextLine();
        System.out.print("Enter your email: ");
        String valid = reader.nextLine();

        if (gender.startsWith("Mg")){
            System.out.println("You are male.");
        }else if(gender.startsWith("Ma")){
            System.out.println("You are female");
        }

        if(valid.endsWith("@gmail.com")){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
    }
}
