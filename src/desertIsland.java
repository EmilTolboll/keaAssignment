import java.util.Arrays;
import java.util.Scanner;

public class desertIsland {

    public static void main(String[] args) {
        String[] options =
                {"kæreste","kaffemaskine","Netflix","sofa","løbesko",
                        "guitar","slik", "hund", "bog", "øl" };
        Scanner sc = new Scanner(System.in);

        System.out.println("Hej, hvor mange svar ønsker du at give?");

        int answerAmount = sc.nextInt();
        //int answerAmount = 2;

        System.out.println(answerAmount);

        System.out.println("Hvilken ting vil du helst have med på en øde ø?\n1 kæreste \n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl");

        int[] answerCountArray = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 1;i<=answerAmount;i++){
            System.out.println("Indtast valg:");

            int answer = sc.nextInt();
            System.out.println(options[answer-1]);

            answerCountArray[answer-1] = answerCountArray[answer-1]+1;

        }
        System.out.println(Arrays.toString(answerCountArray));

        int max = Arrays.stream(answerCountArray).max().getAsInt();

        String mostPopular = "Something went wrong";

        for (int i = 0;i<answerCountArray.length;i++){
            if(answerCountArray[i]==max){
                mostPopular = options[i];
            }
        }

        System.out.println("Mest populære valg er " + mostPopular);
    }
}
