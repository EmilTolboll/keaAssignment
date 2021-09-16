import java.util.Arrays;
import java.util.Scanner;

public class methodsProject {

    public static double getLowestNumber(double[] numbersArray){
        Arrays.sort(numbersArray);

        // double[] sortArray = Arrays.sort(numbersArray);
        //double lowestNumber = numbersArray[0];
        return numbersArray[0];
    }

    public static double getTriangleArea(double side1,double side2,double side3){
        double semiParameter = (side1+side2+side3)/2.;
        return Math.sqrt(semiParameter*(semiParameter-side1)*(semiParameter-side2)*(semiParameter-side3));
    }

    public static char getMiddleCharacter(String str){
        int lengthOfString = str.length();
        //double lengthOfStringDouble = lengthOfString;
        return str.charAt((int)(lengthOfString/2.-1));
    }

    public static boolean isPasswordValid(String str){
        boolean check1 = str.length()>7;
        boolean check2 = str.matches("[a-zA-Z0-9]*");
        boolean check3 = !str.contains("secret");
        boolean check4 = str.charAt(0)!='-';
        boolean[] booleanArray = {check1,check2,check3,check4};
        for(boolean b : booleanArray) if(!b) return false;
        return true;
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

    public static void printNumbers(int maximumNumber){
        for (int i = 0;i<maximumNumber;i++){
            System.out.print("[" + (i+1) + "]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1!");
        System.out.println("Input the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Input the second number:");
        double num2 = sc.nextDouble();
        System.out.println("Input the third number:");
        double num3 = sc.nextDouble();

        double[] numberArray = {num1,num2,num3};

        //double lowestNumber = getLowestNumber(numberArray);

        System.out.println("The lowest number is " + getLowestNumber(numberArray));

        System.out.println("Task 2!");
        double inputNumber;
        System.out.println("Enter number:");
        inputNumber = sc.nextDouble();
        getSignOfNumber(inputNumber);

        System.out.println("Task 3!");

        char middleCharacter = getMiddleCharacter("benjamin");
        System.out.println(middleCharacter);




        System.out.println("Task 4!");
        System.out.println("Input side-1:");
        double side1 = sc.nextDouble();
        System.out.println("Input side-2:");
        double side2 = sc.nextDouble();
        System.out.println("Input side-3:");
        double side3 = sc.nextDouble();
        System.out.println("The area of the triangle is " + getTriangleArea(side1,side2,side3));

        System.out.println("Task 5!");
        System.out.println("Please enter password:");
        String pwString = sc.next();
        System.out.println("Is password valid? " + isPasswordValid(pwString));

        System.out.println("Task 6!");

        System.out.println("Enter maximum number:");
        int maxNumber = sc.nextInt();
        printNumbers(maxNumber);
    }
}
