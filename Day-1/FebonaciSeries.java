import java.util.Scanner;

public class FebonaciSeries {

    static int febseries(int n){
        if (n<=1) {
            return n;    
        }
        return febseries(n-1) + febseries(n-2);
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number n :");
        n = sc.nextInt();

       System.out.println(  n + "th Fibonacci Number: " + febseries(n));
    }
}

