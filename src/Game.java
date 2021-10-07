import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, would you like to create a dog or a cat? Press 1 for dog and 2 for cat");
        int animalChoice = sc.nextInt();
        String animal;
        if(animalChoice==1) {
            animal = "dog";
        }else {
            animal = "cat";
        }
        System.out.println("Ahh you would like to create a " + animal + ", what should the name of the " + animal + " be?");
        String animalName = sc.next();

        System.out.println("Okay, here is your "+ animal + " " + animalName);

        // vector for different moods
        String[] moodVector = {"Happy","Sad","Curious"};

        if(animalChoice==1){
            System.out.println(" _________\n" +
                    " ( o . o )\n" +
                    "(    ^    )");

            for (int i=0;i<10;i++ ){
                // creates tamagotchi
                Dog tamagotchi = new Dog(animalName,moodVector[getRandomNumberUsingNextInt(0,moodVector.length)],getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30));

                System.out.println("What would you now like to do?");
                System.out.println("1 - play");
                System.out.println("2 - feed");
                System.out.println("3 - sleep");
                int actionChoice = sc.nextInt();

                // performs action
                if (actionChoice==1){
                    tamagotchi.play();
                }
                if (actionChoice==2){
                    tamagotchi.feed();
                }
                if (actionChoice==3){
                    tamagotchi.sleep();
                }
            }
        }

        if(animalChoice==2){
            System.out.println(" /\\_/\\\n" +
                    "( o.o )\n" +
                    " > ^ <");

            for (int i=0;i<10;i++ ){
                // creates tamagotchi
                Cat tamagotchi = new Cat(animalName,moodVector[getRandomNumberUsingNextInt(0,moodVector.length)],getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30),getRandomNumberUsingNextInt(0,30));

                System.out.println("What would you now like to do?");
                System.out.println("1 - play");
                System.out.println("2 - feed");
                System.out.println("3 - sleep");
                int actionChoice = sc.nextInt();

                // performs action
                if (actionChoice==1){
                    tamagotchi.play();
                }
                if (actionChoice==2){
                    tamagotchi.feed();
                }
                if (actionChoice==3){
                    tamagotchi.sleep();
                }
            }
        }
    }
}
