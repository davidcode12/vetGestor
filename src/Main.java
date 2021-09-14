import javax.sql.rowset.CachedRowSet;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PrintMessages welcomeMessage = new PrintMessages("Welcome to your vet gestor");
        PrintMessages menuTitle = new PrintMessages("Please chose an option, typing the number");
        PrintMessages firstOption = new PrintMessages("\t 1. Dog");
        PrintMessages secondOption = new PrintMessages("\t 2. Cat");
        PrintMessages thirdOption = new PrintMessages("\t 3. Bird");
        PrintMessages quitOption = new PrintMessages("\t 4. Quit");

        Dog dog = new Dog("Goofy", "white", 28, 4, "German shepherd\n");
        Cat cat = new Cat("Ellie","white",100,4);
        Bird bird = new Bird("Ragnar","Green", 4,2,2);

        String[] options = {firstOption.getYourMessage(), secondOption.getYourMessage(),
                thirdOption.getYourMessage(), quitOption.getYourMessage()};

        welcomeMessage.printMessageInConsole();


        boolean validationMenu = true;

        while (validationMenu){
        menuTitle.printMessageInConsole();
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }


        Scanner scanner = new Scanner(System.in);
        int numberMenu = scanner.nextByte();

        switch (numberMenu) {
            case 1:
                System.out.println("Name: "+dog.getName());
                dog.eat("Meat");
                dog.animalHealth(25);

                break;

            case 2:
                System.out.println("Name: "+cat.getName());
                cat.eat("Fish");
                cat.makeMeow();
                cat.animalHealth(10);
                break;

            case 3:
                System.out.println("Name: "+bird.getName());
                bird.eat("Fruit");
                bird.fly(12);


                break;
            case 4:
                System.out.println("Shutting up...");
                System.out.println("OFF");
                validationMenu=false;



        }
    }

    }


}
