import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println(" Enter Number : ");
            int userInput = (scan.nextInt());

            String numbers[] = new String[5];
            if (userInput == 2){
                for (userInput = numbers.length; userInput == userInput*2;) {
                    System.out.println(numbers[userInput]);
                }
            }
        }
    }
}
