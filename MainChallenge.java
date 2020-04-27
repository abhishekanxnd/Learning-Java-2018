import java.awt.*;
import java.util.*;

public class MainChallenge {

    public static void main(String[] args) {
        //SCANNER OBJECT
        Scanner abhi = new Scanner(System.in);

        //INSTANCES OF DOG CLASS
        Dog myDog = new Dog("Brown", "Tommy", 2);
        Dog friendsDog = new Dog("White", "Lily", 1);

        System.out.println("Do you want to tease the dog? (y/n)");
        String response = abhi.next();

        if (response.equalsIgnoreCase("y")) {
            myDog.bark();  //calling first method
        }

        System.out.println("Is it the dog's birthday yet? (y/n)");
        String bdayYet = abhi.next();

        if (bdayYet.equalsIgnoreCase("y")) {
            int newAge = myDog.birthdayOfDog(myDog.age);  //calling second method
            System.out.println("Congratulations, the dog is now " + newAge + " years old.");
        }

        //calling third method

        String newHairColor = myDog.changeHairColor(myDog.hairColor);
        System.out.println("The dog has been dyed " + newHairColor);

    }
}