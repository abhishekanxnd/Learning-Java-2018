
public class Dog {
    //ATTRIBUTES or PROPERTIES
    String hairColor;
    String dogName;
    int age;

    //CONSTRUCTOR
    public Dog(String insertHairColor,
               String insertDogName,
               int insertAge) {
        this.hairColor = insertHairColor;
        this.dogName = insertDogName;
        this.age = insertAge;
    }

    //FUNCTIONS OR METHODS
    /* First method will output "Bark!" */
    public static void bark() {
        System.out.println("Bark!");
    }

    /* Second method will be used on dog's birthday*/
    int birthdayOfDog(int currentAge) {
        int incrementedAge = currentAge + 1;
        return incrementedAge;
    }

    /*Third method is used to dye dog's skin color*/
    String changeHairColor(String currentHairColor) {
        String newHairColor = "Black";
        return newHairColor;
    }

}
