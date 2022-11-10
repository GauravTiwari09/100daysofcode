import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Value of A");
        int a =sc.nextInt();
        System.out.println("Enter the value of B");
        int b =sc.nextInt();
        System.out.println("Enter the value of C");
        int c =sc.nextInt();
        if (a>b) {
            System.out.println("A");
        }
        if (b>c) {
        System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}
