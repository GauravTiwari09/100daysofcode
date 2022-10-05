import java.util.*;
public class AlphaQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pencil price");
        float pencil = sc.nextFloat();
        System.out.println("Pen price");
        float pen = sc.nextFloat();
        System.out.println("Eraser price");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("bill is" +total);
        // Add +18% GST on bill//
      //  float gst;
        float gst = (total*18)/100;
        total += gst;
        System.out.println(total);


    }
}
