import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which is to be divided: ");
        int a=sc.nextInt();
        System.out.println("Enter the number which will divide the above entered number: ");
        int b=sc.nextInt();
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
