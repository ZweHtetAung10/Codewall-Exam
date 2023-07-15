import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number = ");
            byte userInput =(scan.nextByte());

            if (userInput == 1){
                System.out.println(127);
            }
            else if (userInput == 2) {
                System.out.println(32767);
            }
        }
    }
}
