import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = sc.nextInt();
        System.out.println("Enter the value of y:");
        y = sc.nextInt();
        System.out.println("Before swap, x = " + x + " and y = " + y);
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swap, x = " + x + " and y = " + y);
    }
}