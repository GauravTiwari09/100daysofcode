import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       if (age>=18) {
           System.out.println("Eligible For Voting");
       }
       else {
           System.out.println("Not Eligible");
       }

       }
    }

