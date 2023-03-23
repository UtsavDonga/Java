import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num n for print Fectorial ");
        int n = sc.nextInt();
        int ans=1 ;
        for(int i=1 ; i<=n ; i++){
            ans*= i;
        }
        System.out.println("Fectorial of Num"+ n +"=" + ans);
        sc.close();
    }
    
}
