import java.util.*;;
public class reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num For Revrese n");
        int n=sc.nextInt();
        int reversed=0;
        while (n>0) {
            reversed=  (reversed*10) + (n % 10) ;
            n=n/10;
        }
        System.out.println("Reversed Num is : "+ reversed);
        sc.close();
    }    
}
