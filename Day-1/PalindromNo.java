import java.util.Scanner;

public class PalindromNo {
    public static void main(String[] args) {
            int n , r;
            int temp;
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number to chake whater the number is Plaindrom is or not :");
            n = sc.nextInt();
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum = sum*10 + r;
                n = n/10; 
            }
            if (temp==sum) {
                System.out.println("number Is Plaindrom");
            }
            else{
                System.out.println("number Is Not Plaindrom");
            }
        }
}