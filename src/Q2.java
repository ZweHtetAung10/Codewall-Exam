import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number = ");
            int userInput =(scan.nextInt());
            if (userInput < 0 ){
                System.out.println("Negative");
            } else if (userInput == 0) {
                System.out.println("Zero");
            } else if (userInput > 0) {
                System.out.println("Positive");
            }
        }
    }
}
