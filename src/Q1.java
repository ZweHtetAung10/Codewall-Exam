import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int count;
        int i;
        int number;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Number = ");
            int userInput = (scan.nextInt());
            for (number = 1; number <= userInput; number++){
                count = 0;
            for (i = 2; i <= number/2; i++){
                if (number % i == 0){
                    count++;
                    break;
                }
            }
                if (count == 0 && number != 1) {
                    System.out.println(number + " ");
                }
            }
        }
    }
}
