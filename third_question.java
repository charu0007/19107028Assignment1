import java.util.*;

public class third_question {
    public static void main(String[] args) throws Exception{
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int a = src.nextInt();
        System.out.println("Enter Divisor: ");
        int b = src.nextInt();
        System.out.println("Quotient: " + (a/b));
        System.out.println("Remainder: " + (a%b));
    }
}
