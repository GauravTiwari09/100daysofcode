//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

 //
public class Q5 {
     public static void main(String[] args) {

         char a = 'u';
         if(a>='a' && a<= 'z')
             System.out.println("its a lower case");
         else if(a >= 'A' && a<= 'Z')
             System.out.println("its a upper case");

     }
}
