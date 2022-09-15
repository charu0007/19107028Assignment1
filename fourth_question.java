import java.util.*;

public class fourth_question {
    public static void main(String[] args) throws Exception{

            // with using temporary variable
        Scanner src = new Scanner(System.in);
        System.out.println("Using temporary variable ");
        System.out.println("Enter First Number: ");
        int a = src.nextInt();
        System.out.println("Enter Second Number: ");
        int b = src.nextInt();
        int c = b; b = a; a = c;
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

            // without using temporary variable
        Scanner src2 = new Scanner(System.in);
        System.out.println("Without using temporary variable ");
        System.out.println("Enter First Number: ");
        int a2 = src2.nextInt();
        System.out.println("Enter Second Number: ");
        int b2 = src.nextInt();
        a2+=b2; b2=a2-b2; a2-=b2;
        System.out.println("First Number: " + a2);
        System.out.println("Second Number: " + b2);
    }
}
