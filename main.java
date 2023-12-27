import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int tableSize = 10;
        int guests = Integer.parseInt(scnr.nextLine());
        int tablesFilled = guests / tableSize;
        System.out.println("Tables filled: " + tablesFilled);
    }
}
