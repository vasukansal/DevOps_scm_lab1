import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter the 1st no. - ");
        int a, b;
        a = no.nextInt();
        System.out.print("Enter the 2nd no. - ");
        b = no.nextInt();
        System.out.print("Sum is - ");
        System.out.print(a + b);
    }
}