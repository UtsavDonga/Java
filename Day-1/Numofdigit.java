import java.util.*;
public class Numofdigit {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int sum=0;
        while (n > 0) {
            sum += n%10;
            n=n/10;
        }
        System.out.println("Sum of Digit of No is : "+ sum );
        sc.close();
    }
}

// Sum of The Digit of Enterd Number