import java.util.*;

public class first_question {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = src.nextInt();
        System.out.println("Enter Second Number: ");
        int b = src.nextInt();
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
    }
}