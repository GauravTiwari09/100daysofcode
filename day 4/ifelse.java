import java.util.*;
  public class Q3 {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number of classes held");
          int held=sc.nextInt();
          System.out.println("Enter number of class attended");
          int attended=sc.nextInt();
          float percentage = (attended*100)/held;
          if (percentage>=75) {
              System.out.println("allowed");
          }
          else {
              System.out.println("not allowed");

          }
          System.out.println("Your percentage is = " +percentage +"%");

      }
  }
