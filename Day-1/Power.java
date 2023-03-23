import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Base : ");
        int b = sc.nextInt();
        System.out.println("Enter a power : ");
        int p = sc.nextInt();
        int ans=1;
        for(int i=1 ; i<=b ; i++){
            ans *= b;
        }
        System.out.println(" Pow of " + b + " rais to " + p + " = " + ans);
        sc.close();
    }
}
