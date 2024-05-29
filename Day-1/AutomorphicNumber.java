import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n , num , sq , r , t ;

        boolean equal = false ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        num = n;
        sq = n * n ;
        t = 10 ;

        while (n>0) {
            r = sq % t ;
            if (num == r) {
                equal = true;
                break;
            }
            n /= 10;
            t *= 10 ;
        }

        if (equal == true) {
            System.out.println("its automorphic no");
        }
        else{
            System.out.println("its not  automorphic no");
        }
    }
}