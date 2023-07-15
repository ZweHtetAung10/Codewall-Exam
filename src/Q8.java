import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the array length = ");
        int array = scan.nextInt();
        int number [] = new int[array];
        for(int i = 0; i < number.length; i++) {
        }
        Scanner scan2 = new Scanner(System.in);
        System.out.print(" Enter number = ");
        int arrayData = scan2.nextInt();
        for (int j = 0; j < number.length; j++) {
            double average = arrayData /number.length;
            System.out.println(average + "result");
            break;
        }
    }
}
