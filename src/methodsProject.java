import java.util.Arrays;
import java.util.Scanner;

public class methodsProject {

    public static double getLowestNumber(double[] numbersArray){
        Arrays.sort(numbersArray);

        // double[] sortArray = Arrays.sort(numbersArray);
        //double lowestNumber = numbersArray[0];
        return numbersArray[0];
    }
    public static char getMiddleCharacter(String str){
        int lengthOfString = str.length();
        //double lengthOfStringDouble = lengthOfString;
        return str.charAt((int)(lengthOfString/2.-1));
    }

    public static void getSignOfNumber(double inputNumber){
        if (inputNumber<0.0){
            System.out.println("Number is negative");
        }
        if (inputNumber>0.0){
            System.out.println("Number is positive");
        }
        if (inputNumber==0){
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Input the second number:");
        double num2 = sc.nextDouble();
        System.out.println("Input the third number:");
        double num3 = sc.nextDouble();

        double[] numberArray = {num1,num2,num3};

        //double lowestNumber = getLowestNumber(numberArray);

        System.out.println("The lowest number is " + getLowestNumber(numberArray));

        double inputNumber;
        System.out.println("Enter number:");
        inputNumber = sc.nextDouble();
        getSignOfNumber(inputNumber);


        char middleCharacter = getMiddleCharacter("benjamin");
        System.out.println(middleCharacter);





    }
}
